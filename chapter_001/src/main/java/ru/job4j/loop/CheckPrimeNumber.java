package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        //boolean prime = true;
        //for (int y = 1; y <= finish; y++) {
        //    if(finish==1 || ((y!=finish) && y!=1) && (finish % y) == 0) {
        //        prime = false;
//                break;
//            }
//        }
        boolean prime = finish > 1;
        for (int y = 2; y < finish; y++) {
            if (finish % y == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}