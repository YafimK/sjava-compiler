package nodes.mediator;

import main.MasterTypeOneException;

/**
 * An Exception Class extending MasterTypeOneException and represents an
 * illegal math operation
 * @author owner
 */
class IllegalMathOperation extends MasterTypeOneException {
	
	/**
	 * Constructor
	 * @param nodeLineNumber - the line number where the problem originated
	 * from
	 */
	public IllegalMathOperation(int nodeLineNumber) {
		super(nodeLineNumber, "Longer then supposed too math operation");

	}
}
