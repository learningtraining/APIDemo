package gitHUB;

import org.testng.annotations.Test;

import utility.Constants;

//import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;




public class TC_01_ListUser {
	
	
	
	@Test
	public void verifyListUserTest() {
		
		//https://api.github.com/orgs/ORG/repos
		baseURI = "https://api.github.com";
		
		
		
		given().
			//header
			//body
			//auth
//			auth().
//				oauth2("").
			//parameter
		
		when().
			get("/orgs/ibm/repos").
			//get/post/put/patch/delete
		
		
		then().
		
			statusCode(200).
//			body("data[0].email", equalTo("michael.lawson@reqres.in")).
			body("[1].description", equalTo("IBM Open Source at GitHub")).
		
			
			
			
			log().all();
			//validation
			//log;
		
		
	}

}
