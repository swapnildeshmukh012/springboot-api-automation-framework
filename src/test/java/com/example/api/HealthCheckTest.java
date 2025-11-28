package com.example.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class HealthCheckTest {

    @Test
    void getStatus200() {
        RestAssured.
                given().
                when().
                    get("https://httpbin.org/status/200").
                then().
                    statusCode(200);
    }
}
