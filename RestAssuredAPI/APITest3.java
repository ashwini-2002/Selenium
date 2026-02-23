//POST (CREATE PRODUCT)
package RestAssuredAPI;

import org.testng.annotations.Test;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
public class APITest3 {
	@Test
	public void createProduct() {

	    String body = "{ \"title\": \"Perfume Oil\", \"price\": 100 }";

	    given()
	        .header("Content-Type","application/json")
	        .body(body)
	    .when()
	        .post("https://dummyjson.com/products/add")
	    .then()
	        .statusCode(201)            //status code 201 for post
	        .log().all();               //default it wil add to 195 // even if we give another product still we get 195 only
	}
}
