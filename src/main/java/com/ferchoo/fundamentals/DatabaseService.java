package com.ferchoo.fundamentals;

import java.util.List;

public interface DatabaseService {
    String getById(Long id);
    List<String> getAllRecords();
}
