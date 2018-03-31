package com.example;

import spark.Spark;

public class App {
    public static void main(String[] args) {
        Spark.port(8080);
        Spark.get("/", (req, res) -> "Hello World!");
        Runtime.getRuntime().addShutdownHook(new Thread(Spark::stop));
    }
}
