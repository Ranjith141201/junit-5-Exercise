//01. Write a class to find the maximum of 2 numbers.
package io.javabrains;
import static org.junit.Assert.assertEquals;

import org.junit.Test;  

public class MaximumTest {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(3,Maximum.findMax(1,3));  
       
    }  
    
    @Test  
    public void testFindingMax(){  
        assertEquals(5,Maximum.findMax(5,7));  
       
    }  
}  