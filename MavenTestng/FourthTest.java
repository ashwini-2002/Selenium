//Using Before & After methods
package MavenTestng;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthTest {

    WebDriver driver;

    @BeforeMethod     //runs before every test
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @Test     
    public void openAmazon() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @AfterMethod   //runs after every test
    public void closeBrowser() {
        driver.quit();
    }
}

