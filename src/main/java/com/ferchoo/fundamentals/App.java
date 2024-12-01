package com.ferchoo.fundamentals;

public class App {
    public static void main(String[] args) {
        DatabaseService mongo = new MongoDB();
        DatabaseService postgres = new PostgresDB();

        System.out.println(mongo.getById(20L));
        System.out.println(postgres.getById(30L));

    }
}
