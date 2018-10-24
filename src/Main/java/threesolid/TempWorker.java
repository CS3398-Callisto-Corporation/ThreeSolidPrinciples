
/**
 * @Author Christopher Jew
 */

package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick  {
	@Override
	public String work() {
		return ("Working temporarily...\n");
	}
	
	@Override
	public void eat() {
		System.out.format("Temporary worker eating...\n");
	}
	
	@Override
	public void sick() {
		System.out.format("Temporary worker is sick...\n");
	}
}
