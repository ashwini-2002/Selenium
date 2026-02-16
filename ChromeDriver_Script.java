package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver_Script {

    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {
        	driver.manage().window().maximize(); //all are this builtin methods
            driver.get("https://www.google.com");
            
            String title =driver.getTitle();
    	    System.out.println("Page Title" + title);
    	
    	    if(title.contains("Google"))
    	    {
    	    	System.out.println("Test Pass");
    	    }
    	    else
    	    {
    	    	System.out.println("Test Fail");
    	    }
            
        }catch(Exception e) 
        {
        System.out.println("Exception occured: " +e.getMessage() );
        }
        finally {
        driver.quit();
    }
}
}
