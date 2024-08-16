import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class queryParameter {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        RequestSpecification request = RestAssured.given();
        request.queryParam("page", "2");
        Response response= request.get();
        response.prettyPrint();


    }
}
