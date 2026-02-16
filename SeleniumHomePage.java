package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHomePage {

    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            
            driver.get("https://www.google.com");
            System.out.println("Google Opened");

            Thread.sleep(3000);  

            driver.get("https://www.selenium.dev/");
            System.out.println("Selenium Website Opened");

           
            System.out.println("Waiting for 5 seconds...");
            Thread.sleep(5000);   

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
