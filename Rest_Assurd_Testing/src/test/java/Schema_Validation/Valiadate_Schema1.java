package Schema_Validation;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class Valiadate_Schema1 {
	
	
	@Test
	public void Validate() {
		
		given().when().get("https://dummyapi.online/api/movies").then().log().all().
		body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));
		
	}

}
