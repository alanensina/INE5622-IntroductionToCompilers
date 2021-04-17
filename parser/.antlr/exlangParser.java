// Generated from /home/alan/Github/INE5622-IntroductionToCompilers/parser/exlang.g4 by ANTLR 4.8
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
		CONSTRUCTOR=33, FUNCTION=34, DEFAULT=35, BREAK=36, RETURN=37, CONTINUE=38, 
		ID=39, INT=40, FLOAT=41, CHAR=42, BOOL=43, WS=44;
	public static final int
		RULE_start = 0, RULE_function_definition = 1, RULE_class_definition = 2, 
		RULE_class_statements = 3, RULE_constructor = 4, RULE_arguments = 5, RULE_statements = 6, 
		RULE_statement = 7, RULE_switchStatement = 8, RULE_labelStatement = 9, 
		RULE_jumpStatement = 10, RULE_selectionStatement = 11, RULE_ternaryArguments = 12, 
		RULE_iterStatement = 13, RULE_whileStatement = 14, RULE_assignments = 15, 
		RULE_assignment_typed = 16, RULE_assignment = 17, RULE_assignment_change = 18, 
		RULE_types = 19, RULE_call = 20, RULE_expressions = 21, RULE_expression = 22, 
		RULE_arguments_exp = 23, RULE_summ = 24, RULE_mult = 25, RULE_arguments_repeat = 26, 
		RULE_atomic = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "function_definition", "class_definition", "class_statements", 
			"constructor", "arguments", "statements", "statement", "switchStatement", 
			"labelStatement", "jumpStatement", "selectionStatement", "ternaryArguments", 
			"iterStatement", "whileStatement", "assignments", "assignment_typed", 
			"assignment", "assignment_change", "types", "call", "expressions", "expression", 
			"arguments_exp", "summ", "mult", "arguments_repeat", "atomic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'?'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", 
			"'-'", "'*'", "'/'", "'int'", "'float'", "'bool'", "'char'", "'while'", 
			"'repeat'", "'if'", "'else'", "'switch'", "'case'", "'class'", "'constructor'", 
			"'function'", "'default'", "'break'", "'return'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TYPE_INT", 
			"TYPE_FLOAT", "TYPE_BOOLEAN", "TYPE_CHAR", "WHILE", "FOR", "IF", "ELSE", 
			"SWITCH", "CASE", "CLASS", "CONSTRUCTOR", "FUNCTION", "DEFAULT", "BREAK", 
			"RETURN", "CONTINUE", "ID", "INT", "FLOAT", "CHAR", "BOOL", "WS"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(56);
				function_definition();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
			setState(64);
			match(FUNCTION);
			setState(65);
			match(ID);
			setState(66);
			match(T__0);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(67);
				arguments();
				}
			}

			setState(70);
			match(T__1);
			setState(71);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(exlangParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public Class_statementsContext class_statements() {
			return getRuleContext(Class_statementsContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(CLASS);
			setState(74);
			match(ID);
			setState(75);
			match(T__2);
			setState(76);
			class_statements();
			setState(77);
			match(T__3);
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

	public static class Class_statementsContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public Class_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statements; }
	}

	public final Class_statementsContext class_statements() throws RecognitionException {
		Class_statementsContext _localctx = new Class_statementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_statements);
		int _la;
		try {
			int _alt;
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(79);
					assignment();
					}
				}

				setState(82);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(83);
					assignment_typed();
					}
				}

				setState(86);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRUCTOR) {
					{
					setState(87);
					constructor();
					}
				}

				setState(90);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(91);
						function_definition();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(97);
				match(T__4);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(exlangParser.CONSTRUCTOR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CONSTRUCTOR);
			setState(101);
			match(T__0);
			setState(102);
			arguments();
			setState(103);
			match(T__1);
			setState(104);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(105);
					statement();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(111);
			match(T__3);
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
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(114);
				match(T__5);
				setState(115);
				match(ID);
				}
				}
				setState(120);
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
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__2);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					{
					setState(122);
					statement();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__3);
				}
				break;
			case WHILE:
			case FOR:
			case IF:
			case SWITCH:
			case CASE:
			case DEFAULT:
			case BREAK:
			case RETURN:
			case ID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				assignments();
				setState(133);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				iterStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				labelStatement();
				setState(138);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				jumpStatement();
				setState(141);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				expression();
				setState(144);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				call();
				setState(147);
				match(T__4);
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
		enterRule(_localctx, 16, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__2);
			setState(152);
			match(CASE);
			setState(153);
			atomic();
			setState(154);
			match(T__6);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				statements();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0) );
			setState(160);
			match(T__3);
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
		enterRule(_localctx, 18, RULE_labelStatement);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__6);
				setState(164);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(CASE);
				setState(166);
				atomic();
				setState(167);
				match(T__6);
				setState(168);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(DEFAULT);
				setState(171);
				match(T__6);
				setState(172);
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
		public TerminalNode BREAK() { return getToken(exlangParser.BREAK, 0); }
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
		enterRule(_localctx, 20, RULE_jumpStatement);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(BREAK);
				setState(176);
				match(T__4);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(RETURN);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					setState(178);
					expression();
					}
				}

				setState(181);
				match(T__4);
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
		public List<TernaryArgumentsContext> ternaryArguments() {
			return getRuleContexts(TernaryArgumentsContext.class);
		}
		public TernaryArgumentsContext ternaryArguments(int i) {
			return getRuleContext(TernaryArgumentsContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectionStatement);
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IF);
				setState(185);
				match(T__0);
				setState(186);
				expression();
				setState(187);
				match(T__1);
				setState(188);
				statements();
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(189);
					match(ELSE);
					setState(190);
					statements();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(SWITCH);
				setState(194);
				match(T__0);
				setState(195);
				atomic();
				setState(196);
				match(T__1);
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(197);
						switchStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				expression();
				setState(203);
				match(T__7);
				setState(204);
				ternaryArguments();
				setState(205);
				match(T__6);
				setState(206);
				ternaryArguments();
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
		enterRule(_localctx, 24, RULE_ternaryArguments);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
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
		enterRule(_localctx, 26, RULE_iterStatement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(WHILE);
				setState(215);
				match(T__0);
				setState(216);
				expression();
				setState(217);
				match(T__1);
				setState(218);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(FOR);
				setState(221);
				match(T__0);
				setState(222);
				arguments_repeat();
				setState(223);
				match(T__1);
				setState(224);
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
		enterRule(_localctx, 28, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__2);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(229);
				statement();
				}
			}

			setState(232);
			match(T__3);
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

	public static class AssignmentsContext extends ParserRuleContext {
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_changeContext assignment_change() {
			return getRuleContext(Assignment_changeContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignments);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				assignment_typed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				assignment_change();
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
		enterRule(_localctx, 32, RULE_assignment_typed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(240);
			match(T__6);
			setState(241);
			types();
			setState(242);
			match(T__8);
			setState(243);
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
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(T__8);
			setState(247);
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

	public static class Assignment_changeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(exlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exlangParser.ID, i);
		}
		public Assignment_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_change; }
	}

	public final Assignment_changeContext assignment_change() throws RecognitionException {
		Assignment_changeContext _localctx = new Assignment_changeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_change);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(T__8);
			setState(251);
			match(ID);
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
		enterRule(_localctx, 38, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 40, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
			setState(256);
			match(T__0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(257);
				expressions();
				}
			}

			setState(260);
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
		enterRule(_localctx, 42, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			expression();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(263);
				match(T__5);
				setState(264);
				expression();
				}
				}
				setState(269);
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
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((ExpressionContext)_localctx).left = summ();
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
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
					setState(272);
					((ExpressionContext)_localctx).right = expression();
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 46, RULE_arguments_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			expression();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(279);
				match(T__5);
				setState(280);
				expression();
				}
				}
				setState(285);
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
		enterRule(_localctx, 48, RULE_summ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((SummContext)_localctx).left = mult();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(287);
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
					setState(288);
					((SummContext)_localctx).right = summ();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 50, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((MultContext)_localctx).left = atomic();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
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
					setState(296);
					((MultContext)_localctx).right = mult();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 52, RULE_arguments_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		public TerminalNode BOOL() { return getToken(exlangParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(exlangParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(exlangParser.FLOAT, 0); }
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
		enterRule(_localctx, 54, RULE_atomic);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(ID);
				setState(310);
				match(T__0);
				setState(311);
				arguments_exp();
				setState(312);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				call();
				setState(315);
				match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\5\5S\n\5\3\5\3\5\5\5W\n\5\3\5\3\5\5\5[\n\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6"+
		"\3\6\3\6\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\7\b~\n\b\f\b\16\b"+
		"\u0081\13\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\n\3\n\3\n\3\n\3\n\6\n"+
		"\u009f\n\n\r\n\16\n\u00a0\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\5"+
		"\f\u00b9\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u00c9\n\r\r\r\16\r\u00ca\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d3\n"+
		"\r\3\16\3\16\5\16\u00d7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00e5\n\17\3\20\3\20\5\20\u00e9\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\5\21\u00f0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u0105\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u010c\n\27\f\27\16\27\u010f\13\27\3\30"+
		"\3\30\3\30\7\30\u0114\n\30\f\30\16\30\u0117\13\30\3\31\3\31\3\31\7\31"+
		"\u011c\n\31\f\31\16\31\u011f\13\31\3\32\3\32\3\32\7\32\u0124\n\32\f\32"+
		"\16\32\u0127\13\32\3\33\3\33\3\33\7\33\u012c\n\33\f\33\16\33\u012f\13"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0140\n\35\3\35\4`n\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\6\3\2\30\33\3\2\f\23\3\2\24\25\3\2\26\27"+
		"\2\u0152\2=\3\2\2\2\4B\3\2\2\2\6K\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fs\3\2"+
		"\2\2\16\u0084\3\2\2\2\20\u0097\3\2\2\2\22\u0099\3\2\2\2\24\u00af\3\2\2"+
		"\2\26\u00b8\3\2\2\2\30\u00d2\3\2\2\2\32\u00d6\3\2\2\2\34\u00e4\3\2\2\2"+
		"\36\u00e6\3\2\2\2 \u00ef\3\2\2\2\"\u00f1\3\2\2\2$\u00f7\3\2\2\2&\u00fb"+
		"\3\2\2\2(\u00ff\3\2\2\2*\u0101\3\2\2\2,\u0108\3\2\2\2.\u0110\3\2\2\2\60"+
		"\u0118\3\2\2\2\62\u0120\3\2\2\2\64\u0128\3\2\2\2\66\u0130\3\2\2\28\u013f"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?"+
		"=\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BC\7$\2\2CD\7)\2\2DF\7\3\2\2EG\5\f\7\2F"+
		"E\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\4\2\2IJ\5\16\b\2J\5\3\2\2\2KL\7\"\2"+
		"\2LM\7)\2\2MN\7\5\2\2NO\5\b\5\2OP\7\6\2\2P\7\3\2\2\2QS\5$\23\2RQ\3\2\2"+
		"\2RS\3\2\2\2ST\3\2\2\2Te\7\7\2\2UW\5\"\22\2VU\3\2\2\2VW\3\2\2\2WX\3\2"+
		"\2\2Xe\7\7\2\2Y[\5\n\6\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\e\7\7\2\2]_\5"+
		"\4\3\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2b`\3\2\2\2ce\7"+
		"\7\2\2dR\3\2\2\2dV\3\2\2\2dZ\3\2\2\2d`\3\2\2\2e\t\3\2\2\2fg\7#\2\2gh\7"+
		"\3\2\2hi\5\f\7\2ij\7\4\2\2jn\7\5\2\2km\5\20\t\2lk\3\2\2\2mp\3\2\2\2no"+
		"\3\2\2\2nl\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\6\2\2r\13\3\2\2\2sx\7)\2\2"+
		"tu\7\b\2\2uw\7)\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\r\3\2\2\2"+
		"zx\3\2\2\2{\177\7\5\2\2|~\5\20\t\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\7\6\2\2\u0083\u0085\5\20\t\2\u0084{\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\17\3\2\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\7\2\2\u0088\u0098\3\2\2"+
		"\2\u0089\u0098\5\30\r\2\u008a\u0098\5\34\17\2\u008b\u008c\5\24\13\2\u008c"+
		"\u008d\7\7\2\2\u008d\u0098\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7"+
		"\7\2\2\u0090\u0098\3\2\2\2\u0091\u0092\5.\30\2\u0092\u0093\7\7\2\2\u0093"+
		"\u0098\3\2\2\2\u0094\u0095\5*\26\2\u0095\u0096\7\7\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0086\3\2\2\2\u0097\u0089\3\2\2\2\u0097\u008a\3\2\2\2\u0097"+
		"\u008b\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2"+
		"\2\2\u0098\21\3\2\2\2\u0099\u009a\7\5\2\2\u009a\u009b\7!\2\2\u009b\u009c"+
		"\58\35\2\u009c\u009e\7\t\2\2\u009d\u009f\5\16\b\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\7\6\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5"+
		"\u00a6\7\t\2\2\u00a6\u00b0\5\20\t\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\58"+
		"\35\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00b0\3\2\2\2\u00ac"+
		"\u00ad\7%\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00b0\5\20\t\2\u00af\u00a4\3\2"+
		"\2\2\u00af\u00a7\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b2"+
		"\7&\2\2\u00b2\u00b9\7\7\2\2\u00b3\u00b5\7\'\2\2\u00b4\u00b6\5.\30\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\7"+
		"\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9\27\3\2\2\2\u00ba\u00bb"+
		"\7\36\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\5.\30\2\u00bd\u00be\7\4\2\2"+
		"\u00be\u00c1\5\16\b\2\u00bf\u00c0\7\37\2\2\u00c0\u00c2\5\16\b\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00d3\3\2\2\2\u00c3\u00c4\7 "+
		"\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\58\35\2\u00c6\u00c8\7\4\2\2\u00c7"+
		"\u00c9\5\22\n\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d3\3\2\2\2\u00cc\u00cd\5.\30\2\u00cd"+
		"\u00ce\7\n\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\7\t\2\2\u00d0\u00d1\5"+
		"\32\16\2\u00d1\u00d3\3\2\2\2\u00d2\u00ba\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2"+
		"\u00cc\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d7\5.\30\2\u00d5\u00d7\5*\26"+
		"\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9"+
		"\7\34\2\2\u00d9\u00da\7\3\2\2\u00da\u00db\5.\30\2\u00db\u00dc\7\4\2\2"+
		"\u00dc\u00dd\5\36\20\2\u00dd\u00e5\3\2\2\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e0\7\3\2\2\u00e0\u00e1\5\66\34\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\5"+
		"\16\b\2\u00e3\u00e5\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5"+
		"\35\3\2\2\2\u00e6\u00e8\7\5\2\2\u00e7\u00e9\5\20\t\2\u00e8\u00e7\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb\37"+
		"\3\2\2\2\u00ec\u00f0\5\"\22\2\u00ed\u00f0\5$\23\2\u00ee\u00f0\5&\24\2"+
		"\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0!\3"+
		"\2\2\2\u00f1\u00f2\7)\2\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\5(\25\2\u00f4"+
		"\u00f5\7\13\2\2\u00f5\u00f6\5.\30\2\u00f6#\3\2\2\2\u00f7\u00f8\7)\2\2"+
		"\u00f8\u00f9\7\13\2\2\u00f9\u00fa\5.\30\2\u00fa%\3\2\2\2\u00fb\u00fc\7"+
		")\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\7)\2\2\u00fe\'\3\2\2\2\u00ff\u0100"+
		"\t\2\2\2\u0100)\3\2\2\2\u0101\u0102\7)\2\2\u0102\u0104\7\3\2\2\u0103\u0105"+
		"\5,\27\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7\4\2\2\u0107+\3\2\2\2\u0108\u010d\5.\30\2\u0109\u010a\7\b\2\2"+
		"\u010a\u010c\5.\30\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e-\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0115\5\62\32\2\u0111\u0112\t\3\2\2\u0112\u0114\5.\30\2\u0113\u0111\3"+
		"\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"/\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011d\5.\30\2\u0119\u011a\7\b\2\2"+
		"\u011a\u011c\5.\30\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\61\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0125\5\64\33\2\u0121\u0122\t\4\2\2\u0122\u0124\5\62\32\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\63\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012d\58\35\2\u0129\u012a\t\5\2"+
		"\2\u012a\u012c\5\64\33\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\65\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u0130\u0131\7*\2\2\u0131\67\3\2\2\2\u0132\u0140\7)\2\2\u0133\u0140"+
		"\7*\2\2\u0134\u0140\7-\2\2\u0135\u0140\7,\2\2\u0136\u0140\7+\2\2\u0137"+
		"\u0138\7)\2\2\u0138\u0139\7\3\2\2\u0139\u013a\5\60\31\2\u013a\u013b\7"+
		"\4\2\2\u013b\u0140\3\2\2\2\u013c\u013d\5*\26\2\u013d\u013e\7\7\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u0132\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0134\3\2"+
		"\2\2\u013f\u0135\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u0137\3\2\2\2\u013f"+
		"\u013c\3\2\2\2\u01409\3\2\2\2 =FRVZ`dnx\177\u0084\u0097\u00a0\u00af\u00b5"+
		"\u00b8\u00c1\u00ca\u00d2\u00d6\u00e4\u00e8\u00ef\u0104\u010d\u0115\u011d"+
		"\u0125\u012d\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}