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
 @DisplayName("Over 100 Method Test Pass")
 public void passOverOneHundredMethond()
 {
     assertTrue(w.overOneHundred(1000000), "Fail!");
 }
 
 
 @Test
 @DisplayName("Over 100 Method Test Fail")
 public void failOverOneHundredMethond()
 {
     assertTrue(w.overOneHundred(10), "Fail!");
 }
 
}


