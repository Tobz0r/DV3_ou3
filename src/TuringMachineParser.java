// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringMachineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DIRECTION=6, CHARACTER=7, DIGIT=8, 
		WS=9;
	public static final int
		RULE_turingmachine = 0, RULE_state = 1, RULE_tape = 2, RULE_start = 3, 
		RULE_accepted = 4, RULE_transition = 5, RULE_nonaccepted = 6;
	public static final String[] ruleNames = {
		"turingmachine", "state", "tape", "start", "accepted", "transition", "nonaccepted"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "'Q'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DIRECTION", "CHARACTER", "DIGIT", 
		"WS"
	};
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
	public String getGrammarFileName() { return "TuringMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TuringMachineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TuringmachineContext extends ParserRuleContext {
		public TapeContext tape() {
			return getRuleContext(TapeContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<AcceptedContext> accepted() {
			return getRuleContexts(AcceptedContext.class);
		}
		public AcceptedContext accepted(int i) {
			return getRuleContext(AcceptedContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TuringmachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turingmachine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTuringmachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTuringmachine(this);
		}
	}

	public final TuringmachineContext turingmachine() throws RecognitionException {
		TuringmachineContext _localctx = new TuringmachineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_turingmachine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				state();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(20);
			match(T__1);
			setState(21);
			match(T__0);
			setState(22);
			tape();
			setState(23);
			match(T__1);
			setState(24);
			match(T__0);
			setState(25);
			start();
			setState(26);
			match(T__1);
			setState(27);
			match(T__0);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				accepted();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(33);
			match(T__1);
			setState(34);
			match(T__2);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(T__0);
				setState(36);
				transition();
				setState(37);
				match(T__1);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(TuringMachineParser.DIGIT, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__3);
			setState(44);
			match(DIGIT);
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

	public static class TapeContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(TuringMachineParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(TuringMachineParser.CHARACTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TuringMachineParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TuringMachineParser.DIGIT, i);
		}
		public TapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTape(this);
		}
	}

	public final TapeContext tape() throws RecognitionException {
		TapeContext _localctx = new TapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==CHARACTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHARACTER || _la==DIGIT );
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

	public static class StartContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			state();
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

	public static class AcceptedContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public AcceptedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accepted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterAccepted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitAccepted(this);
		}
	}

	public final AcceptedContext accepted() throws RecognitionException {
		AcceptedContext _localctx = new AcceptedContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accepted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			state();
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

	public static class TransitionContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public TerminalNode DIRECTION() { return getToken(TuringMachineParser.DIRECTION, 0); }
		public List<TerminalNode> CHARACTER() { return getTokens(TuringMachineParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(TuringMachineParser.CHARACTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TuringMachineParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TuringMachineParser.DIGIT, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			state();
			setState(56);
			match(T__2);
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==CHARACTER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(58);
			match(T__4);
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==CHARACTER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(60);
			match(T__2);
			setState(61);
			match(DIRECTION);
			setState(62);
			match(T__2);
			setState(63);
			state();
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

	public static class NonacceptedContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public NonacceptedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonaccepted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterNonaccepted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitNonaccepted(this);
		}
	}

	public final NonacceptedContext nonaccepted() throws RecognitionException {
		NonacceptedContext _localctx = new NonacceptedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonaccepted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			state();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\4\6\4\62\n\4\r\4\16\4\63"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\3\3\2\t\nB\2\20\3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2"+
		"\b\65\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16C\3\2\2\2\20\22\7\3\2\2\21\23"+
		"\5\4\3\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26"+
		"\3\2\2\2\26\27\7\4\2\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\7\4\2\2\32\33"+
		"\7\3\2\2\33\34\5\b\5\2\34\35\7\4\2\2\35\37\7\3\2\2\36 \5\n\6\2\37\36\3"+
		"\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\4\2\2$)\7\5\2\2"+
		"%&\7\3\2\2&\'\5\f\7\2\'(\7\4\2\2(*\3\2\2\2)%\3\2\2\2*+\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,\3\3\2\2\2-.\7\6\2\2./\7\n\2\2/\5\3\2\2\2\60\62\t\2\2\2\61"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7\3\2\2\2\65"+
		"\66\5\4\3\2\66\t\3\2\2\2\678\5\4\3\28\13\3\2\2\29:\5\4\3\2:;\7\5\2\2;"+
		"<\t\2\2\2<=\7\7\2\2=>\t\2\2\2>?\7\5\2\2?@\7\b\2\2@A\7\5\2\2AB\5\4\3\2"+
		"B\r\3\2\2\2CD\5\4\3\2D\17\3\2\2\2\6\24!+\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}