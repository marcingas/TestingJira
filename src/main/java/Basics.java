import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class Basics {
    public static void main(String[] args) {
        baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body("{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Marcin house\",\n" +
                "  \"phone_number\": \"754 464 446\",\n" +
                "  \"address\": \"Zywiec, ul Krasickiego 21\",\n" +
                "  \"types\": [\n" +
                "    \"It Tech\",\n" +
                "    \"It Java Api Testing\"\n" +
                "  ],\n" +
                "  \"website\": \"http://marcin.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}\n").when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200);

    }

}
