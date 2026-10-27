package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollApp {
    public static void main(String[] args) {

        try (BufferedReader bufReader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;

            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








