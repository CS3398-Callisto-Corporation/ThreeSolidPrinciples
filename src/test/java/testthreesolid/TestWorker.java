package threesolid;


import static javafx.beans.binding.Bindings.and;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {


 private Worker w = new Worker();


 @Test
 @DisplayName("Work Method Test")
 public void testWorkMethod()
 {
 assertEquals(w.work(),"Worker is working!", "Mismatch between test text and method text");
 }

 @Test
 @DisplayName("New Test Method PASS")
 public void newtestC_JWorkerPass()
 {
 assertTrue(w.isLazy(10), "isLazy() method not working as intended.");
 }

 @Test
 @DisplayName("New Test Method FAIL")
 public void newtestC_JWorkerFails()
 {
 assertFalse(w.finishedJobs("Clean Toilet", "Take Trash Out", "Mop Floor"), "Worker did the jobs he was supposed to.");
 }

}
