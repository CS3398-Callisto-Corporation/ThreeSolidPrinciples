
/**
 * @Author Christopher Jew
 */

package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick  {
	@Override
	public void work() {
		System.out.format("Working temporarily...\n");
	}
	
	@Overide
	public void eat() {
		System.out.format("Temporary worker eating...\n");
	}
	
	@Overide
	public void sick() {
		System.out.format("Temporary worker is sick...\n");
	}
}
