package reqres;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC01_GET_Listuser {
	
	
	
	@Test
	public void verifyListUserAPI() {
		
		System.out.println("Api test execution started......");
		
		
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		
		System.out.println("StatusCode: " +resp.getStatusCode());
		System.out.println("getContentType: " +resp.getContentType());
		System.out.println("getStatusLine: " +resp.getStatusLine());
		System.out.println("getTime: " +resp.getTime());
		
		
		
		Assert.assertEquals(resp.getStatusCode(), 200);
		
		
		
	}

}
