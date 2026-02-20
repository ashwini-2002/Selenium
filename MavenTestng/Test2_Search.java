package MavenTestng;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_Search {

 @Test
 public void search() throws InterruptedException {

  WebDriver d = new ChromeDriver();
  d.get("https://google.com");

  d.findElement(By.name("q")).sendKeys("Selenium\n");

  //Thread.sleep(2000);  

  d.quit();
 }
}
