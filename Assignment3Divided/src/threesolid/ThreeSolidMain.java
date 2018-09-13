package threesolid;
/**
 * 
 */

/**
 * @author Callisto
 *
 */
public class ThreeSolidMain {

	/**
	 * @param args
	 */
	
	public static Manager tsManager = new Manager();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("DEBUGGING: Beginning of Main");
		try 
	      {
	         System.out.format("Starting ... \n");               
	      } 
	      catch (Exception main_except)
	      {
	         main_except.printStackTrace();
	      }

	            try 
	      {
	         System.out.format("Stopping ... \n");               
	      } 
	      catch (Exception main_except)
	      {
	         main_except.printStackTrace();
	      }

	      System.out.println("\n\nBaseWorker: \n");
	      BaseWorker baseWorker = new BaseWorker();
	      baseWorker.work();
	      
	      
	      System.out.println("\n\nSuperWorker: \n");
	      SuperWorker superWorker = new SuperWorker();
	      superWorker.work();
	      superWorker.eat();
	      superWorker.sick();
	      
	      
	      System.out.println("\n\nWorker: \n");
	      Worker worker = new Worker();
	      worker.work();
	      worker.eat();
	      worker.sick();
	      
	      
	      System.out.println("\n\nTempWorker: \n");
	      TempWorker tempWorker = new TempWorker();
	      tempWorker.work();
	      tempWorker.eat();
	      tempWorker.sick();
	      
	      
	      System.out.println("\n\nRobot: \n");
	      Robot robot = new Robot();
	      robot.work();
	      robot.reboot();
	      
	      
	      // not 100% sure I was supposed to add the plain manager tests, but couldn't hurt -Wes Nicol
	      System.out.println("\n\nManager: \n");
	      Worker workerForManager = new IWorkable(); // Added to allow the manager classes to have a IWorkable object to interact with -Wes Nicol
	      Manager manager = new Manager();
	      manager.setWorker(workerForManager);
	      manager.manage();
	      
	      System.out.println("\n\nProjectManager: \n");
	      ProjectManager projectManager = new ProjectManager();
	      projectManager.setWorker(workerForManager);;
	      projectManager.manage();
	      projectManager.schedulework();
	      
	      
	      System.out.println("\n\nProductManager: \n");
	      ProductManager productManager = new ProductManager();
	      productManager.setWorker(workerForManager);;
	      productManager.manage();
	      productManager.schedulework();
	      
	      
	      
	      
	      System.exit(0);

	}

}
