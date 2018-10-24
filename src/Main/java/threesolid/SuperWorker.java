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
public class SuperWorker extends BaseWorker implements IEat, ISick {

	/* (non-Javadoc)
	 * @see IEatable#eat()
	 */
	public void eat() {
		System.out.println("Superworker is taking a lunch break.");

	}

	public void sick(){
		System.out.println("Superworker somehow got sick!");
	}

	/* (non-Javadoc)
	 * @see IWorkable#work()
	 */
	@Override
	public String work() {
		return ("I overrode my work method, because im super.");

	}

}
