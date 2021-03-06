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
public class Worker extends BaseWorker implements IEat, ISick {
	/* (non-Javadoc)
	 * @see IWorkable#work()
	 */
	public String work() {
		return ("Worker is working!");

	}

	public void sick(){
		System.out.println("Worker is taking a sick day.");
	}

	/* (non-Javadoc)
	 * @see IEatable#eat()
	 */
	public void eat() {
		System.out.println("Worker is taking a long lunch break.");

	}
	
	//returns true if input is positive
	public boolean isPositive(int num) {
		return (num > 0);
		
	}

}
