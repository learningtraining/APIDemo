package reqres_static;

import org.testng.annotations.Test;

import utility.Constants;

//import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;




public class TC_01_ListUser {
	
	
	
	@Test
	public void verifyListUserTest() {
		
		
		baseURI = Constants.REQRES_Server;
		
		
		
		given().
			//header
			//body
			//auth
			//parameter
		
		when().
			get("/api/users?page=2").
			//get/post/put/patch/delete
		
		
		then().
		
			statusCode(200).
			body("data[0].email", equalTo("michael.lawson@reqres.in")).
			body("data[1].email", equalTo("lindsay.ferguson@reqres.in")).
		
			log().all();
			//validation
			//log;
		
		
	}

}
