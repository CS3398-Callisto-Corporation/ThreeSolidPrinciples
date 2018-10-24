package threesolid;

/** @author Allen Van
 *
 * ProjectManager is a subclass of the Manager class and implements ISchedule interface.
 */
public class ProjectManager extends Manager implements ISchedule {

    @Override
    public String work() { return ("Project Manager is doing work!"); }

    public void eat() { System.out.println("Project Manager is on lunch break!"); }

    public void sick() { System.out.println("Project Manager is sick today!"); }

    public void scheduleWork() { System.out.println("Also scheduling work for the upcoming month. Busy busy!"); }
}
