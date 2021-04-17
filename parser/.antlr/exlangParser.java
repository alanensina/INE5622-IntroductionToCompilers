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
		TYPE_CHAR=25, WHILE=26, REPEAT=27, IF=28, ELSE=29, SWITCH=30, CASE=31, 
		CLASS=32, CONSTRUCTOR=33, FUNCTION=34, DEFAULT=35, BREAK=36, RETURN=37, 
		CONTINUE=38, FOR=39, ID=40, INT=41, FLOAT=42, CHAR=43, BOOL=44, WS=45;
	public static final int
		RULE_start = 0, RULE_function_definition = 1, RULE_class_definition = 2, 
		RULE_class_statements = 3, RULE_constructor = 4, RULE_arguments = 5, RULE_statements = 6, 
		RULE_statement = 7, RULE_switchStatements = 8, RULE_switchStatement = 9, 
		RULE_labelStatement = 10, RULE_jumpStatement = 11, RULE_selectionStatement = 12, 
		RULE_ternaryArguments = 13, RULE_iterStatement = 14, RULE_whileStatement = 15, 
		RULE_assignments = 16, RULE_assignment_typed = 17, RULE_assignment_empty = 18, 
		RULE_assignment = 19, RULE_assignment_change = 20, RULE_types = 21, RULE_call = 22, 
		RULE_expressions = 23, RULE_expression = 24, RULE_arguments_exp = 25, 
		RULE_summ = 26, RULE_mult = 27, RULE_arguments_repeat = 28, RULE_atomic = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "function_definition", "class_definition", "class_statements", 
			"constructor", "arguments", "statements", "statement", "switchStatements", 
			"switchStatement", "labelStatement", "jumpStatement", "selectionStatement", 
			"ternaryArguments", "iterStatement", "whileStatement", "assignments", 
			"assignment_typed", "assignment_empty", "assignment", "assignment_change", 
			"types", "call", "expressions", "expression", "arguments_exp", "summ", 
			"mult", "arguments_repeat", "atomic"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(60);
				function_definition();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
			setState(68);
			match(FUNCTION);
			setState(69);
			match(ID);
			setState(70);
			match(T__0);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(71);
				arguments();
				}
			}

			setState(74);
			match(T__1);
			setState(75);
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
		public List<Class_statementsContext> class_statements() {
			return getRuleContexts(Class_statementsContext.class);
		}
		public Class_statementsContext class_statements(int i) {
			return getRuleContext(Class_statementsContext.class,i);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CLASS);
			setState(78);
			match(ID);
			setState(79);
			match(T__2);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << FUNCTION) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				class_statements();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public Assignment_emptyContext assignment_empty() {
			return getRuleContext(Assignment_emptyContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Class_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statements; }
	}

	public final Class_statementsContext class_statements() throws RecognitionException {
		Class_statementsContext _localctx = new Class_statementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_statements);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assignment_typed();
				setState(89);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				assignment_empty();
				setState(92);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				constructor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				function_definition();
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CONSTRUCTOR);
			setState(99);
			match(T__0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(100);
				arguments();
				}
			}

			setState(103);
			match(T__1);
			setState(104);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public List<Assignment_emptyContext> assignment_empty() {
			return getRuleContexts(Assignment_emptyContext.class);
		}
		public Assignment_emptyContext assignment_empty(int i) {
			return getRuleContext(Assignment_emptyContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ID);
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(114);
						match(T__5);
						setState(115);
						match(ID);
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				assignment_empty();
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(122);
						match(T__5);
						setState(123);
						assignment_empty();
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__2);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << CLASS) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << FOR) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				assignments();
				setState(141);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				iterStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				labelStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				jumpStatement();
				setState(147);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				expression();
				setState(150);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				call();
				setState(153);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				class_definition();
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

	public static class SwitchStatementsContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(exlangParser.CASE, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<SwitchStatementContext> switchStatement() {
			return getRuleContexts(SwitchStatementContext.class);
		}
		public SwitchStatementContext switchStatement(int i) {
			return getRuleContext(SwitchStatementContext.class,i);
		}
		public SwitchStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatements; }
	}

	public final SwitchStatementsContext switchStatements() throws RecognitionException {
		SwitchStatementsContext _localctx = new SwitchStatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__2);
			setState(159);
			match(CASE);
			setState(160);
			atomic();
			setState(161);
			match(T__6);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(162);
				switchStatement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LabelStatementContext labelStatement() {
			return getRuleContext(LabelStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switchStatement);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				assignments();
				setState(171);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				jumpStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				call();
				setState(175);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				labelStatement();
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
		enterRule(_localctx, 20, RULE_labelStatement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__6);
				setState(182);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(CASE);
				setState(184);
				atomic();
				setState(185);
				match(T__6);
				setState(186);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(DEFAULT);
				setState(189);
				match(T__6);
				setState(190);
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
		enterRule(_localctx, 22, RULE_jumpStatement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(BREAK);
				setState(194);
				match(T__4);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(RETURN);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					setState(196);
					expression();
					}
				}

				setState(199);
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
		public List<SwitchStatementsContext> switchStatements() {
			return getRuleContexts(SwitchStatementsContext.class);
		}
		public SwitchStatementsContext switchStatements(int i) {
			return getRuleContext(SwitchStatementsContext.class,i);
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
		enterRule(_localctx, 24, RULE_selectionStatement);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(IF);
				setState(203);
				match(T__0);
				setState(204);
				expression();
				setState(205);
				match(T__1);
				setState(206);
				statements();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(207);
					match(ELSE);
					setState(208);
					statements();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(SWITCH);
				setState(212);
				match(T__0);
				setState(213);
				atomic();
				setState(214);
				match(T__1);
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					switchStatements();
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				expression();
				setState(221);
				match(T__7);
				setState(222);
				ternaryArguments();
				setState(223);
				match(T__6);
				setState(224);
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
		enterRule(_localctx, 26, RULE_ternaryArguments);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
		public TerminalNode REPEAT() { return getToken(exlangParser.REPEAT, 0); }
		public Arguments_repeatContext arguments_repeat() {
			return getRuleContext(Arguments_repeatContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(exlangParser.FOR, 0); }
		public Assignment_typedContext assignment_typed() {
			return getRuleContext(Assignment_typedContext.class,0);
		}
		public Assignment_changeContext assignment_change() {
			return getRuleContext(Assignment_changeContext.class,0);
		}
		public IterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStatement; }
	}

	public final IterStatementContext iterStatement() throws RecognitionException {
		IterStatementContext _localctx = new IterStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iterStatement);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(WHILE);
				setState(233);
				match(T__0);
				setState(234);
				expression();
				setState(235);
				match(T__1);
				setState(236);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(REPEAT);
				setState(239);
				match(T__0);
				setState(240);
				arguments_repeat();
				setState(241);
				match(T__1);
				setState(242);
				statements();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(FOR);
				setState(245);
				match(T__0);
				setState(246);
				assignment_typed();
				setState(247);
				match(T__5);
				setState(248);
				expression();
				setState(249);
				match(T__5);
				setState(250);
				assignment_change();
				setState(251);
				match(T__1);
				setState(252);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__2);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << SWITCH) | (1L << CASE) | (1L << CLASS) | (1L << DEFAULT) | (1L << BREAK) | (1L << RETURN) | (1L << FOR) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(257);
				statement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		public Assignment_emptyContext assignment_empty() {
			return getRuleContext(Assignment_emptyContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignments);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				assignment_typed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				assignment_change();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				assignment_empty();
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
		enterRule(_localctx, 34, RULE_assignment_typed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(272);
			match(T__6);
			setState(273);
			types();
			setState(274);
			match(T__8);
			setState(275);
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

	public static class Assignment_emptyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exlangParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public Assignment_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_empty; }
	}

	public final Assignment_emptyContext assignment_empty() throws RecognitionException {
		Assignment_emptyContext _localctx = new Assignment_emptyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			match(T__6);
			setState(279);
			types();
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
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ID);
			setState(282);
			match(T__8);
			setState(283);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_change; }
	}

	public final Assignment_changeContext assignment_change() throws RecognitionException {
		Assignment_changeContext _localctx = new Assignment_changeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_change);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(ID);
				setState(286);
				match(T__8);
				setState(287);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				assignment();
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
		enterRule(_localctx, 42, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 44, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(294);
			match(T__0);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(295);
				expressions();
				}
			}

			setState(298);
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
		enterRule(_localctx, 46, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			expression();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(301);
				match(T__5);
				setState(302);
				expression();
				}
				}
				setState(307);
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
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((ExpressionContext)_localctx).left = summ();
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
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
					setState(310);
					((ExpressionContext)_localctx).right = expression();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 50, RULE_arguments_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			expression();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(317);
				match(T__5);
				setState(318);
				expression();
				}
				}
				setState(323);
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
		enterRule(_localctx, 52, RULE_summ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((SummContext)_localctx).left = mult();
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
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
					setState(326);
					((SummContext)_localctx).right = summ();
					}
					} 
				}
				setState(331);
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
		enterRule(_localctx, 54, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((MultContext)_localctx).left = atomic();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
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
					setState(334);
					((MultContext)_localctx).right = mult();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 56, RULE_arguments_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		enterRule(_localctx, 58, RULE_atomic);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				match(ID);
				setState(348);
				match(T__0);
				setState(349);
				arguments_exp();
				setState(350);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				call();
				setState(353);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5c\n\5\3\6\3\6\3\6\5\6h\n\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6"+
		"\3\6\3\6\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\7\7\7\177\n\7\f"+
		"\7\16\7\u0082\13\7\5\7\u0084\n\7\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00c8\n\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00d4\n\16\3\16\3\16\3\16\3\16\3\16\6\16\u00db\n\16\r\16\16\16\u00dc"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e5\n\16\3\17\3\17\5\17\u00e9\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0101\n\20\3\21\3\21"+
		"\7\21\u0105\n\21\f\21\16\21\u0108\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\5\22\u0110\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0124\n\26\3\27\3\27\3\30\3\30"+
		"\3\30\5\30\u012b\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u0132\n\31\f\31\16"+
		"\31\u0135\13\31\3\32\3\32\3\32\7\32\u013a\n\32\f\32\16\32\u013d\13\32"+
		"\3\33\3\33\3\33\7\33\u0142\n\33\f\33\16\33\u0145\13\33\3\34\3\34\3\34"+
		"\7\34\u014a\n\34\f\34\16\34\u014d\13\34\3\35\3\35\3\35\7\35\u0152\n\35"+
		"\f\35\16\35\u0155\13\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u0166\n\37\3\37\5nx\u0080\2 \2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\6\3\2\30\33"+
		"\3\2\f\23\3\2\24\25\3\2\26\27\2\u017c\2A\3\2\2\2\4F\3\2\2\2\6O\3\2\2\2"+
		"\bb\3\2\2\2\nd\3\2\2\2\f\u0083\3\2\2\2\16\u0085\3\2\2\2\20\u009e\3\2\2"+
		"\2\22\u00a0\3\2\2\2\24\u00b4\3\2\2\2\26\u00c1\3\2\2\2\30\u00ca\3\2\2\2"+
		"\32\u00e4\3\2\2\2\34\u00e8\3\2\2\2\36\u0100\3\2\2\2 \u0102\3\2\2\2\"\u010f"+
		"\3\2\2\2$\u0111\3\2\2\2&\u0117\3\2\2\2(\u011b\3\2\2\2*\u0123\3\2\2\2,"+
		"\u0125\3\2\2\2.\u0127\3\2\2\2\60\u012e\3\2\2\2\62\u0136\3\2\2\2\64\u013e"+
		"\3\2\2\2\66\u0146\3\2\2\28\u014e\3\2\2\2:\u0156\3\2\2\2<\u0165\3\2\2\2"+
		">@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2"+
		"DE\7\2\2\3E\3\3\2\2\2FG\7$\2\2GH\7*\2\2HJ\7\3\2\2IK\5\f\7\2JI\3\2\2\2"+
		"JK\3\2\2\2KL\3\2\2\2LM\7\4\2\2MN\5\16\b\2N\5\3\2\2\2OP\7\"\2\2PQ\7*\2"+
		"\2QU\7\5\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2"+
		"\2WU\3\2\2\2XY\7\6\2\2Y\7\3\2\2\2Z[\5$\23\2[\\\7\7\2\2\\c\3\2\2\2]^\5"+
		"&\24\2^_\7\7\2\2_c\3\2\2\2`c\5\n\6\2ac\5\4\3\2bZ\3\2\2\2b]\3\2\2\2b`\3"+
		"\2\2\2ba\3\2\2\2c\t\3\2\2\2de\7#\2\2eg\7\3\2\2fh\5\f\7\2gf\3\2\2\2gh\3"+
		"\2\2\2hi\3\2\2\2ij\7\4\2\2jn\7\5\2\2km\5\20\t\2lk\3\2\2\2mp\3\2\2\2no"+
		"\3\2\2\2nl\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\6\2\2r\13\3\2\2\2sx\7*\2\2"+
		"tu\7\b\2\2uw\7*\2\2vt\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y\u0084\3\2"+
		"\2\2zx\3\2\2\2{\u0080\5&\24\2|}\7\b\2\2}\177\5&\24\2~|\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083s\3\2\2\2\u0083{\3\2\2\2\u0084\r\3\2\2\2\u0085\u0089"+
		"\7\5\2\2\u0086\u0088\5\20\t\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008d\7\6\2\2\u008d\17\3\2\2\2\u008e\u008f\5\"\22\2\u008f"+
		"\u0090\7\7\2\2\u0090\u009f\3\2\2\2\u0091\u009f\5\32\16\2\u0092\u009f\5"+
		"\36\20\2\u0093\u009f\5\26\f\2\u0094\u0095\5\30\r\2\u0095\u0096\7\7\2\2"+
		"\u0096\u009f\3\2\2\2\u0097\u0098\5\62\32\2\u0098\u0099\7\7\2\2\u0099\u009f"+
		"\3\2\2\2\u009a\u009b\5.\30\2\u009b\u009c\7\7\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009f\5\6\4\2\u009e\u008e\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0092\3\2"+
		"\2\2\u009e\u0093\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0097\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\5\2"+
		"\2\u00a1\u00a2\7!\2\2\u00a2\u00a3\5<\37\2\u00a3\u00a7\7\t\2\2\u00a4\u00a6"+
		"\5\24\13\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab"+
		"\7\6\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\u00b5\3\2\2\2\u00af\u00b5\5\30\r\2\u00b0\u00b1\5.\30\2\u00b1\u00b2\7"+
		"\7\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\5\26\f\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\25\3\2\2"+
		"\2\u00b6\u00b7\7*\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00c2\5\20\t\2\u00b9\u00ba"+
		"\7!\2\2\u00ba\u00bb\5<\37\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd\5\20\t\2\u00bd"+
		"\u00c2\3\2\2\2\u00be\u00bf\7%\2\2\u00bf\u00c0\7\t\2\2\u00c0\u00c2\5\20"+
		"\t\2\u00c1\u00b6\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2"+
		"\27\3\2\2\2\u00c3\u00c4\7&\2\2\u00c4\u00cb\7\7\2\2\u00c5\u00c7\7\'\2\2"+
		"\u00c6\u00c8\5\62\32\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cb\7\7\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb"+
		"\31\3\2\2\2\u00cc\u00cd\7\36\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\62"+
		"\32\2\u00cf\u00d0\7\4\2\2\u00d0\u00d3\5\16\b\2\u00d1\u00d2\7\37\2\2\u00d2"+
		"\u00d4\5\16\b\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e5\3"+
		"\2\2\2\u00d5\u00d6\7 \2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\5<\37\2\u00d8"+
		"\u00da\7\4\2\2\u00d9\u00db\5\22\n\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e5\3\2\2\2\u00de"+
		"\u00df\5\62\32\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2"+
		"\7\t\2\2\u00e2\u00e3\5\34\17\2\u00e3\u00e5\3\2\2\2\u00e4\u00cc\3\2\2\2"+
		"\u00e4\u00d5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e9"+
		"\5\62\32\2\u00e7\u00e9\5.\30\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\35\3\2\2\2\u00ea\u00eb\7\34\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed"+
		"\5\62\32\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\5 \21\2\u00ef\u0101\3\2\2\2"+
		"\u00f0\u00f1\7\35\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\5:\36\2\u00f3\u00f4"+
		"\7\4\2\2\u00f4\u00f5\5\16\b\2\u00f5\u0101\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7"+
		"\u00f8\7\3\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7\b\2\2\u00fa\u00fb\5\62"+
		"\32\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u00ff\5\16\b\2\u00ff\u0101\3\2\2\2\u0100\u00ea\3\2\2\2\u0100\u00f0\3"+
		"\2\2\2\u0100\u00f6\3\2\2\2\u0101\37\3\2\2\2\u0102\u0106\7\5\2\2\u0103"+
		"\u0105\5\20\t\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\6\2\2\u010a!\3\2\2\2\u010b\u0110\5$\23\2\u010c\u0110\5(\25\2"+
		"\u010d\u0110\5*\26\2\u010e\u0110\5&\24\2\u010f\u010b\3\2\2\2\u010f\u010c"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110#\3\2\2\2\u0111"+
		"\u0112\7*\2\2\u0112\u0113\7\t\2\2\u0113\u0114\5,\27\2\u0114\u0115\7\13"+
		"\2\2\u0115\u0116\5\62\32\2\u0116%\3\2\2\2\u0117\u0118\7*\2\2\u0118\u0119"+
		"\7\t\2\2\u0119\u011a\5,\27\2\u011a\'\3\2\2\2\u011b\u011c\7*\2\2\u011c"+
		"\u011d\7\13\2\2\u011d\u011e\5\62\32\2\u011e)\3\2\2\2\u011f\u0120\7*\2"+
		"\2\u0120\u0121\7\13\2\2\u0121\u0124\7*\2\2\u0122\u0124\5(\25\2\u0123\u011f"+
		"\3\2\2\2\u0123\u0122\3\2\2\2\u0124+\3\2\2\2\u0125\u0126\t\2\2\2\u0126"+
		"-\3\2\2\2\u0127\u0128\7*\2\2\u0128\u012a\7\3\2\2\u0129\u012b\5\60\31\2"+
		"\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\7\4\2\2\u012d/\3\2\2\2\u012e\u0133\5\62\32\2\u012f\u0130\7\b\2\2\u0130"+
		"\u0132\5\62\32\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\61\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u013b\5\66\34\2\u0137\u0138\t\3\2\2\u0138\u013a\5\62\32\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\63\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0143\5\62\32\2\u013f\u0140\7\b"+
		"\2\2\u0140\u0142\5\62\32\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\65\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u014b\58\35\2\u0147\u0148\t\4\2\2\u0148\u014a\5\66\34\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\67\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0153\5<\37\2\u014f\u0150"+
		"\t\5\2\2\u0150\u0152\58\35\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u01549\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0156\u0157\7+\2\2\u0157;\3\2\2\2\u0158\u0166\7*\2\2\u0159\u0166\7+\2"+
		"\2\u015a\u0166\7.\2\2\u015b\u0166\7-\2\2\u015c\u0166\7,\2\2\u015d\u015e"+
		"\7*\2\2\u015e\u015f\7\3\2\2\u015f\u0160\5\64\33\2\u0160\u0161\7\4\2\2"+
		"\u0161\u0166\3\2\2\2\u0162\u0163\5.\30\2\u0163\u0164\7\7\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0158\3\2\2\2\u0165\u0159\3\2\2\2\u0165\u015a\3\2\2\2\u0165"+
		"\u015b\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u0162\3\2"+
		"\2\2\u0166=\3\2\2\2!AJUbgnx\u0080\u0083\u0089\u009e\u00a7\u00b4\u00c1"+
		"\u00c7\u00ca\u00d3\u00dc\u00e4\u00e8\u0100\u0106\u010f\u0123\u012a\u0133"+
		"\u013b\u0143\u014b\u0153\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}