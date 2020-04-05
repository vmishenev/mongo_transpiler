grammar Sql;

sql_script
    : (sqlStatement SEMICOLON?)*
    ;

sqlStatement
    : selectStatement
    ;

selectStatement
    : SELECT selectElements
    fromClause? orderByClause? limitClause?
    ;

selectElements
    : (star='*' | selectElement ) (',' selectElement)*
    ;
fromClause
    : FROM tableList (WHERE whereExpr=expression)?
    ;
tableList:
    ID (',' ID)*
    ;

limitClause
    : LIMIT
    (
      (offset=NUMBER ',')? limit=NUMBER
      | limit=NUMBER OFFSET offset=NUMBER
    )
    | OFFSET offset=NUMBER (LIMIT limit=NUMBER)?
    ;

selectElement
    : ID
    ;

orderByClause
    : ORDER BY orderByExpression (',' orderByExpression)*
    ;

orderByExpression
    : expression order=(ASC | DESC)?
    ;
expression
    : notOperator=(NOT | '!') expression                            #notExpression
    | expression logicalOperator expression                         #logicalExpression
    | predicate                                                     #predicateExpression
    ;
predicate
    : left=expressionAtom comparisonOperator right=expressionAtom
    ;

expressionAtom
        : constant
        | ID
        ;
comparisonOperator
    : '=' | '>' | '<' | '<' '=' | '>' '='
    | '<' '>' | '!' '='
    ;
logicalOperator
    : AND | '&' '&' | XOR | OR | '|' '|'
    ;
constant
    : STRING_LITERAL
    | NUMBER
    ;

STRING_LITERAL
    : '\''.*?'\''
    ;
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
LIMIT: 'LIMIT';
OFFSET: 'OFFSET';
NOT: 'NOT';
AND: 'AND';
OR: 'OR';
XOR: 'XOR';
ORDER: 'ORDER';
BY: 'BY';
ASC: 'ASC';
DESC: 'DESC';
ID: ('_'|[a-zA-Z])('_'|[a-zA-Z0-9]|'.')*;
ID_SIMPLE:  ('_'|[a-zA-Z])('_'|[a-zA-Z0-9])*;


NUMBER
    : '-'? '0'
    | '-'? [1-9] DIGIT*
    ;

DIGIT
    : [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

SINGLE_COMMENT
    : '//' ~[\r\n]* -> channel(1)
    ;

MULTI_COMMENT
    : '/*' .*? '*/' -> channel(1)
    ;

SEMICOLON
    : ';'
    ;
DOT
    :  '.'
    ;