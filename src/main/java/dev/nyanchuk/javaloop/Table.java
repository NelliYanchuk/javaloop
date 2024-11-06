package dev.nyanchuk.javaloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {

    public static List<String> setTable(String input, Scanner scanner) {
        List<String> table = new ArrayList<>();
        int number;

        // Try if input string as an integer
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            table.add("Incorrect input. Please enter a number.");
            return table;
        }

        // If input is integer
        int result;
        String oneLine;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            oneLine = number + " * " + i + " = " + result;
            table.add(oneLine);
        }

        return table;
    }
}
