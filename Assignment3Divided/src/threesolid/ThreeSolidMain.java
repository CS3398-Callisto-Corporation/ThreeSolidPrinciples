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

	      System.out.println("\n\nBaseWorker:");
	      BaseWorker baseWorker = new BaseWorker();
	      baseWorker.work();
	      
	      
	      System.out.println("\n\nSuperWorker:");
	      SuperWorker superWorker = new SuperWorker();
	      superWorker.work();
	      superWorker.eat();
	      //superWorker.sick();
	      
	      
	      System.out.println("\n\nWorker:");
	      Worker worker = new Worker();
	      worker.work();
	      worker.eat();
	      worker.sick();
	      
	      
	      System.out.println("\n\nTempWorker:");
	      TempWorker tempWorker = new TempWorker();
	      tempWorker.work();
	      tempWorker.eat();
	      tempWorker.sick();
	      
	      
	      System.out.println("\n\nRobot:");
	      Robot robot = new Robot();
	      robot.work();
	      robot.reboot();

	      
	      // not 100% sure I was supposed to add the plain manager tests, but couldn't hurt -Wes Nicol
	      System.out.println("\n\nManager: ");

		  Manager manager = new Manager();
	      manager.work();
	      manager.eat();
	      manager.sick();
	      
	      System.out.println("\n\nProjectManager:");
	      ProjectManager projectManager = new ProjectManager();
	      projectManager.work();
	      projectManager.eat();
	      projectManager.sick();
	      projectManager.scheduleWork();
	      
	      
	      System.out.println("\n\nProductManager:");
	      ProductManager productManager = new ProductManager();
	      productManager.work();
	      productManager.eat();
	      productManager.sick();
	      productManager.defineProduct();
	      
	      
	      
	      
	      System.exit(0);

	}

}
