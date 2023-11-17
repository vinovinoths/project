package Body_Validation;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Respose_Body {
	
	
	@Test
	public void Body_Valdation() {
		
		File file = new File("src\\test\\resources\\Schema.json");
		
		Response res = given().when().get("https://dummy.restapiexample.com/api/v1/employees");
		
		String body = res.getBody().asString();
		
		System.out.println(body);
		
		MatcherAssert.assertThat(body, JsonSchemaValidator.matchesJsonSchema(file));
		
		DocumentContext  context = JsonPath.parse(body);
		
		Object name = context.read("$.data[0].employee_name");
		
		System.out.println(name);
		
		Assert.assertEquals(name, "Tiger Nixon");
		
		
		
		
	}

}
