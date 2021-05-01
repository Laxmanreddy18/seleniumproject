package demoapp;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertsdemo 
{
	SoftAssert softassert=new SoftAssert();
	
	@Test
     public void asserttestcases()
     {
    	 System.out.println("open browser");
    	 Assert.assertEquals( true, true);
    	 
    	 System.out.println("enter username");
    	 System.out.println("enter password");
    	 
    	 softassert.assertEquals( true, false);
    	 
    	 System.out.println("click on signin  button");
    	 System.out.println("validate homepage");
    	 
    	 
    	 softassert.assertAll();
    	 
    	 
     }
}
