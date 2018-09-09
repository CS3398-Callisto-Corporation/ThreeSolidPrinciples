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
public class Manager {
	IWorkable worker;
	
	public void setWorker(IWorkable w) {
		worker = w;
		
	}
	
	public void manage() {
		worker.work();
	}

}
