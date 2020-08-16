package com.googlebooks.businessLogic;

import com.googlebooks.pojos.BooksVolume;
import com.googlebooks.utils.PropertyReader;
import io.restassured.response.Response;

public class GoogleBooks extends PropertyReader {

    public static BooksVolume getBooksVolumeResponseObject(Response jsonResponse){

        BooksVolume booksVolumePojo = jsonResponse.getBody().as(BooksVolume.class);
        return booksVolumePojo;
    }
}
