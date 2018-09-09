package threesolid;
/**
 * by using separate files for the worker and superWorker classes, they are kept
 * separate from the robot class. This implements the interface segregation principle.
 * If you were to add a different type of worker with new responsibilities in the future, 
 * this worker class wouldn't be forced to use the new responsibility 
 */

/**
 * @author Callisto
 *
 */
public class SuperWorker implements IWorkable, IEatable {

	/* (non-Javadoc)
	 * @see IEatable#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see IWorkable#work()
	 */
	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

}
