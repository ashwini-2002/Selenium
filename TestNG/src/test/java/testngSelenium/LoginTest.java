package testngSelenium;


import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeClass                         //Runs only one time before all tests start
    public void beforeClass() {
        System.out.println("Environment Setup");
    }

    @BeforeMethod           //@BeforeMethod → it will launch browser
    public void setup() {
        System.out.println("Browser Launched & Login Page Opened");
    }

    //We write ONE test and give multiple data sets
    @Test(dataProvider = "loginData")
    public void loginTest(String username,
                          String password,
                          String expectedResult) {

        String actualResult = performLogin(username, password);

        System.out.println("Expected: " + expectedResult +
                " | Actual: " + actualResult);

        Assert.assertEquals(actualResult,
                expectedResult,
                "Login Test Failed");
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][]{
                {"user1", "pass1", "success"},
                {"user1", "wrong", "error"},
                {"wrong", "pass1", "error"},
                {"", "", "validation"}
        };
    }

    public String performLogin(String username, String password) {

        if(username.isEmpty() || password.isEmpty())
            return "validation";

        if(username.equals("user1") && password.equals("pass1"))
            return "success";

        return "error";
    }

    @AfterMethod                //@AfterMethod → close browser
    public void teardown() {
        System.out.println("Browser Closed");
    }

    @AfterClass                 //Runs after all tests finish.
    public void afterClass() {
        System.out.println("Environment Cleanup");
    }
}
