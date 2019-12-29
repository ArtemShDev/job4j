package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        //int euro = rubleToEuro(140);
        //System.out.println("140 rubles are " + euro + " euro.");
        //int usd = rubleToDollar(120);
        //System.out.println("120 rubles are " + usd + " usd.");

        //int ruble = euroToRuble(3);
        //System.out.println("3 euro are " + ruble + " rubles.");
        //ruble = dollarToRuble(5);
        //System.out.println("5 dollars are " + ruble + " rubles.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 120;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);

        in = 3;
        expected = 210;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("3 euro are 210 rubles. Test result : " + passed);

        in = 5;
        expected = 300;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("5 dollars are 300 rubles. Test result : " + passed);
    }
}