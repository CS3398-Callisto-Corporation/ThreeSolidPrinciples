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

    String[] jobsSupposedToDo = {"Clean Toilet", "Take Trash Out", "Mop Floor"};

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

	public boolean isLazy(int quality){
        if(quality >=90){
            return false;
        } else {
            return true;
        }
	}

	public boolean finishedJobs(String str1, String str2, String str3){
	    String[] jobsFinished = new String[3];
	    jobsFinished[0] = str1;
	    jobsFinished[1] = str2;
	    jobsFinished[2] = str3;
	    int i;
	    for(i = 0; i < 3; i++){
            if(jobsFinished[i] != jobsSupposedToDo[i]){
                return false;
            }
	    }

	    return true;


	}




}
