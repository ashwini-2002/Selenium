///html/body/div[2]/div[4]/form/div[1]/div[1]/div[1]/div[1]/div[3]/textarea


package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreSeleniumHomePage {

    public static void main(String[] args) {

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



/*package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreSeleniumHomePage{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        driver.findElement(By.name("q"))
              .sendKeys("Official Website of Selenium");

        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        driver.quit();
    }
}
*/
