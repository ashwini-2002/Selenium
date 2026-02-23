//GET ALL PRODUCTS
package RestAssuredAPI;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
public class APITest2 {
	@Test
	public void getAll() {

	    //get("https://dummyjson.com/products")
	   // .then()
	   // .statusCode(200)          //status code-200
	   // .log().all();             //it prints all the data in console
	    //we have 194 but it will show 30
	    
		get("https://dummyjson.com/products?limit=194")
		.then()
		.statusCode(200)
		.log().all(); 
	}
}
