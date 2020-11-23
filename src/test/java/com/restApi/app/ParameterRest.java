package com.restApi.app;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ParameterRest {
	
	
	
	
	@DataProvider
	
	public Object[][] dataprovider()
	{
		Object[][] a = new Object[1][2];
		a[0][0] = "Mayuresh";
		a[0][1] = "Pavnoji";
		
		return a;
		
	}
	
	
	@Test(dataProvider  = "dataprovider")
	
public void executionTest(String Firstname , String Lastname) {

		
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
