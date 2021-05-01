package demoapp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstprogram 
{
	
	@BeforeTest
	public void openbrowser()
	{
		System.out.println("open browser");
	}
	@BeforeClass
    public void setup()
    {
    	System.out.println("setup success");
    }
	@Test(priority=1,groups={"login"})
    public void login()
    {
    	System.out.println("login to account");
    }
	@Test(priority=2,groups={"login","homepage"})
    public void homepage()
    {
    	System.out.println("homepage accessed");
    }
	@Test(priority=5,groups={"basicdetails","search"})
    public void selectelement()
    {
    	System.out.println("enter the fields");
    }
	@Test(priority=3,groups={"basicdetails"})
    public void savepage()
    {
    	System.out.println("page saved successfully");
    }
	@Test(priority=4,groups={"basicdetails"})
    public void secondpage()
    {
    	System.out.println("fill the required details");
    }
	@Test(priority=6,groups={"Documents"})
    public void adddocuments()
    {
    	System.out.println("Documents added successfully");
    }
	
	@AfterClass
    public void quit()
    {
    	System.out.println("quit browser");
    }
	@AfterTest
	public void logout()
    {
    	System.out.println("logout to account");
    }
}
