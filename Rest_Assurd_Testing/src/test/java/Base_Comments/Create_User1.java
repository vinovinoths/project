package Base_Comments;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Create_User1 {
	
	
	@Test
	public void Create_User() {
		
		File file = new File ("src\\test\\resources\\Body.json");
		
		Response res = given().contentType("application/json; charset=utf-8").body(file)
		.when().post("http://localhost:3000/posts");
		
		String  body =res.getBody().asString();
		
		
		DocumentContext context = JsonPath.parse(body);
		
		Object title = context.read("$.title");
		
		Assert.assertEquals(title, "sanjeevi");
		
	
	}

}
