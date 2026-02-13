package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FourthTest_Script {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

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

