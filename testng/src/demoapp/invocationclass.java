package demoapp;

import org.testng.annotations.Test;

public class invocationclass 
 {
	@Test(invocationCount=10)
    public void invocationmethod()
    {
    	int a=10;
    	int b=30;
    	int c=a+b;
    	System.out.println("sum...."+c);
    }
	
}
