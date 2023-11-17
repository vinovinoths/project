package Schema_Validation;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Validate_Schema2 {
	
	
	@Test
	public void Validate2() {
		
		
		Response res = given().when().get("https://dummyapi.online/api/movies");
		
		String body = res.getBody().asString();
		
		File file = new File ("src\\test\\resources\\Schema.json");
		
		MatcherAssert.assertThat(body, JsonSchemaValidator.matchesJsonSchema(file));
		
	}

}
