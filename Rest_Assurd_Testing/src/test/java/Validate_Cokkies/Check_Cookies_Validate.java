package Validate_Cokkies;

import org.testng.annotations.Test;



import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Check_Cookies_Validate {
	
	@Test
	public void Cookies() {
		
		
		Response res = given().when().get("https://www.google.com");
		
		Map<String, String>  cook = res.getCookies();
		
		
	     Set<String> co = cook.keySet();
	     
	      
	     Iterator<String> sj = co.iterator();
	     
	     String frist_key = sj.next();
	    String second_key = sj.next();    
	    String Third_key  = sj.next();
	    
	   String frist = res.getCookie(frist_key);
	   
	   String second = res.getCookie(second_key);
	   
	   String third = res.getCookie(Third_key);
	   
	   System.out.println(frist_key+"   ="+frist);
	   
	   System.out.println(second_key+"   ="+second);
	   
	   System.out.println(Third_key+"   ="+third);
	    
	    
	  
	     
	     
	     
	     
			
		}
		
		
	}


