package com.googlebooks.stepDefinitions;
import com.googlebooks.businessLogic.GoogleBooksBusinessLogic;
import com.googlebooks.pojos.BooksVolume;
import com.googlebooks.utils.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import io.restassured.response.ValidatableResponse;

import java.util.Map;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;
import static com.googlebooks.constants.ServiceConstants.BASE_URL;


public class BookStepDefinition extends PropertyReader {

    private RequestSpecification requestSpecification;
    private Response response;
    private BooksVolume booksVolumePojo;
    private ValidatableResponse json;
    private RequestSpecification request;
    private String expectedResponseKind;
    private int expectedResponseItemCount;

    //private String ENDPOINT_GET_BOOK_BY_ISBN = "https://www.googleapis.com/books/v1/volumes";

    @Given("webService endpoint is up")
    public void webserviceEndpointIsUp() {
        requestSpecification = new RequestSpecBuilder().
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
        booksVolumePojo = GoogleBooksBusinessLogic.getBooksVolumeResponseObject(response);
    }

    @Then("verify {int} and {string} from webService endpoint response")
    public void verifyResponseStatusCodeAndContentTypeFromWebServiceEndpointResponse(int statusCode, String contentType) {
        Assert.assertEquals(statusCode, response.getStatusCode());
        Assert.assertEquals(contentType, response.getContentType());
    }

    @Then("verify {string} and {int} from webService endpoint response")
    public void verifyKindAndItemCountFromWebServiceEndpointResponse(String a, int b) {
        Assert.assertEquals(a, booksVolumePojo.getKind());
        Assert.assertEquals(b, booksVolumePojo.getTotalItems());
    }

    @Then("verify {string} and itemcount is not null from webService endpoint response")
    public void verifyKindAndItemcountIsNotNullFromWebServiceEndpointResponse(String expectedResponseKind) {
        Assert.assertEquals(expectedResponseKind, booksVolumePojo.getKind());
        Assert.assertNotNull(booksVolumePojo.getTotalItems());
    }
}