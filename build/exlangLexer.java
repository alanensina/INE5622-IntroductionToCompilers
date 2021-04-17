// Generated from exlang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, TYPE_INT=21, TYPE_FLOAT=22, TYPE_BOOLEAN=23, 
		TYPE_CHAR=24, WHILE=25, FOR=26, IF=27, ELSE=28, SWITCH=29, CASE=30, CLASS=31, 
		CONSTRUCTOR=32, FUNCTION=33, DEFAULT=34, BREAK=35, RETURN=36, CONTINUE=37, 
		ID=38, INT=39, FLOAT=40, CHAR=41, BOOL=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "TYPE_INT", "TYPE_FLOAT", "TYPE_BOOLEAN", 
			"TYPE_CHAR", "WHILE", "FOR", "IF", "ELSE", "SWITCH", "CASE", "CLASS", 
			"CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", "RETURN", "CONTINUE", 
			"ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "';'", "':'", "'='", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", "'-'", 
			"'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", "'repeat'", 
			"'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", "'function'", 
			"'default'", "'break'", "'return'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "TYPE_INT", "TYPE_FLOAT", 
			"TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "FOR", "IF", "ELSE", "SWITCH", 
			"CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", "RETURN", 
			"CONTINUE", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
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


	public exlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "exlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u012a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u00f8\n\'\f\'\16\'\u00fb\13\'"+
		"\3(\5(\u00fe\n(\3(\6(\u0101\n(\r(\16(\u0102\3)\5)\u0106\n)\3)\7)\u0109"+
		"\n)\f)\16)\u010c\13)\3)\5)\u010f\n)\3)\6)\u0112\n)\r)\16)\u0113\3*\3*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0122\n+\3,\6,\u0125\n,\r,\16,\u0126"+
		"\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\7\4\2C\\c|\5\2\62;C\\c|"+
		"\3\2\62;\b\2##,\60\62;>AC\\c|\5\2\13\f\17\17\"\"\2\u0133\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2"+
		"\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31p\3"+
		"\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37y\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u008b\3\2\2\2"+
		"/\u0091\3\2\2\2\61\u0096\3\2\2\2\63\u009b\3\2\2\2\65\u00a1\3\2\2\2\67"+
		"\u00a8\3\2\2\29\u00ab\3\2\2\2;\u00b0\3\2\2\2=\u00b7\3\2\2\2?\u00bc\3\2"+
		"\2\2A\u00c2\3\2\2\2C\u00ce\3\2\2\2E\u00d7\3\2\2\2G\u00df\3\2\2\2I\u00e5"+
		"\3\2\2\2K\u00ec\3\2\2\2M\u00f5\3\2\2\2O\u00fd\3\2\2\2Q\u0105\3\2\2\2S"+
		"\u0115\3\2\2\2U\u0121\3\2\2\2W\u0124\3\2\2\2YZ\7*\2\2Z\4\3\2\2\2[\\\7"+
		"+\2\2\\\6\3\2\2\2]^\7.\2\2^\b\3\2\2\2_`\7}\2\2`\n\3\2\2\2ab\7\177\2\2"+
		"b\f\3\2\2\2cd\7=\2\2d\16\3\2\2\2ef\7<\2\2f\20\3\2\2\2gh\7?\2\2h\22\3\2"+
		"\2\2ij\7@\2\2j\24\3\2\2\2kl\7>\2\2l\26\3\2\2\2mn\7@\2\2no\7?\2\2o\30\3"+
		"\2\2\2pq\7>\2\2qr\7?\2\2r\32\3\2\2\2st\7?\2\2tu\7?\2\2u\34\3\2\2\2vw\7"+
		"#\2\2wx\7?\2\2x\36\3\2\2\2yz\7(\2\2z{\7(\2\2{ \3\2\2\2|}\7~\2\2}~\7~\2"+
		"\2~\"\3\2\2\2\177\u0080\7-\2\2\u0080$\3\2\2\2\u0081\u0082\7/\2\2\u0082"+
		"&\3\2\2\2\u0083\u0084\7,\2\2\u0084(\3\2\2\2\u0085\u0086\7\61\2\2\u0086"+
		"*\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a"+
		",\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7n\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090.\3\2\2\2\u0091\u0092\7d\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094\u0095\7n\2\2\u0095\60\3\2\2\2\u0096"+
		"\u0097\7e\2\2\u0097\u0098\7j\2\2\u0098\u0099\7c\2\2\u0099\u009a\7t\2\2"+
		"\u009a\62\3\2\2\2\u009b\u009c\7y\2\2\u009c\u009d\7j\2\2\u009d\u009e\7"+
		"k\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0\64\3\2\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7h\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af:\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7y\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7e\2\2"+
		"\u00b5\u00b6\7j\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7c\2"+
		"\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7"+
		"e\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00cd\7t\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7w\2"+
		"\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7k\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6D\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2\u00db"+
		"\u00dc\7w\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7v\2\2\u00deF\3\2\2\2\u00df"+
		"\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7m\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb"+
		"\7p\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7w\2\2\u00f3\u00f4\7g\2\2\u00f4L\3\2\2\2\u00f5\u00f9\t\2\2\2\u00f6"+
		"\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00faN\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe"+
		"\7/\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103P\3\2\2\2\u0104\u0106\7/\2\2\u0105\u0104"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107\u0109\t\4\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\13\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0112\t\4"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114R\3\2\2\2\u0115\u0116\t\5\2\2\u0116T\3\2\2\2\u0117"+
		"\u0118\7v\2\2\u0118\u0119\7t\2\2\u0119\u011a\7w\2\2\u011a\u0122\7g\2\2"+
		"\u011b\u011c\7h\2\2\u011c\u011d\7c\2\2\u011d\u011e\7n\2\2\u011e\u011f"+
		"\7u\2\2\u011f\u0122\7g\2\2\u0120\u0122\4\62\63\2\u0121\u0117\3\2\2\2\u0121"+
		"\u011b\3\2\2\2\u0121\u0120\3\2\2\2\u0122V\3\2\2\2\u0123\u0125\t\6\2\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b,\2\2\u0129X\3\2\2\2\f\2\u00f9"+
		"\u00fd\u0102\u0105\u010a\u010e\u0113\u0121\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}