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
 @DisplayName("Strings are the same!")
 public void newtestAVWorkerPass()
 {
  String a = "I love dogs!";
  String b = "I love dogs!";

  assertTrue(a.equals(b), "Both Love dogs!");
 }

 @Test
 @DisplayName("strings are not the same!")
 public void newtestAVWorkerFail()
 {
  String a = "I love dogs!";
  String b = "I love cats!";
  assertTrue(a.equals(b), "One loves dogs and other loves cats!");
 }
 
}
