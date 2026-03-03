/*
package TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
 
public class AssertionTest
{
 
@Test
public void verifyTitle()
{
	String actual ="Google";
	String expected="Google";
	Assert.assertEquals(actual, expected);
}
 
 
}
*/

package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    @Test(description = "Verify page title is correct")
    public void verifyTitle() {

        System.out.println("Starting Title Verification Test");

        String actualTitle = "Google";
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle, 
                "Title mismatch - Test Failed");

        System.out.println("Title Verification Passed");
    }
}