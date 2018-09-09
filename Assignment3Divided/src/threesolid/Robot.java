package threesolid;
/**
 *  The Robot class only needs interface IWorkable. A robot does not eat, it only works.
 *  This satisfies the Single Responsibility Principle. Also satisfies the Interface Segregation
 *  Principle, the interfaces were split to their respective methods, so classes aren't forced to used
 *  unnecessary methods that don't apply to them.
 */


/**
 * @author Callisto
 *
 */
public class Robot implements IWorkable {

	/* (non-Javadoc)
	 * @see IWorkable#work()
	 */
	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

}
