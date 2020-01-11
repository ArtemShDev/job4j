package ru.job4j.calculator;

/**
*   Class – Класс для вычисления арифмитических операций;
*   @author – Shmelev Artem dev.art.balt@gmail.com;
*   @version – 1.0
*   @since - 11.01.2020
*/

public class Calculator {

    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }

    public static void multiplay(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     *   Method main
     *   Производит арифметические операции "+ - / *"
     *   @param args - args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiplay(2, 1);
        subtrack(10, 5);
    }
}
