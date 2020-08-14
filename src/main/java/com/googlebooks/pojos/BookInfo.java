package com.googlebooks.pojos;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookInfo {
    private String title;
    private String publisher;
    private List<String> authors;
    private int pageCount;
}
