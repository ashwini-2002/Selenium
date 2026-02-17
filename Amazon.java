package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.titleContains("Amazon"));
		System.out.println("Title : "+driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList"))).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email_login"))).sendKeys("ashwiniashu70608@gmail.com");
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("a-button-input"))).click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password"))).sendKeys("Ashwini@13");
		Thread.sleep(2000);
	
		wait.until(ExpectedConditions.elementToBeClickable(By.id("auth-signin-button"))).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys("laptops");
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button"))).click();
		Thread.sleep(2000);
	
		Actions action = new Actions(driver);    //scrolling
		//scroll 3 times
		for(int i = 0; i < 3; i++) {
		    action.sendKeys(Keys.PAGE_DOWN).perform();
		    Thread.sleep(1000);
		}
		
		//Click first product
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Add to cart']"))).click();
		
		//Go to cart 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart"))).click();
		Thread.sleep(2000);
		
		// Change quantity to 2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-a-selector='increment']"))).click();
		Thread.sleep(2000);
		
		//go to todays deals
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[5]/div/a"))).click();
		Thread.sleep(2000);
		
		//add a product(+)
		wait.until(ExpectedConditions.elementToBeClickable(By.className("AddToCartButton-module__button_TcMx1cTHLgexwyILmVbf"))).click();
		Thread.sleep(2000);
		
		//add to cart
		wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//button[@data-testid='add-to-cart-variational-modal-button']"))).click();
		Thread.sleep(2000);
		
		//go to cart
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart"))).click();
		Thread.sleep(2000);
		WebElement checkbox = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("//input[contains(@aria-label,'for checkout')]")
			    )
			);
			
		// toggle using keyboard 
		checkbox.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		
		//proceed to checkout
		WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(
		    By.name("proceedToRetailCheckout")));
		proceedBtn.click();
		Thread.sleep(2000);
		
		//select netbanking radio button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio' and contains(@value,'NetBanking')]"))).click();
		Thread.sleep(1000);
		
		//click on choose
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Choose an Option']"))).click();
		Thread.sleep(1000);
		
		//select from dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='State Bank of India']"))).click();
		Thread.sleep(1000);
		driver.quit();

	}

}

/*

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
public class Amazon {

	public static void main(String[] args) {
		
	
		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
		 
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		        driver.get("https://www.amazon.in");
		 
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		 
		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");

		        driver.findElement(By.id("nav-search-submit-button")).click();

		        driver.findElement(By.id("a-autoid-3-announce")).click();
		 
//		        String mainWindow = driver.getWindowHandle();
//		 
//		        for (String handle : driver.getWindowHandles()) {
//
//		            if (!handle.equals(mainWindow)) {
//
//		                driver.switchTo().window(handle);
//
//		                break;
//
//		            }
//
//		        }
		 
		        driver.findElement(By.id("nav-cart-count")).click();
		 
		        driver.quit();

		    }

		}

*/