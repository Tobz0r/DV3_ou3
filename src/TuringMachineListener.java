// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TuringMachineParser}.
 */
public interface TuringMachineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#turingmachine}.
	 * @param ctx the parse tree
	 */
	void enterTuringmachine(TuringMachineParser.TuringmachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#turingmachine}.
	 * @param ctx the parse tree
	 */
	void exitTuringmachine(TuringMachineParser.TuringmachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TuringMachineParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TuringMachineParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#tape}.
	 * @param ctx the parse tree
	 */
	void enterTape(TuringMachineParser.TapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#tape}.
	 * @param ctx the parse tree
	 */
	void exitTape(TuringMachineParser.TapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TuringMachineParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TuringMachineParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#accepted}.
	 * @param ctx the parse tree
	 */
	void enterAccepted(TuringMachineParser.AcceptedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#accepted}.
	 * @param ctx the parse tree
	 */
	void exitAccepted(TuringMachineParser.AcceptedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TuringMachineParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TuringMachineParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#nonaccepted}.
	 * @param ctx the parse tree
	 */
	void enterNonaccepted(TuringMachineParser.NonacceptedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#nonaccepted}.
	 * @param ctx the parse tree
	 */
	void exitNonaccepted(TuringMachineParser.NonacceptedContext ctx);
}