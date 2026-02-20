//Multiple @Test methods
package MavenTestng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

    @Test                       // If you don’t write priority → TestNG may run alphabetically.
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Google Title: " + driver.getTitle());
        driver.quit();
    }

    @Test
    public void openFacebook() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println("Facebook Title: " + driver.getTitle());
        driver.quit();
    }
}

