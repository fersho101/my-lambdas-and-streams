package com.ferchoo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Videogame {
    private String name;
    private Double price;
    private Console console;
    private List<Review> reviews;
    private String officialWebsite;
    private Boolean isDiscount;
    private Integer totalSold;

    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Cant write values as JSON");
        }
    }

}
