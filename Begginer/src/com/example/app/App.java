package com.example.app;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;  // Import the Scanner class
import java.util.TreeMap;


public class App {
    // Create a logger instance
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");
        Scanner in = new Scanner(System.in);  // Create a Scanner object
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());



    }

    class Fraction{

    }
}