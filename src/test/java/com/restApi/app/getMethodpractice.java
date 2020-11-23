package com.restApi.app;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getMethodpractice {
	
	
	@Test
	
	public void getMethodHandson() {
		
		
given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
.body("data.id[1]",equalTo(8)).log().all()
.body("data.first_name",hasItems("Michael","Lindsay","Tobias")).log().all();
				


				
				
	}
	
	
	@Test
	
	public void  test_2_post() {
		Map<String, Object> map  = new HashMap<String , Object>(); 
		
		map.put("name","Mayuresh");
		map.put("Surname", "Pavnoji");
		
		System.out.println(map);
		 		
	}
	
	
	
@Test
	
	public void  test_3_post() {
	JSONObject request = new JSONObject();
		
		request.put("name","Mayuresh1");
		request.put("Surname", "Pavnoji1");
		
		System.out.println(request);
		
		System.out.println(request);
		
		given()
		.header("Content-Type","application/json")
		.body(request.toString())

		.accept(ContentType.JSON)
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}

@Test
public void  test_4_post() {
JSONObject request = new JSONObject();
	
	request.put("name","Mayuresh1");
	request.put("Surname", "Pavnoji1");
	
	System.out.println(request);
	
	System.out.println(request);
	
	given()
	.header("Content-Type","application/json")
	.body(request.toString())

	.accept(ContentType.JSON)
	.when()
	.get("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();
}

@Test
public void  test_5_post() {
JSONObject request = new JSONObject();
	
	request.put("name","Mayuresh2");
	request.put("Surname", "Pavnoji2");
	
	System.out.println(request);
	
	System.out.println(request);
	
	given()
	.header("Content-Type","application/json")
	.body(request.toString())

	.accept(ContentType.JSON)
	.when()
	.patch("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();
}

@Test
public void  test_6_post() {
JSONObject request = new JSONObject();
	
	request.put("name","Mayuresh2");
	request.put("Surname", "Pavnoji2");
	
	System.out.println(request);
	
	System.out.println(request);
	
	given()
	.header("Content-Type","application/json")
	.body(request.toString())

	.accept(ContentType.JSON)
	.when()
	.delete("https://reqres.in/api/users/2")
	.then()
	.statusCode(204)
	.log().all();
}
	

}
