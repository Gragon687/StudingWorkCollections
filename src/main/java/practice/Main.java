package practice;

import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        boolean result;
        List<String> coolNumbers = CoolNumbers.generateCoolNumbers();

        long startTime = System.nanoTime();
        result = CoolNumbers.bruteForceSearchInList(coolNumbers, "А777СУ23");
        System.out.println("Поиск перебором: номер " +
                (result ? "найден, " : "не найден, ") +
                "поиск занял " + (System.nanoTime() - startTime) + " нс");

        Collections.sort(coolNumbers);
        startTime = System.nanoTime();
        result = CoolNumbers.binarySearchInList(coolNumbers, "А777СУ23");
        System.out.println("Бинарный поиск: номер " +
                (result ? "найден, " : "не найден, ") +
                "поиск занял " + (System.nanoTime() - startTime) + " нс");

        HashSet<String> coolNumHS = new HashSet<>(coolNumbers);
        startTime = System.nanoTime();
        result = CoolNumbers.searchInHashSet(coolNumHS, "А777СУ23");
        System.out.println("Поиск в HashSet: номер " +
                (result ? "найден, " : "не найден, ") +
                "поиск занял " + (System.nanoTime() - startTime) + " нс");

        TreeSet<String> coolNumTS = new TreeSet<>(coolNumbers);
        startTime = System.nanoTime();
        result = CoolNumbers.searchInTreeSet(coolNumTS, "А777СУ23");
        System.out.println("Поиск в TreeSet: номер " +
                (result ? "найден, " : "не найден, ") +
                "поиск занял " + (System.nanoTime() - startTime) + " нс");

    }
}
