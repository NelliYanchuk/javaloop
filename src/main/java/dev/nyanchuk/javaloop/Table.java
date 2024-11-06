package dev.nyanchuk.javaloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {

    public static List<String> setTable(int number, Scanner scanner) {

        int result;
        String oneLine;
        List<String> table = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            result = number * i;
            oneLine = number + " * " + i + " = " + result;
            table.add(oneLine);
        }

        for (String line : table) {
            System.out.println(line);
        }

        return table;
    }

}
