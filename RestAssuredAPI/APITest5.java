//DELETE PRODUCT
package RestAssuredAPI;
import org.testng.annotations.Test;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
public class APITest5 {
	@Test
	public void deleteProduct() {

	    given()
	    .when()
	        .delete("https://dummyjson.com/products/2")
	    .then()
	        .statusCode(200)
	        .log().body();
	    System.out.println("DELETE PRODUCT");
	}
}
