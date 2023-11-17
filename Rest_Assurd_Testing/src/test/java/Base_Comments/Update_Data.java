package Base_Comments;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class Update_Data {

	
	@Test
	public void Update() {
		
		File file = new File ("src\\test\\resources\\Body.json");
		
		given().contentType("application/json; charset=utf-8").body(file)
		.when().put("http://localhost:3000/posts/10");
		
		
	}
}
