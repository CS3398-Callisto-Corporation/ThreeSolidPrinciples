package threesolid;

// Author: Allen Van
// ProjectManager is a subclass of the Manager class and implements ISchedule interface.

public class ProjectManager extends Manager implements ISchedule {

    public void manage() {
        worker.work();
    }

    public void scheduleWork() {
        System.out.println("Also scheduling work for the upcoming month...");
    }
}
