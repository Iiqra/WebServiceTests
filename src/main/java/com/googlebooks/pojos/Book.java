package com.googlebooks.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("id")
    private String id;

    @JsonProperty("volumeInfo")
    private BookInfo bookInfo;

    @Override
    public String toString() {
        return "ClassPojo [kind = " + kind + ", id = " + id + ", bookInfo = " + bookInfo +"]";
    }
}
