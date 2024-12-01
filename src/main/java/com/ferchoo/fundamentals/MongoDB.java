package com.ferchoo.fundamentals;

import java.util.List;

public class MongoDB  implements DatabaseService {

    @Override
    public String getById(Long id) {
        return "Getting data from Mongo  with id: " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello world with mongo");
    }
}
