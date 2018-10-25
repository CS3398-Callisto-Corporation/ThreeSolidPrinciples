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
 @DisplayName("Designed to Fail")
 public void testToFail() {
	 assertTrue(w.isPositive(-1));
	 
 }



@Test
@DisplayName("Designed to Pass")
public void testToPass() {
	 assertTrue(w.isPositive(1));
	 
	}
}
