package maven;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/");
        Thread.sleep(1000);

        driver.findElement(By.id("login-username"))
              .sendKeys("ashwiniashu70608@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("login-passwd"))
              .sendKeys("Ashi@136");
        Thread.sleep(1000);

        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(10000);

        System.out.println("Yahoo login attempted successfully!");

        driver.quit();
    }
}
*/


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class YahooLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		try {
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://in.mail.yahoo.com");
		
		WebElement signin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signin-main\"]/div[1]/a")));
		signin.click();
		
		WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.name("Email")));
		username.sendKeys("YOUREMAIL"+Keys.ENTER);
		

		
		WebElement password=wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		password.sendKeys("yourPassword"+Keys.ENTER);

	
		}
		
		catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
		}
		finally {
			 System.out.println("Yahoo login attempted successfully!");
				driver.quit();
			}
	}

}


