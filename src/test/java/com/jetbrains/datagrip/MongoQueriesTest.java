package com.jetbrains.datagrip;


import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class MongoQueriesTest {



    @Property(trials = 5)
    public void testProjection(@From(IdStringGenerator.class) String collectionName) {
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM "+collectionName)), removeWhiteSpaces("db."+collectionName+".find({})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT name, surname FROM "+collectionName)), removeWhiteSpaces("db."+collectionName+".find({}, {name: 1, surname: 1})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT test FROM "+collectionName)), removeWhiteSpaces("db."+collectionName+".find({}, {test: 1})"));
    }
    @Test
    void testLimitOffset() {
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM collection OFFSET 5 LIMIT 10")), removeWhiteSpaces("db.collection.find({}).skip(5).limit(10)"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM collection LIMIT 10")), removeWhiteSpaces("db.collection.find({}).limit(10)"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM collection LIMIT 10 OFFSET 1")), removeWhiteSpaces("db.collection.find({}).skip(1).limit(10)"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM collection LIMIT 20,8")), removeWhiteSpaces("db.collection.find({}).skip(20).limit(8)"));
    }

    @Test
    void testWhere() {
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM customers WHERE name <> 'Vasya'")), removeWhiteSpaces("db.customers.find({name: {$neq: 'Vasya'}})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM customers WHERE age > 22 AND name = 'Vasya'")), removeWhiteSpaces("db.customers.find({age: {$gt: 22}, name: {$eq: 'Vasya'}})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM customers WHERE age < 22 AND name != 'Vasya'")), removeWhiteSpaces("db.customers.find({age: {$lt: 22}, name: {$neq: 'Vasya'}})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM customers WHERE age <= 22 AND age >= 5")), removeWhiteSpaces("db.customers.find({age: {$lte: 22}, age: {$gte: 5}})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM customers WHERE age < 22 AND age > 10 AND name != 'Vasya'")), removeWhiteSpaces("db.customers.find({age: {$lt: 22}, age: {$gt: 10}, name: {$neq: 'Vasya'}})"));
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT * FROM customers WHERE age < 22 AND age > 10 AND name != 'Vasya' AND name != 'Peter'")), removeWhiteSpaces("db.customers.find({age: {$lt: 22}, age: {$gt: 10}, name: {$neq: 'Vasya'}, name: {$neq: 'Peter'}})"));
    }
    @Test
    void testComplex() {
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT name, surname  FROM testColl WHERE age > 22 AND name = 'Vasya' OFFSET 5 LIMIT 10")),
                removeWhiteSpaces("db.testColl.find({age:{$gt:22},name:{$eq:'Vasya'}}, {name:1,surname:1}).skip(5).limit(10)"));

    }

    @Test
    void testWithDot() {
        assertEquals(removeWhiteSpaces(Main.transpile("SELECT person.name, person.surname  FROM testColl WHERE person.age > 22 AND person.name = 'Vasya'")),
                removeWhiteSpaces("db.testColl.find({person.age:{$gt:22},person.name:{$eq:'Vasya'}}, {person.name:1,person.surname:1})"));
    }
    public static String removeWhiteSpaces(String in) {
        return in.replaceAll("\\s+", "");
    }
}
