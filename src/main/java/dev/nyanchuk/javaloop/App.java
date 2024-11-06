package dev.nyanchuk.javaloop;

import java.util.List;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a number to get its multiplication table: ");
        String input = scanner.nextLine();
        List<String> table = Table.setTable(input, scanner);

        for (String line : table) {
            System.out.println(line);
        }

        scanner.close();
    }
}
