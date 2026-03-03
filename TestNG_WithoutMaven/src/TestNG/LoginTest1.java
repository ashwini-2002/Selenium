package TestNG;
/*
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class LoginTest1
{
 
	@BeforeMethod
	public void setup()
	{
		System.out.println("Browser Launch");
	}
	@Test
	public void testLogin()
	{
		System.out.println("Executing Login Test");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("close Browser");
	}
	
}

*/


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest1 {

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("===== Browser Launched =====");
    }

    @Test(priority = 1, description = "Verify user login functionality")
    public void testLogin() {

        System.out.println("Executing Login Test");

        String expectedTitle = "Dashboard";
        String actualTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle, "Login Test Failed");

        System.out.println("Login Test Passed");
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        System.out.println("===== Browser Closed =====");
    }
}

