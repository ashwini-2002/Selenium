package MavenTestng;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_TitleCheck {

 @Test
 public void check(){
  WebDriver driver=new ChromeDriver();
  driver.get("https://google.com");

  String title=driver.getTitle();

  if(title.contains("Google"))
   System.out.println("PASS");
  else
   System.out.println("FAIL");

  driver.quit();
 }
}

