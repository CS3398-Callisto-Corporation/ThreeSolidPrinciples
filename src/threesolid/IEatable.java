package threesolid;

/**
 * in order to separate workers that can and cannot eat separate interfaces 
 * are created for workers that can eat (IEatable) and workers that can work 
 * (IWorkable). For workers that can do both eat and work, a third interface 
 * was created called IWorker that extends both IEatable and IWorkable.
 * This implements the open-closed principle because we can extend the 
 * methods and attributes of workers that can eat and work into a single 
 * interface that represents a worker that can eat and work without having to 
 * change the original interfaces.
 */

/**
 * @author Callisto
 *
 */
public interface IEatable {
	public void eat();

}
