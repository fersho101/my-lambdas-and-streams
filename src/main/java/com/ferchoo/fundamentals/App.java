package com.ferchoo.fundamentals;

import java.util.List;

public class App {
    public static void main(String[] args) {
        DatabaseService mongo = new MongoDB();
        DatabaseService postgres = new PostgresDB();

        System.out.println(mongo.getById(20L));
        System.out.println(postgres.getById(30L));

        System.out.println();

        ProductDB pDb = new ProductDB();
        EmployeeDB eDb = new EmployeeDB();

        System.out.println(pDb.getById(2L));
        System.out.println(eDb.getById(1L));

        System.out.println();

        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        System.out.println();

        DatabaseService<String> dbAnonimo = new DatabaseService<String>() {

            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAllRecords() {
                return List.of();
            }
        };

        System.out.println(dbAnonimo.getClass().getName());

    }
}
