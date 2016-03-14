package nodes.nodeFactories;

import nodes.oneLineNodes.VariableNode;
import nodes.oneLineNodes.variabals.*;

/**
 * Sort out to send to the right constructor throughout of the possible variable
 * types
 * @author owner
 */
class VariableNodeFactory extends OneLinerNodeFactory {

	/**
	 * Given the data needed return the proper node which represent this data
	 * @param lineData - the line Data
	 * @param lineNum - the line number
	 * @return - The correct node
	 * @throws UnknowenDeclerationInThisLine
	 */
	public static VariableNode createVariableNode(String lineData, int lineNum)
			throws main.MasterTypeOneException {

		if (lineData.matches(BooleanNode.getStructurepattern())) {
			return new BooleanNode(lineData, lineNum);
		} else if (lineData.matches(CharNode.getStructurepattern())) {
			return new CharNode(lineData, lineNum);
		} else if (lineData.matches(DoubleNode.getStructurePattern())) {
			return new DoubleNode(lineData, lineNum);
		} else if (lineData.matches(IntNode.getStructurePattern())) {
			return new IntNode(lineData, lineNum);
		} else if (lineData.matches(StringNode.getStructurePattern())) {
			return new StringNode(lineData, lineNum);
		} else {
			throw new UnknowenDeclerationInThisLine(lineNum);
		}
	}
}

