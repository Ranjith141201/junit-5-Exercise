package io.javabrains;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GcdTest {
	 
    @Test  
    public void FindGcdPositive(){  
        assertEquals(6,Gcd.findgcd(24,18));  
       
    }  
    
    @Test  
    public void FindGcdNegative(){  
        assertEquals(3,Gcd.findgcd(24,18));  
       
    }  
}  
