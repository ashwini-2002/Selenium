/*
@BeforeClass   → runs once at start
@Test          → test1
@Test          → test2
@Test          → test3
@AfterClass    → runs once at end


*/

package MavenTestng;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterClass {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        System.out.println("Opening browser once");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority=1)
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google opened");
    }

    @Test(priority=2)
    public void openAmazon() {
        driver.get("https://www.amazon.in");
        System.out.println("Amazon opened");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Closing browser once");
        driver.quit();
    }
}
