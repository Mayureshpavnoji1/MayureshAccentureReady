package com.restApi.app;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;

public class RestAPI2 {

	public static void main(String[] args) {

		
		JSONObject request = new JSONObject();
		
		request.put("name","Mayuresh3");
		request.put("Surname", "Pavnoji3");
		request.put("Id", "1");
		
		request.put("name","Mayuresh3");
		request.put("Surname", "Pavnoji3");
		request.put("Id", "2");
		
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
		

	}


