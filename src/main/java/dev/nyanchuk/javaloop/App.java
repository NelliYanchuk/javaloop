package dev.nyanchuk.javaloop;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to get its multiplication table");
        num = scanner.nextInt();

        Table.setTable(num, scanner);

        scanner.close();
    }
}
