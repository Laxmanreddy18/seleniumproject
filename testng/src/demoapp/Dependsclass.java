package demoapp;

import org.testng.annotations.Test;

public class Dependsclass
{
		@Test(groups="demo")
       public void logintest()
       {
    	   System.out.println("login in test success");
    	   int j=1/1;
       }
		@Test(dependsOnMethods="logintest",groups="demo")
       public void homepagetest()
       {
			 System.out.println("homepagetest in test success");
       }
		@Test(dependsOnMethods="logintest",groups="demo")
       public void logouttest()
       {
			 System.out.println("logout test in test success");
       }
		@Test(dependsOnMethods="logintest",groups="demo")
	       public void newtest()
	       {
				 System.out.println("new test in test success");
	       }
		@Test()
	       public void searchtest()
	       {
				 System.out.println("search test in test success");
	       }

	
}
