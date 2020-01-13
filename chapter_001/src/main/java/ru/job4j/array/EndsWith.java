package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int startIndex = word.length - post.length;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int index=0; index < post.length; index++) {
            if (post[index]!=word[startIndex + index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}