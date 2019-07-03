package main.java;

import java.time.LocalDate;
import java.util.TreeMap;
import java.util.Map;


class Library {
    private Map<LocalDate, String> map;

    Library() {
        map = new TreeMap<>();
        map.put(LocalDate.parse("2018-01-10"), "Head First Java");
        map.put(LocalDate.parse("2018-05-23"), "HTML&CSS");
        map.put(LocalDate.parse("2018-11-11"), "Effective Java");
        map.put(LocalDate.parse("2019-02-15"), "Java8.Lambdas");
        map.put(LocalDate.parse("2019-02-27"), "Core Java");
        map.put(LocalDate.parse("2019-05-19"), "ProGit");
    }


    void nameOfBook(LocalDate localDate) {
        System.out.println(map.get(localDate));

    }

    void printData() {
        System.out.println("List of dates: " + map.keySet());

    }


    void printBoks() {
        System.out.println("Lists of books: " + map.values());

    }


}

