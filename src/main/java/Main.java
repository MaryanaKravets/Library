package main.java;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.printData();
        library.printBoks();
        System.out.println();
        System.out.println("Enter the date in the format: yyyy-mm-dd: ");
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next(Pattern.compile("([0-9]{4})-([0-9]{2}-([0-9]{2}))"));
            library.nameOfBook(LocalDate.parse(str));
            scanner.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("You have entered the wrong date format!");
        } catch (DateTimeException e) {
            System.out.println("You entered the wrong date!");
        }


    }
}