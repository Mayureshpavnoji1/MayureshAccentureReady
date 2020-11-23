package com.restApi.app;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataproviderTest {
	
	
@DataProvider
	
	public Object[][] dataprovider()
	{

		
		return new Object[][] {
				{"Mayuresh","Pavnoji"}
		};
		
	}
	
	
	@Test(dataProvider  = "dataprovider")
	
public void executionTest(Object Firstname , Object Lastname) {

		
		JSONObject request = new JSONObject();
		
		request.put("name",Firstname);
		request.put("LastName", Lastname);
	    
		
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
		
	

}
