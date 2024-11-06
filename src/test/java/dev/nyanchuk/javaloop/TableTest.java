package dev.nyanchuk.javaloop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Scanner;

public class TableTest {

    @Test
    public void testSetTableZero() {
        List<String> expectedTable = List.of(
                "0 * 1 = 0",
                "0 * 2 = 0",
                "0 * 3 = 0",
                "0 * 4 = 0",
                "0 * 5 = 0",
                "0 * 6 = 0",
                "0 * 7 = 0",
                "0 * 8 = 0",
                "0 * 9 = 0",
                "0 * 10 = 0");

        assertEquals(expectedTable, Table.setTable("0", new Scanner(System.in)));
    }

    @Test
    public void testSetTablePositiveNumber() {
        List<String> expectedTable = List.of(
                "8 * 1 = 8",
                "8 * 2 = 16",
                "8 * 3 = 24",
                "8 * 4 = 32",
                "8 * 5 = 40",
                "8 * 6 = 48",
                "8 * 7 = 56",
                "8 * 8 = 64",
                "8 * 9 = 72",
                "8 * 10 = 80");

        assertEquals(expectedTable, Table.setTable("8", new Scanner(System.in)));
    }

    @Test
    public void testSetTableNegativeNumber() {
        List<String> expectedTable = List.of(
                "-11 * 1 = -11",
                "-11 * 2 = -22",
                "-11 * 3 = -33",
                "-11 * 4 = -44",
                "-11 * 5 = -55",
                "-11 * 6 = -66",
                "-11 * 7 = -77",
                "-11 * 8 = -88",
                "-11 * 9 = -99",
                "-11 * 10 = -110");

        assertEquals(expectedTable, Table.setTable("-11", new Scanner(System.in)));
    }

    @Test
    public void testSetTableNonInt() {
        List<String> expectedOutput = List.of("Incorrect input. Please enter a number.");

        assertEquals(expectedOutput, Table.setTable("testString", new Scanner(System.in)));
    }
}
