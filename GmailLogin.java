package maven;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("identifierId"))
              .sendKeys("ashwiniashu70608@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(2000);
//
//        driver.findElement(By.name("Password"))
//              .sendKeys("Ashwini@914848");
//        Thread.sleep(2000);

        driver.findElement(By.id("passwordNext")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
*/



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")))
                .sendKeys("your_email@gmail.com");

        driver.findElement(By.id("identifierNext")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Password")))
                .sendKeys("your_password");

        driver.findElement(By.id("passwordNext")).click();
    }
}

