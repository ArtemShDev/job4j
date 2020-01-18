package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int index = 0;
        int indexLeft  = 0;
        int indexRight = 0;
        int[] rsl = new int[length];
        if (left.length == 0 || right.length == 0) {
            rsl = left.length < right.length ? right : left;
        } else {
            while (index < length) {
                boolean finishRight = indexRight > (right.length - 1);
                boolean finishLeft  = indexLeft > (left.length - 1);
                if (finishRight) {
                    rsl[index] = left[indexLeft];
                    index++;
                    indexLeft++;
                    continue;
                }
                if (finishLeft) {
                    rsl[index] = right[indexRight];
                    index++;
                    indexRight++;
                    continue;
                }
                if (left[indexLeft] > right[indexRight]) {
                    rsl[index] = right[indexRight];
                    indexRight++;
                } else {
                    rsl[index] = left[indexLeft];
                    indexLeft++;
                }
                index++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}