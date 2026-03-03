/*
package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataTest
{
 
	
	@Test(dataProvider="loginData")
	public void loginTest(String username, String password)
	{
		System.out.println(username + " " + password);
	}
	
	@DataProvider(name ="loginData")
	public Object[][] getData()
	{
		return new Object[][]
		{
			{"user1", "pass1"},
			{"user2", "pass2"},
        };
	}
}
*/

package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {

    @Test(dataProvider = "loginData", description = "Verify login with multiple credentials")
    public void loginTest(String username, String password) {

        System.out.println("Executing test with -> Username: " + username + " | Password: " + password);

        boolean loginStatus = performLogin(username, password);

        Assert.assertTrue(loginStatus, "Login failed for user: " + username);

        System.out.println("Login successful for: " + username);
    }

    @DataProvider(name = "loginData", parallel = true)
    public Object[][] getData() {

        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"admin", "admin123"}
        };
    }

    // Dummy login method (simulation)
    public boolean performLogin(String username, String password) {

        return username.length() > 0 && password.length() > 0;
    }
}