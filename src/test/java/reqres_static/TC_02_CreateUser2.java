package reqres_static;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

//import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;




public class TC_02_CreateUser2 {
	
	
	
	@Test
	public void verifyListUserTest() {
		
		
		baseURI = Constants.REQRES_Server;
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Sushil Gupta");
		request.put("job", "Training Cordinator");
		
		
		System.out.println("Request Body: " + request.toJSONString());
		
		
		given().
			//header
			//body
			//auth
			//parameter
		
			body(request.toJSONString()).
			
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
