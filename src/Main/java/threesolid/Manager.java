package threesolid;
/**
 * putting the manager class in a separate file implements the single responsibility 
 * principle. The manager only initiates work in workers, so by not including 
 * any eat methods, it makes the manager class only responsible for work.
 */

/**
 * @author Callisto
 *
 */
public class Manager extends BaseWorker implements IEat, ISick{
	
	@Override
	public String work() { return("Manager is doing work!"); }

	public void eat() { System.out.println("Manager is taking a lunch break!"); }

	public void sick() { System.out.println("Manager is sick today!"); }


}
