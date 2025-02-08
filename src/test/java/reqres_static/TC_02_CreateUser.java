package reqres_static;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

//import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;




public class TC_02_CreateUser {
	
	
	
	@Test
	public void verifyListUserTest() {
		
		
		baseURI = Constants.REQRES_Server;
		
		
		
		given().
			//header
			//body
			//auth
			//parameter
		
			body("	{\r\n"
					+ "    \"name\": \"Sushil Gupta\",\r\n"
					+ "    \"job\": \"Training Cordinator\"\r\n"
					+ "	}").
			
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
		
		when().
			post("/api/users").
			//get/post/put/patch/delete
		
		
		then().
		
			statusCode(201).
			body("name", equalTo("Sushil Gupta")).

		
			log().all();
			//validation
			//log;
		
		
	}

}
