//PUT (UPDATE PRODUCT)
package RestAssuredAPI;
import org.testng.annotations.Test;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
public class APITest4 {
	@Test
	public void updateProduct() {

	    String body = "{ \"price\": \"1000\" }";

	    given()
	        .header("Content-Type","application/json")
	        .body(body)
	    .when()
	        .put("https://dummyjson.com/products/1")
	    .then()
	        .statusCode(200)
	        .log().all();
	}
}
