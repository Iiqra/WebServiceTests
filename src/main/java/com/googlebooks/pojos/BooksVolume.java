package com.googlebooks.pojos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BooksVolume {
    private String kind;
    private int totalItems;
    private List<Book> bookItems;
}

