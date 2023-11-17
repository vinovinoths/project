package Headers_Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Head_Validation {
	
	
	@Test
	public void Header_Validation() {
		
		
		Response res = given().when().get("http://localhost:3000/posts");
		
		Headers  head = res.getHeaders();
		
	      String content = res.getContentType();
	      
	      Assert.assertEquals(content, "application/json; charset=utf-8");
	      
	     String vary = head.getValue("Vary");
	     
	     System.out.println(vary);
		
		
	}

}
