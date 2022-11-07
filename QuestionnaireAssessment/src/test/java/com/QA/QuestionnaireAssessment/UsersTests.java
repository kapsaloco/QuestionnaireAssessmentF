//package com.QA.QuestionnaireAssessment;
//
//import static io.restassured.RestAssured.*;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//@SpringBootTest
//class UsersTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	void getAllUsers_test() {
//
//		Response response = given().contentType(ContentType.JSON).when().get("http://localhost:8081/api/users")
//				.then().log().all().extract().response();
//
//		Assertions.assertEquals(200, response.statusCode());
//
//	}
//
//	@Test
//	void getSpecificUser_test() {
//
//		Response response = given().contentType(ContentType.JSON).when().get("http://localhost:8081/api/users/1")
//				.then().log().all().extract().response();
//
//		Assertions.assertEquals(200, response.statusCode());
//
//	}
//
//	@Test
//	void postCreateUser_test() {
//		String requestBody = "{\n" + "  \"email\": \"email@solera.com\"\n}";
//
//		Response response = given().header("Content-type", "application/json").and().body(requestBody).when()
//				.post("http://localhost:8081/api/users").then().log().all().extract().response();
//
//		Assertions.assertEquals(201, response.statusCode());
//
//	}
//
//	@Test
//	void deleteSpecificUser_test() {
//
//		Response response = given().contentType(ContentType.JSON).when().delete("http://localhost:8081/api/users/2")
//				.then().log().all().extract().response();
//
//		Assertions.assertEquals(200, response.statusCode());
//	}
//}
