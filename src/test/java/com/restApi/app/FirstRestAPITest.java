package com.restApi.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class FirstRestAPITest {

	@Test
	public void test_01() {

		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		int status = response.getStatusCode();
		Assert.assertEquals(status, 201);

	}

	/*
	 * @Test public void test_02() {
	 * 
	 * 
	 * given().get("https://reqres.in/api/users?page=2").then().statusCode(201);
	 * 
	 * }
	 */

}
