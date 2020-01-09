package ru.job4j.condition;

public class SqMax2 {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            result = first;
            if (result < third) {
                result = third;
            }
            if (result < forth) {
                result = forth;
            }

        } else if (second > third) {
            result = second;
            if (result < forth) {
                result = forth;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}