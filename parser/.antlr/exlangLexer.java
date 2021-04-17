// Generated from /home/alan/Github/INE5622-IntroductionToCompilers/parser/exlang.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, TYPE_INT=23, TYPE_FLOAT=24, 
		TYPE_BOOLEAN=25, TYPE_CHAR=26, WHILE=27, REPEAT=28, IF=29, ELSE=30, SWITCH=31, 
		CASE=32, CLASS=33, CONSTRUCTOR=34, FUNCTION=35, DEFAULT=36, BREAK=37, 
		RETURN=38, CONTINUE=39, FOR=40, ID=41, INT=42, FLOAT=43, CHAR=44, BOOL=45, 
		WS=46;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "TYPE_INT", "TYPE_FLOAT", 
			"TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "REPEAT", "IF", "ELSE", "SWITCH", 
			"CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", "RETURN", 
			"CONTINUE", "FOR", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'{'", "'}'", "';'", "','", "':'", "'?'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", 
			"'+'", "'-'", "'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", 
			"'repeat'", "'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", 
			"'function'", "'default'", "'break'", "'return'", "'continue'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "TYPE_INT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3"+
		"*\7*\u0106\n*\f*\16*\u0109\13*\3+\5+\u010c\n+\3+\6+\u010f\n+\r+\16+\u0110"+
		"\3,\5,\u0114\n,\3,\7,\u0117\n,\f,\16,\u011a\13,\3,\5,\u011d\n,\3,\6,\u0120"+
		"\n,\r,\16,\u0121\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0130\n.\3/\6"+
		"/\u0133\n/\r/\16/\u0134\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\b\2##,\60\62;>AC\\c|\5\2\13"+
		"\f\17\17\"\"\2\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2"+
		"\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31u\3\2"+
		"\2\2\33w\3\2\2\2\35z\3\2\2\2\37}\3\2\2\2!\u0080\3\2\2\2#\u0083\3\2\2\2"+
		"%\u0086\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3"+
		"\2\2\2/\u0091\3\2\2\2\61\u0095\3\2\2\2\63\u009b\3\2\2\2\65\u00a0\3\2\2"+
		"\2\67\u00a5\3\2\2\29\u00ab\3\2\2\2;\u00b2\3\2\2\2=\u00b5\3\2\2\2?\u00ba"+
		"\3\2\2\2A\u00c1\3\2\2\2C\u00c6\3\2\2\2E\u00cc\3\2\2\2G\u00d8\3\2\2\2I"+
		"\u00e1\3\2\2\2K\u00e9\3\2\2\2M\u00ef\3\2\2\2O\u00f6\3\2\2\2Q\u00ff\3\2"+
		"\2\2S\u0103\3\2\2\2U\u010b\3\2\2\2W\u0113\3\2\2\2Y\u0123\3\2\2\2[\u012f"+
		"\3\2\2\2]\u0132\3\2\2\2_`\7*\2\2`\4\3\2\2\2ab\7+\2\2b\6\3\2\2\2cd\7\60"+
		"\2\2d\b\3\2\2\2ef\7}\2\2f\n\3\2\2\2gh\7\177\2\2h\f\3\2\2\2ij\7=\2\2j\16"+
		"\3\2\2\2kl\7.\2\2l\20\3\2\2\2mn\7<\2\2n\22\3\2\2\2op\7A\2\2p\24\3\2\2"+
		"\2qr\7?\2\2r\26\3\2\2\2st\7@\2\2t\30\3\2\2\2uv\7>\2\2v\32\3\2\2\2wx\7"+
		"@\2\2xy\7?\2\2y\34\3\2\2\2z{\7>\2\2{|\7?\2\2|\36\3\2\2\2}~\7?\2\2~\177"+
		"\7?\2\2\177 \3\2\2\2\u0080\u0081\7#\2\2\u0081\u0082\7?\2\2\u0082\"\3\2"+
		"\2\2\u0083\u0084\7(\2\2\u0084\u0085\7(\2\2\u0085$\3\2\2\2\u0086\u0087"+
		"\7~\2\2\u0087\u0088\7~\2\2\u0088&\3\2\2\2\u0089\u008a\7-\2\2\u008a(\3"+
		"\2\2\2\u008b\u008c\7/\2\2\u008c*\3\2\2\2\u008d\u008e\7,\2\2\u008e,\3\2"+
		"\2\2\u008f\u0090\7\61\2\2\u0090.\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7v\2\2\u0094\60\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7q\2\2\u0098\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a"+
		"\62\3\2\2\2\u009b\u009c\7d\2\2\u009c\u009d\7q\2\2\u009d\u009e\7q\2\2\u009e"+
		"\u009f\7n\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7j\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\u00a7\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa8\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7r\2"+
		"\2\u00ae\u00af\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1:\3\2"+
		"\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4<\3\2\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		">\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7j\2\2\u00c0@\3\2\2\2\u00c1"+
		"\u00c2\7e\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2"+
		"\u00c5B\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7c\2"+
		"\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7u\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7"+
		"e\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7e\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7F\3\2\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7e\2\2"+
		"\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7q\2\2\u00df\u00e0"+
		"\7p\2\2\u00e0H\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7h\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8J\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7m\2\2\u00eeL\3\2\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2"+
		"\u00f3\u00f4\7t\2\2\u00f4\u00f5\7p\2\2\u00f5N\3\2\2\2\u00f6\u00f7\7e\2"+
		"\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"P\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102"+
		"R\3\2\2\2\u0103\u0107\t\2\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2"+
		"\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108T\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7/\2\2\u010b\u010a\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\t\4\2\2\u010e\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"V\3\2\2\2\u0112\u0114\7/\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0118\3\2\2\2\u0115\u0117\t\4\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011d\13\2\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\t\4\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122X\3\2\2\2"+
		"\u0123\u0124\t\5\2\2\u0124Z\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t"+
		"\2\2\u0127\u0128\7w\2\2\u0128\u0130\7g\2\2\u0129\u012a\7h\2\2\u012a\u012b"+
		"\7c\2\2\u012b\u012c\7n\2\2\u012c\u012d\7u\2\2\u012d\u0130\7g\2\2\u012e"+
		"\u0130\4\62\63\2\u012f\u0125\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012e\3"+
		"\2\2\2\u0130\\\3\2\2\2\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\b/\2\2\u0137^\3\2\2\2\f\2\u0107\u010b\u0110\u0113\u0118\u011c\u0121"+
		"\u012f\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}