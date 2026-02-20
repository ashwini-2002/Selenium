package MavenTestng;

import org.testng.annotations.Test;

public class Test3_Disabled {

 @Test
 public void run(){
  System.out.println("This runs");
 }

 @Test(enabled=false)
 public void skip(){
  System.out.println("This will NOT run");
 }
}
