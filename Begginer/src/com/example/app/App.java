package com.example.app;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;  // Import the Scanner class
import java.util.TreeMap;


public class App {
    public static void main(String[] args) {
      
        int[] matrix = {1, 2, 3};
        System.out.println("Memory layout of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Row " + i + " address: " + System.identityHashCode(matrix[i]));
           
        }
    }
}