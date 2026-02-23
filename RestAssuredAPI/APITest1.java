//GET SINGLE PRODUCT
package RestAssuredAPI;

import org.testng.annotations.Test;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

public class APITest1
{

	@Test
	public void getAllCategories() {

	    get("https://dummyjson.com/products/categories")
	    .then()
	    .statusCode(200)
	    .log().all();

	}

}
