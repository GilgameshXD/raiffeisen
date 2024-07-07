package httpCat;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    private static final String BASE_URL = "https://http.cat/";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void getStatus200() {
        given()
                .when()
                .get("200")
                .then()
                .statusCode(200)
                .contentType("image/jpeg");
    }

    @Test
    public void getStatus400() {
        given()
                .when()
                .get("400")
                .then()
                .statusCode(200)
                .contentType("image/jpeg");
    }

    @Test
    public void getStatus404() {
        given()
                .when()
                .get("404")
                .then()
                .statusCode(200)
                .contentType("image/jpeg");
    }

    @Test
    public void getStatus500() {
        given()
                .when()
                .get("500")
                .then()
                .statusCode(200)
                .contentType("image/jpeg");
    }
}
