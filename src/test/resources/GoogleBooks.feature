Feature: Google Book Searching from https://www.googleapis.com/books/v1/volumes?q={ID}

  Scenario Outline: Verify that the response status code is 200 and content type is JSON.
    Given webService endpoint is up
    When user sends a get request to webService endpoint using following details
      | ID | <ID> |
    Then verify response <statusCode> and <contentType> from webService endpoint response
    Examples:
      | ID | statusCode | contentType        |
      | 1  | 200        | "application/json; charset=UTF-8" |
      | 9546          | 200        | "application/json; charset=UTF-8" |
      | 9             | 200        | "application/json; charset=UTF-8" |




