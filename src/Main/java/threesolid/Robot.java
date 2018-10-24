/**
 *  The Robot class only needs interface IWorkable. A robot does not eat, it only works.
 *  This satisfies the Single Responsibility Principle. Also satisfies the Interface Segregation
 *  Principle, the interfaces were split to their respective methods, so classes aren't forced to used
 *  unnecessary methods that don't apply to them.
 */

/**
 * @Author Christopher Jew
 * @Author Callisto
 */
package threesolid;

public class Robot extends BaseWorker implements IReboot {
	@Override
	public String work() {
		return ("Robot working...\n");
	}
    @Override
    public void reboot() {
    	System.out.format("Robot is rebooting...\n");
    }
}
