package Selenium_WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.name("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.name("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.name("login-button"))
                .click();

        Thread.sleep(4000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("checkout"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("first-name"))
                .sendKeys("Ashwini");

        driver.findElement(By.id("last-name"))
                .sendKeys("CM");

        driver.findElement(By.id("postal-code"))
                .sendKeys("583101");

        driver.findElement(By.id("continue"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("finish"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("back-to-products"))
                .click();

        Thread.sleep(3000);

        driver.quit();
    }
}




/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

     
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

       
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

       
        driver.findElement(By.id("login-button"))
              .click();

        
        Thread.sleep(5000);

        driver.quit();
    }
}
*/


/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.name("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.name("login-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"))
              .click();

        System.out.println("Product Added");

        Thread.sleep(2000);

        driver.findElement(By.className("shopping_cart_link"))
              .click();

        System.out.println("Cart Page Opened");

        Thread.sleep(3000);

        driver.quit();
    }
}
*/


