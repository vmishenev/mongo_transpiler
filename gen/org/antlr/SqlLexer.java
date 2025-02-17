// Generated from /media/vadim/store2/csc/jb/translator/src/main/java/Sql.g4 by ANTLR 4.8
package org.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING_LITERAL=9, 
		SELECT=10, FROM=11, WHERE=12, LIMIT=13, OFFSET=14, NOT=15, AND=16, OR=17, 
		XOR=18, ORDER=19, BY=20, ASC=21, DESC=22, ID=23, ID_SIMPLE=24, NUMBER=25, 
		DIGIT=26, WS=27, SINGLE_COMMENT=28, MULTI_COMMENT=29, SEMICOLON=30, DOT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "STRING_LITERAL", 
			"SELECT", "FROM", "WHERE", "LIMIT", "OFFSET", "NOT", "AND", "OR", "XOR", 
			"ORDER", "BY", "ASC", "DESC", "ID", "ID_SIMPLE", "NUMBER", "DIGIT", "WS", 
			"SINGLE_COMMENT", "MULTI_COMMENT", "SEMICOLON", "DOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'!'", "'='", "'>'", "'<'", "'&'", "'|'", null, "'SELECT'", 
			"'FROM'", "'WHERE'", "'LIMIT'", "'OFFSET'", "'NOT'", "'AND'", "'OR'", 
			"'XOR'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", null, null, null, null, 
			null, null, null, "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "STRING_LITERAL", 
			"SELECT", "FROM", "WHERE", "LIMIT", "OFFSET", "NOT", "AND", "OR", "XOR", 
			"ORDER", "BY", "ASC", "DESC", "ID", "ID_SIMPLE", "NUMBER", "DIGIT", "WS", 
			"SINGLE_COMMENT", "MULTI_COMMENT", "SEMICOLON", "DOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7"+
		"\nT\n\n\f\n\16\nW\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\5\30"+
		"\u009c\n\30\3\30\7\30\u009f\n\30\f\30\16\30\u00a2\13\30\3\31\5\31\u00a5"+
		"\n\31\3\31\7\31\u00a8\n\31\f\31\16\31\u00ab\13\31\3\32\5\32\u00ae\n\32"+
		"\3\32\3\32\5\32\u00b2\n\32\3\32\3\32\7\32\u00b6\n\32\f\32\16\32\u00b9"+
		"\13\32\5\32\u00bb\n\32\3\33\3\33\3\34\6\34\u00c0\n\34\r\34\16\34\u00c1"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00ca\n\35\f\35\16\35\u00cd\13\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00d5\n\36\f\36\16\36\u00d8\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \4U\u00d6\2!\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\t\5\2C\\"+
		"aac|\7\2\60\60\62;C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2"+
		"\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2"+
		"\2\2\23Q\3\2\2\2\25Z\3\2\2\2\27a\3\2\2\2\31f\3\2\2\2\33l\3\2\2\2\35r\3"+
		"\2\2\2\37y\3\2\2\2!}\3\2\2\2#\u0081\3\2\2\2%\u0084\3\2\2\2\'\u0088\3\2"+
		"\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0095\3\2\2\2/\u009b\3\2\2\2\61\u00a4"+
		"\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67\u00bf\3\2\2\29\u00c5\3\2"+
		"\2\2;\u00d0\3\2\2\2=\u00de\3\2\2\2?\u00e0\3\2\2\2AB\7,\2\2B\4\3\2\2\2"+
		"CD\7.\2\2D\6\3\2\2\2EF\7#\2\2F\b\3\2\2\2GH\7?\2\2H\n\3\2\2\2IJ\7@\2\2"+
		"J\f\3\2\2\2KL\7>\2\2L\16\3\2\2\2MN\7(\2\2N\20\3\2\2\2OP\7~\2\2P\22\3\2"+
		"\2\2QU\7)\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2"+
		"\2\2WU\3\2\2\2XY\7)\2\2Y\24\3\2\2\2Z[\7U\2\2[\\\7G\2\2\\]\7N\2\2]^\7G"+
		"\2\2^_\7E\2\2_`\7V\2\2`\26\3\2\2\2ab\7H\2\2bc\7T\2\2cd\7Q\2\2de\7O\2\2"+
		"e\30\3\2\2\2fg\7Y\2\2gh\7J\2\2hi\7G\2\2ij\7T\2\2jk\7G\2\2k\32\3\2\2\2"+
		"lm\7N\2\2mn\7K\2\2no\7O\2\2op\7K\2\2pq\7V\2\2q\34\3\2\2\2rs\7Q\2\2st\7"+
		"H\2\2tu\7H\2\2uv\7U\2\2vw\7G\2\2wx\7V\2\2x\36\3\2\2\2yz\7P\2\2z{\7Q\2"+
		"\2{|\7V\2\2| \3\2\2\2}~\7C\2\2~\177\7P\2\2\177\u0080\7F\2\2\u0080\"\3"+
		"\2\2\2\u0081\u0082\7Q\2\2\u0082\u0083\7T\2\2\u0083$\3\2\2\2\u0084\u0085"+
		"\7Z\2\2\u0085\u0086\7Q\2\2\u0086\u0087\7T\2\2\u0087&\3\2\2\2\u0088\u0089"+
		"\7Q\2\2\u0089\u008a\7T\2\2\u008a\u008b\7F\2\2\u008b\u008c\7G\2\2\u008c"+
		"\u008d\7T\2\2\u008d(\3\2\2\2\u008e\u008f\7D\2\2\u008f\u0090\7[\2\2\u0090"+
		"*\3\2\2\2\u0091\u0092\7C\2\2\u0092\u0093\7U\2\2\u0093\u0094\7E\2\2\u0094"+
		",\3\2\2\2\u0095\u0096\7F\2\2\u0096\u0097\7G\2\2\u0097\u0098\7U\2\2\u0098"+
		"\u0099\7E\2\2\u0099.\3\2\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u00a0\3\2\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\60\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6"+
		"\u00a8\t\4\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\62\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae"+
		"\7/\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00bb\7\62\2\2\u00b0\u00b2\7/\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\t\5\2\2\u00b4\u00b6\5\65\33\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00ad\3\2\2\2\u00ba"+
		"\u00b1\3\2\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\66\3\2\2\2\u00be"+
		"\u00c0\t\7\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\34\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00cb\3\2\2"+
		"\2\u00c8\u00ca\n\b\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\b\35\3\2\u00cf:\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7,\2\2"+
		"\u00d2\u00d6\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\b\36\3\2\u00dd<\3\2\2\2\u00de\u00df\7=\2\2\u00df>\3\2"+
		"\2\2\u00e0\u00e1\7\60\2\2\u00e1@\3\2\2\2\21\2U\u009b\u009e\u00a0\u00a4"+
		"\u00a7\u00a9\u00ad\u00b1\u00b7\u00ba\u00c1\u00cb\u00d6\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}