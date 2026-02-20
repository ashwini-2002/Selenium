package MavenTestng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class LoginTest
{
	
	WebDriver driver;
//	@BeforeMethod
//	public void setup()
//	{
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//	}
	
	@BeforeMethod
	public void setup()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get("https://practicetestautomation.com/practice-test-login");  
	}

	@Test(dataProvider="excelData")
	public void loginTest(String username, String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="excelData")
	public Object[][] getExcelData() throws Exception
	{
	    String path = System.getProperty("user.dir") + "\\TestData\\LoginData.xlsx";
	    return ExcelUtils.getEcelData(path, "Sheet1");
	}
 
 
}