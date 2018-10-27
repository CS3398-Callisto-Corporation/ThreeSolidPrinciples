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
 @DisplayName("newtest_AL_WorkerFail") @Test
 @DisplayName("Designed to Fail")
 public void newtest_AL_WorkerPass() {
	 assertTrue(w.itsOver9000(11092));
	 
 }
 
 
 @Test
 @DisplayName("Designed to Fail")
 public void newtest_AL_WorkerFail() {
	 assertTrue(w.itsOver9000(543));
	 
 }
 
}


