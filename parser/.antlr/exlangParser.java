// Generated from d:\Projects\INE5622-IntroductionToCompilers\parser\exlang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, TYPE_INT=22, TYPE_FLOAT=23, TYPE_BOOLEAN=24, 
		TYPE_CHAR=25, WHILE=26, FOR=27, IF=28, ELSE=29, SWITCH=30, CASE=31, CLASS=32, 
		CONSTRUCTOR=33, FUNCTION=34, DEFAULT=35, CREATE=36, STOP=37, RETURN=38, 
		CONTINUE=39, ID=40, INT=41, WS=42;
	public static final int
		RULE_start = 0, RULE_function_definition = 1, RULE_arguments = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_switchStatement = 5, RULE_labelStatement = 6, 
		RULE_jumpStatement = 7, RULE_selectionStatement = 8, RULE_ternaryStatement = 9, 
		RULE_ternaryArguments = 10, RULE_iterStatement = 11, RULE_whileStatement = 12, 
		RULE_assignment_typed = 13, RULE_assignment = 14, RULE_types = 15, RULE_call = 16, 
		RULE_expressions = 17, RULE_expression = 18, RULE_arguments_exp = 19, 
		RULE_summ = 20, RULE_mult = 21, RULE_arguments_repeat = 22, RULE_atomic = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "function_definition", "arguments", "statements", "statement", 
			"switchStatement", "labelStatement", "jumpStatement", "selectionStatement", 
			"ternaryStatement", "ternaryArguments", "iterStatement", "whileStatement", 
			"assignment_typed", "assignment", "types", "call", "expressions", "expression", 
			"arguments_exp", "summ", "mult", "arguments_repeat", "atomic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "';'", "':'", "'?'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", 
			"'-'", "'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", 
			"'repeat'", "'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", 
			"'function'", "'default'", "'create'", "'stop'", "'return'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TYPE_INT", 
			"TYPE_FLOAT", "TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "FOR", "IF", "ELSE", 
			"SWITCH", "CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "CREATE", 
			"STOP", "RETURN", "CONTINUE", "ID", "INT", "WS"
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

	@Override
	public String getGrammarFileName() { return "exlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(exlangParser.EOF, 0); }
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(48);
				function_definition();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(exlangParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(FUNCTION);
			setState(57);
			match(ID);
			setState(58);
			match(T__0);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(59);
				arguments();
				}
			}

			setState(62);
			match(T__1);
			setState(63);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(exlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exlangParser.ID, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(66);
				match(T__2);
				setState(67);
				match(ID);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__3);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << STOP) | (1L << RETURN) | (1L << ID) | (1L << INT))) != 0)) {
					{
					{
					setState(74);
					statement();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(T__4);
				}
				break;
			case WHILE:
			case FOR:
			case IF:
			case SWITCH:
			case CASE:
			case DEFAULT:
			case STOP:
			case RETURN:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterStatementContext iterStatement() {
			return getRuleContext(IterStatementContext.class,0);
		}
		public LabelStatementContext labelStatement() {
			return getRuleContext(LabelStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				assignment();
				setState(85);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				assignment_typed();
				setState(88);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				iterStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				labelStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				expression();
				setState(95);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				call();
				setState(98);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(exlangParser.CASE, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__3);
			setState(103);
			match(CASE);
			setState(104);
			atomic();
			setState(105);
			match(T__6);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				statements();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << STOP) | (1L << RETURN) | (1L << ID) | (1L << INT))) != 0) );
			setState(111);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CASE() { return getToken(exlangParser.CASE, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(exlangParser.DEFAULT, 0); }
		public LabelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelStatement; }
	}

	public final LabelStatementContext labelStatement() throws RecognitionException {
		LabelStatementContext _localctx = new LabelStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_labelStatement);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ID);
				setState(114);
				match(T__6);
				setState(115);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(CASE);
				setState(117);
				atomic();
				setState(118);
				match(T__6);
				setState(119);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(DEFAULT);
				setState(122);
				match(T__6);
				setState(123);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(exlangParser.STOP, 0); }
		public TerminalNode RETURN() { return getToken(exlangParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jumpStatement);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(STOP);
				setState(127);
				match(T__5);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(RETURN);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==INT) {
					{
					setState(129);
					expression();
					}
				}

				setState(132);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(exlangParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(exlangParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(exlangParser.SWITCH, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<SwitchStatementContext> switchStatement() {
			return getRuleContexts(SwitchStatementContext.class);
		}
		public SwitchStatementContext switchStatement(int i) {
			return getRuleContext(SwitchStatementContext.class,i);
		}
		public TernaryStatementContext ternaryStatement() {
			return getRuleContext(TernaryStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectionStatement);
		try {
			int _alt;
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(IF);
				setState(136);
				match(T__0);
				setState(137);
				expression();
				setState(138);
				match(T__1);
				setState(139);
				statements();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(140);
					match(ELSE);
					setState(141);
					statements();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(SWITCH);
				setState(145);
				match(T__0);
				setState(146);
				atomic();
				setState(147);
				match(T__1);
				setState(149); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(148);
						switchStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(151); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ID:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				ternaryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TernaryArgumentsContext> ternaryArguments() {
			return getRuleContexts(TernaryArgumentsContext.class);
		}
		public TernaryArgumentsContext ternaryArguments(int i) {
			return getRuleContext(TernaryArgumentsContext.class,i);
		}
		public TernaryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryStatement; }
	}

	public final TernaryStatementContext ternaryStatement() throws RecognitionException {
		TernaryStatementContext _localctx = new TernaryStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ternaryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expression();
			setState(157);
			match(T__7);
			setState(158);
			ternaryArguments();
			setState(159);
			match(T__6);
			setState(160);
			ternaryArguments();
			setState(161);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TernaryArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryArguments; }
	}

	public final TernaryArgumentsContext ternaryArguments() throws RecognitionException {
		TernaryArgumentsContext _localctx = new TernaryArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ternaryArguments);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(exlangParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(exlangParser.FOR, 0); }
		public Arguments_repeatContext arguments_repeat() {
			return getRuleContext(Arguments_repeatContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStatement; }
	}

	public final IterStatementContext iterStatement() throws RecognitionException {
		IterStatementContext _localctx = new IterStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_iterStatement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(WHILE);
				setState(168);
				match(T__0);
				setState(169);
				expression();
				setState(170);
				match(T__1);
				setState(171);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(FOR);
				setState(174);
				match(T__0);
				setState(175);
				arguments_repeat();
				setState(176);
				match(T__1);
				setState(177);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__3);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << STOP) | (1L << RETURN) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(182);
				statement();
				}
			}

			setState(185);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_typedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_typedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_typed; }
	}

	public final Assignment_typedContext assignment_typed() throws RecognitionException {
		Assignment_typedContext _localctx = new Assignment_typedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_typed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			match(T__6);
			setState(189);
			types();
			setState(190);
			match(T__8);
			setState(191);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			match(T__8);
			setState(195);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(exlangParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(exlangParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(exlangParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(exlangParser.TYPE_CHAR, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_FLOAT) | (1L << TYPE_BOOLEAN) | (1L << TYPE_CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(T__0);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(201);
				expressions();
				}
			}

			setState(204);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expression();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(207);
				match(T__2);
				setState(208);
				expression();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SummContext left;
		public Token op;
		public ExpressionContext right;
		public SummContext summ() {
			return getRuleContext(SummContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((ExpressionContext)_localctx).left = summ();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					((ExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
						((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(216);
					((ExpressionContext)_localctx).right = expression();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_expContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arguments_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_exp; }
	}

	public final Arguments_expContext arguments_exp() throws RecognitionException {
		Arguments_expContext _localctx = new Arguments_expContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arguments_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			expression();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(223);
				match(T__2);
				setState(224);
				expression();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SummContext extends ParserRuleContext {
		public MultContext left;
		public Token op;
		public SummContext right;
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public List<SummContext> summ() {
			return getRuleContexts(SummContext.class);
		}
		public SummContext summ(int i) {
			return getRuleContext(SummContext.class,i);
		}
		public SummContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summ; }
	}

	public final SummContext summ() throws RecognitionException {
		SummContext _localctx = new SummContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_summ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((SummContext)_localctx).left = mult();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					((SummContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
						((SummContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(232);
					((SummContext)_localctx).right = summ();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public AtomicContext left;
		public Token op;
		public MultContext right;
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((MultContext)_localctx).left = atomic();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					((MultContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
						((MultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(240);
					((MultContext)_localctx).right = mult();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_repeatContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(exlangParser.INT, 0); }
		public Arguments_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_repeat; }
	}

	public final Arguments_repeatContext arguments_repeat() throws RecognitionException {
		Arguments_repeatContext _localctx = new Arguments_repeatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arguments_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public TerminalNode INT() { return getToken(exlangParser.INT, 0); }
		public Arguments_expContext arguments_exp() {
			return getRuleContext(Arguments_expContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atomic);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__0);
				setState(252);
				arguments_exp();
				setState(253);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				call();
				setState(256);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3?\n\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\7\5N\n\5\f\5\16\5"+
		"Q\13\5\3\5\3\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\6\7n\n\7\r\7\16\7o\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3"+
		"\t\3\t\5\t\u0085\n\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0091\n\n\3\n\3\n\3\n\3\n\3\n\6\n\u0098\n\n\r\n\16\n\u0099\3\n\5\n\u009d"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a8\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\5\16"+
		"\u00ba\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00cd\n\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u00d4\n\23\f\23\16\23\u00d7\13\23\3\24\3\24\3\24\7\24\u00dc\n\24\f\24"+
		"\16\24\u00df\13\24\3\25\3\25\3\25\7\25\u00e4\n\25\f\25\16\25\u00e7\13"+
		"\25\3\26\3\26\3\26\7\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\27\3\27\3"+
		"\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0105\n\31\3\31\2\2\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\30\33\3\2\f\23\3\2"+
		"\24\25\3\2\26\27\2\u010f\2\65\3\2\2\2\4:\3\2\2\2\6C\3\2\2\2\bT\3\2\2\2"+
		"\nf\3\2\2\2\fh\3\2\2\2\16~\3\2\2\2\20\u0087\3\2\2\2\22\u009c\3\2\2\2\24"+
		"\u009e\3\2\2\2\26\u00a7\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00bd"+
		"\3\2\2\2\36\u00c3\3\2\2\2 \u00c7\3\2\2\2\"\u00c9\3\2\2\2$\u00d0\3\2\2"+
		"\2&\u00d8\3\2\2\2(\u00e0\3\2\2\2*\u00e8\3\2\2\2,\u00f0\3\2\2\2.\u00f8"+
		"\3\2\2\2\60\u0104\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\2\2\39\3\3\2\2"+
		"\2:;\7$\2\2;<\7*\2\2<>\7\3\2\2=?\5\6\4\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2"+
		"@A\7\4\2\2AB\5\b\5\2B\5\3\2\2\2CH\7*\2\2DE\7\5\2\2EG\7*\2\2FD\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KO\7\6\2\2LN\5\n\6"+
		"\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RU\7\7\2"+
		"\2SU\5\n\6\2TK\3\2\2\2TS\3\2\2\2U\t\3\2\2\2VW\5\36\20\2WX\7\b\2\2Xg\3"+
		"\2\2\2YZ\5\34\17\2Z[\7\b\2\2[g\3\2\2\2\\g\5\22\n\2]g\5\30\r\2^g\5\16\b"+
		"\2_g\5\20\t\2`a\5&\24\2ab\7\b\2\2bg\3\2\2\2cd\5\"\22\2de\7\b\2\2eg\3\2"+
		"\2\2fV\3\2\2\2fY\3\2\2\2f\\\3\2\2\2f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2f`\3"+
		"\2\2\2fc\3\2\2\2g\13\3\2\2\2hi\7\6\2\2ij\7!\2\2jk\5\60\31\2km\7\t\2\2"+
		"ln\5\b\5\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\7\2\2"+
		"r\r\3\2\2\2st\7*\2\2tu\7\t\2\2u\177\5\n\6\2vw\7!\2\2wx\5\60\31\2xy\7\t"+
		"\2\2yz\5\n\6\2z\177\3\2\2\2{|\7%\2\2|}\7\t\2\2}\177\5\n\6\2~s\3\2\2\2"+
		"~v\3\2\2\2~{\3\2\2\2\177\17\3\2\2\2\u0080\u0081\7\'\2\2\u0081\u0088\7"+
		"\b\2\2\u0082\u0084\7(\2\2\u0083\u0085\5&\24\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\b\2\2\u0087\u0080\3\2"+
		"\2\2\u0087\u0082\3\2\2\2\u0088\21\3\2\2\2\u0089\u008a\7\36\2\2\u008a\u008b"+
		"\7\3\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\4\2\2\u008d\u0090\5\b\5\2\u008e"+
		"\u008f\7\37\2\2\u008f\u0091\5\b\5\2\u0090\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u009d\3\2\2\2\u0092\u0093\7 \2\2\u0093\u0094\7\3\2\2\u0094"+
		"\u0095\5\60\31\2\u0095\u0097\7\4\2\2\u0096\u0098\5\f\7\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009d\5\24\13\2\u009c\u0089\3\2\2\2\u009c\u0092\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\5&\24\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5"+
		"\26\f\2\u00a3\u00a4\7\b\2\2\u00a4\25\3\2\2\2\u00a5\u00a8\5&\24\2\u00a6"+
		"\u00a8\5\"\22\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\27\3\2\2"+
		"\2\u00a9\u00aa\7\34\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5&\24\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00b6\3\2\2\2\u00af\u00b0\7"+
		"\35\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3\7\4\2\2\u00b3"+
		"\u00b4\5\b\5\2\u00b4\u00b6\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00af\3\2"+
		"\2\2\u00b6\31\3\2\2\2\u00b7\u00b9\7\6\2\2\u00b8\u00ba\5\n\6\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\7\2\2\u00bc"+
		"\33\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\5 \21\2"+
		"\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5&\24\2\u00c2\35\3\2\2\2\u00c3\u00c4"+
		"\7*\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\5&\24\2\u00c6\37\3\2\2\2\u00c7"+
		"\u00c8\t\2\2\2\u00c8!\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cc\7\3\2\2\u00cb"+
		"\u00cd\5$\23\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cf\7\4\2\2\u00cf#\3\2\2\2\u00d0\u00d5\5&\24\2\u00d1\u00d2"+
		"\7\5\2\2\u00d2\u00d4\5&\24\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d8\u00dd\5*\26\2\u00d9\u00da\t\3\2\2\u00da\u00dc\5&\24\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\'\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e5\5&\24\2\u00e1\u00e2\7\5\2\2"+
		"\u00e2\u00e4\5&\24\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00ed\5,\27\2\u00e9\u00ea\t\4\2\2\u00ea\u00ec\5*\26\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"+\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\5\60\31\2\u00f1\u00f2\t\5\2"+
		"\2\u00f2\u00f4\5,\27\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7+\2\2\u00f9/\3\2\2\2\u00fa\u0105\7*\2\2\u00fb\u0105\7+\2\2\u00fc"+
		"\u00fd\7*\2\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100\7\4"+
		"\2\2\u0100\u0105\3\2\2\2\u0101\u0102\5\"\22\2\u0102\u0103\7\b\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fc\3\2"+
		"\2\2\u0104\u0101\3\2\2\2\u0105\61\3\2\2\2\31\65>HOTfo~\u0084\u0087\u0090"+
		"\u0099\u009c\u00a7\u00b5\u00b9\u00cc\u00d5\u00dd\u00e5\u00ed\u00f5\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}