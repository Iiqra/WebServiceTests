package com.googlebooks.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BooksVolume {
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("totalItems")
    private int totalItems;

    @JsonProperty("items")
    private List<Book> bookItems;

    @Override
    public String toString() {
        return "ClassPojo [kind = " + kind + ", totalItems = " + totalItems + ", bookItems = " + bookItems +"]";
    }
}

