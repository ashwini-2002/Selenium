package MavenTestng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {

    @Test(priority = 1)
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Google Title: " + driver.getTitle());
        driver.quit();
    }

    @Test(priority = 2)
    public void openFacebook() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println("Facebook Title: " + driver.getTitle());
        driver.quit();
    }
}
