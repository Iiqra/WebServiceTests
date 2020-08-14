package com.googlebooks.pojos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String kind;
    private String id;
    private BookInfo bookInfo;
}
