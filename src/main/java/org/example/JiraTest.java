package org.example;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class JiraTest {
    public static void main(String[] args) {
        RestAssured.baseURI = "http://localhost:8080";
        given().pathParam("id", "10101").body("{\n" +
                "    \"body\": \"My first comment\",\n" +
                "    \"visibility\": {\n" +
                "        \"type\": \"role\",\n" +
                "        \"value\": \"Administrators\"\n" +
                "    }\n" +
                "}").post("/rest/api/2/issue/{issueIdOrKey}/comment")
    }


    }
