import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class postRequest {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body("{\"name\": \"mary\", \"job\": \"leader\"}");
        Response response = request.when().post();
        response.prettyPrint();
        // response.then().statusCode(201);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,201);


    }
}