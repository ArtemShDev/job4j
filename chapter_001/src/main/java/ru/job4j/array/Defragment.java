package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            int i = index + 1;
            if (cell == null) {
                // переместить первую не null ячейку
                // Здесь нужен цикл while
                while (i < array.length) {
                    cell = array[i];
                    if (cell != null) {
                        array[index]    = cell;
                        array[i]        = null;
                        break;
                    }
                    i++;
                }

            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}