package threesolid;


import static javafx.beans.binding.Bindings.and;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {
    
    
 private Worker w = new Worker();
 
 
 @Test
 @DisplayName("Work Method Test Pass")
 public void newtest_zas_WorkerPass()
 {
 assertEquals(w.work(),"Worker is working!", "Mismatch between test text and method text");
 }

 @Test
 @DisplayName("Work Method Test Fail")
 public void newtest_zas_WorkerFail()
 {
 assertEquals(w.work(),"Worker isnt working!", "Mismatch between test text and method text");
 }
 
}


