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
		T__17=18, T__18=19, T__19=20, T__20=21, TYPE_INT=22, TYPE_FLOAT=23, TYPE_BOOLEAN=24, 
		TYPE_CHAR=25, WHILE=26, REPEAT=27, IF=28, ELSE=29, SWITCH=30, CASE=31, 
		CLASS=32, CONSTRUCTOR=33, FUNCTION=34, DEFAULT=35, BREAK=36, RETURN=37, 
		CONTINUE=38, FOR=39, ID=40, INT=41, FLOAT=42, CHAR=43, BOOL=44, WS=45;
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
			"T__17", "T__18", "T__19", "T__20", "TYPE_INT", "TYPE_FLOAT", "TYPE_BOOLEAN", 
			"TYPE_CHAR", "WHILE", "REPEAT", "IF", "ELSE", "SWITCH", "CASE", "CLASS", 
			"CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", "RETURN", "CONTINUE", 
			"FOR", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'?'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", 
			"'-'", "'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", 
			"'repeat'", "'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", 
			"'function'", "'default'", "'break'", "'return'", "'continue'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TYPE_INT", 
			"TYPE_FLOAT", "TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "REPEAT", "IF", "ELSE", 
			"SWITCH", "CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", 
			"RETURN", "CONTINUE", "FOR", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0134\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\7)\u0102\n)\f)\16)\u0105\13)\3*\5*\u0108\n*\3*\6*\u010b\n*\r*\16*\u010c"+
		"\3+\5+\u0110\n+\3+\7+\u0113\n+\f+\16+\u0116\13+\3+\5+\u0119\n+\3+\6+\u011c"+
		"\n+\r+\16+\u011d\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u012c\n-\3.\6"+
		".\u012f\n.\r.\16.\u0130\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\b\2##,\60\62;>AC\\c|\5\2\13\f\17"+
		"\17\"\"\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5"+
		"_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21"+
		"k\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33v\3\2\2\2"+
		"\35y\3\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0082\3\2\2\2%\u0085\3\2\2\2\'"+
		"\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u0091\3\2"+
		"\2\2\61\u0097\3\2\2\2\63\u009c\3\2\2\2\65\u00a1\3\2\2\2\67\u00a7\3\2\2"+
		"\29\u00ae\3\2\2\2;\u00b1\3\2\2\2=\u00b6\3\2\2\2?\u00bd\3\2\2\2A\u00c2"+
		"\3\2\2\2C\u00c8\3\2\2\2E\u00d4\3\2\2\2G\u00dd\3\2\2\2I\u00e5\3\2\2\2K"+
		"\u00eb\3\2\2\2M\u00f2\3\2\2\2O\u00fb\3\2\2\2Q\u00ff\3\2\2\2S\u0107\3\2"+
		"\2\2U\u010f\3\2\2\2W\u011f\3\2\2\2Y\u012b\3\2\2\2[\u012e\3\2\2\2]^\7*"+
		"\2\2^\4\3\2\2\2_`\7+\2\2`\6\3\2\2\2ab\7}\2\2b\b\3\2\2\2cd\7\177\2\2d\n"+
		"\3\2\2\2ef\7=\2\2f\f\3\2\2\2gh\7.\2\2h\16\3\2\2\2ij\7<\2\2j\20\3\2\2\2"+
		"kl\7A\2\2l\22\3\2\2\2mn\7?\2\2n\24\3\2\2\2op\7@\2\2p\26\3\2\2\2qr\7>\2"+
		"\2r\30\3\2\2\2st\7@\2\2tu\7?\2\2u\32\3\2\2\2vw\7>\2\2wx\7?\2\2x\34\3\2"+
		"\2\2yz\7?\2\2z{\7?\2\2{\36\3\2\2\2|}\7#\2\2}~\7?\2\2~ \3\2\2\2\177\u0080"+
		"\7(\2\2\u0080\u0081\7(\2\2\u0081\"\3\2\2\2\u0082\u0083\7~\2\2\u0083\u0084"+
		"\7~\2\2\u0084$\3\2\2\2\u0085\u0086\7-\2\2\u0086&\3\2\2\2\u0087\u0088\7"+
		"/\2\2\u0088(\3\2\2\2\u0089\u008a\7,\2\2\u008a*\3\2\2\2\u008b\u008c\7\61"+
		"\2\2\u008c,\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7v\2\2\u0090.\3\2\2\2\u0091\u0092\7h\2\2\u0092\u0093\7n\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7d\2\2\u0098\u0099\7q\2\2\u0099\u009a\7q\2\2\u009a\u009b\7n\2\2\u009b"+
		"\62\3\2\2\2\u009c\u009d\7e\2\2\u009d\u009e\7j\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7g\2\2\u00a6\66\3\2\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad8\3\2\2\2\u00ae\u00af\7k\2"+
		"\2\u00af\u00b0\7h\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7"+
		"n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5<\3\2\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7j\2\2\u00bc>\3\2\2\2\u00bd\u00be\7e\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1@\3\2\2\2\u00c2"+
		"\u00c3\7e\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7u\2\2"+
		"\u00c6\u00c7\7u\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7q\2"+
		"\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3D\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5"+
		"\u00d6\7w\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\u00da\7k\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7p\2\2\u00dcF\3\2\2"+
		"\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"H\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7m\2\2\u00eaJ\3\2\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7t\2\2"+
		"\u00f0\u00f1\7p\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7q\2"+
		"\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7g\2\2\u00faN\3\2\2\2\u00fb\u00fc"+
		"\7h\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00feP\3\2\2\2\u00ff\u0103"+
		"\t\2\2\2\u0100\u0102\t\3\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104R\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0106\u0108\7/\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u010b\t\4\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dT\3\2\2\2\u010e\u0110\7/\2\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2\2\2\u0111\u0113\t\4"+
		"\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\13"+
		"\2\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011eV\3\2\2\2\u011f\u0120\t\5\2\2\u0120X\3\2"+
		"\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2\2\u0124\u012c"+
		"\7g\2\2\u0125\u0126\7h\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128"+
		"\u0129\7u\2\2\u0129\u012c\7g\2\2\u012a\u012c\4\62\63\2\u012b\u0121\3\2"+
		"\2\2\u012b\u0125\3\2\2\2\u012b\u012a\3\2\2\2\u012cZ\3\2\2\2\u012d\u012f"+
		"\t\6\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b.\2\2\u0133\\\3\2\2\2"+
		"\f\2\u0103\u0107\u010c\u010f\u0114\u0118\u011d\u012b\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}