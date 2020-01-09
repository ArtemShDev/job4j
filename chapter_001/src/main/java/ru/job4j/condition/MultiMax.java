package ru.job4j.condition;

public class MultiMax {

    public int max(int first, int second, int third) {

        //int result;
        //boolean condition = first >= second;
        int result = first >= second ? first : second;

        //condition = result >= third;
        //result = condition ? result : third;
        return result >= third ? result : third;
    }
}