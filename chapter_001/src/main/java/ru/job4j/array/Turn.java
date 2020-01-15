package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
//        int maxCount = (array.length % 2 == 0) ? array.length / 2 : (array.length-1) / 2;
        int maxCount = array.length / 2;
        for (int index = 0; index < maxCount; index++) {
            int tmp         = array[index];
            array[index]    = array[(array.length - 1 - index)];
            array[(array.length - 1 - index)] = tmp;
        }
        return array;
    }
}