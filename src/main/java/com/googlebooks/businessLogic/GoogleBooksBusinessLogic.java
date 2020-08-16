package com.googlebooks.businessLogic;

import com.googlebooks.pojos.BooksVolume;
import com.googlebooks.utils.PropertyReader;
import io.restassured.response.Response;

public class GoogleBooksBusinessLogic extends PropertyReader {

    public static BooksVolume getBooksVolumeResponseObject(Response jsonResponse){

        BooksVolume booksVolumePojo = jsonResponse.getBody().as(BooksVolume.class);
        System.out.println("String representation of booksVolume response pojo " + booksVolumePojo.toString());
        return booksVolumePojo;
    }
}
