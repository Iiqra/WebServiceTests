Feature: Google Book Searching from https://www.googleapis.com/books/v1/volumes?q={ID}

  Scenario Outline: Verify that the response status code is 200 and content type is JSON.
    Given webService endpoint is up
    When user sends a get request to webService endpoint using following details
      | ID | <ID> |
    Then verify <statusCode> and <contentType> from webService endpoint response
    Examples:
      | ID   | statusCode | contentType                       |
      | 1    | 200        | "application/json; charset=UTF-8" |
      | 9546 | 200        | "application/json; charset=UTF-8" |
      | 9    | 200        | "application/json; charset=UTF-8" |


  Scenario Outline: Verify the item kind and count in response body
    Given webService endpoint is up
    When user sends a get request to webService endpoint using following details
      | ID | <ID> |
    Then verify <kind> and itemcount is not null from webService endpoint response
    Examples:
      | ID | kind            |
      | 1  | "books#volumes" |
      | 2  | "books#volumes"   |
      | 7  | "books#volumes"   |


#TODO: if something is repetitive in example mapping like statusCode, contentType and kind in above two examples, how to pass it once.


