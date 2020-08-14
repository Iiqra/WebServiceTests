package com.googlebooks.stepDefinitions;
import com.googlebooks.pojos.BooksVolume;
import com.googlebooks.utils.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jruby.RubyProcess;
import org.junit.Assert;
import io.restassured.response.ValidatableResponse;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

import static com.Constants.ServiceConstant.BASE_URL;
import static io.restassured.RestAssured.given;


public class BookStepDefinition extends PropertyReader {

    private RequestSpecification requestSpecification;
    private Response response;
    private BooksVolume booksVolume;
    private ValidatableResponse json;
    private RequestSpecification request;
    //private String ENDPOINT_GET_BOOK_BY_ISBN = "https://www.googleapis.com/books/v1/volumes";

    @Given("webService endpoint is up")
    public void webserviceEndpointIsUp() {
        requestSpecification = new RequestSpecBuilder().
                //setBaseUri(ENDPOINT_GET_BOOK_BY_ISBN).
                setBaseUri(prop.getProperty(BASE_URL)).
                build();
    }

    @When("user sends a get request to webService endpoint using following details")
    public void userSendsAGetRequestToWebServiceEndpointUsingID(Map<String, String> data) {
        String ID = data.get("ID");
        System.out.println("The current ID is: " + ID);
        String pathParameters = "?q" + "=" + ID;
        response = given().
                spec(requestSpecification).
                when().
                get(pathParameters);
    }

    @Then("verify response {int} and {string} from webService endpoint response")
    public void verifyResponseStatusCodeAndContentTypeFromWebServiceEndpointResponse(int statusCode, String contentType) {
        Assert.assertEquals(statusCode, response.getStatusCode());
        Assert.assertEquals(contentType, response.getContentType());
    }
}