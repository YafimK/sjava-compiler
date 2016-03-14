package nodes;

import main.MasterTypeOneException;
import nodes.nodeFactories.DecelerationType;

/**
 * An Exception Class extending MasterTypeOneException and represents an illegal
 * casting between two different types of variables
 * @author owner
 */
public class IllegalCastingOfDifferentDataTypes extends MasterTypeOneException {

	/**
	 * constructor
	 * @param firstSymbol - the type of the first object
	 * @param secondSymbol - the type of the second object
	 */
	public IllegalCastingOfDifferentDataTypes(
			DecelerationType firstSymbol, DecelerationType secondSymbol) {
		super(0, "Illegal comparison from type " + firstSymbol + "to type" +
				secondSymbol);
	}
}
