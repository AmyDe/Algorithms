package com.example.timingtests;

import java.util.Arrays;
import java.util.Collections;

public class TimingTests {

    public static void main(String[] args) {

        for (int size = 5000; size <= 100000; size += (100000/100)) {
            int[] testArr = createShufArray(size);

            long startTime = System.nanoTime();

            Arrays.sort(testArr);

            long endTime = System.nanoTime();
            long timeTaken = endTime - startTime;

            System.out.println(size + "\t" + timeTaken);
        }
    }

    private static int[] createShufArray(int size) {
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++) {
            myArr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(myArr));
        return myArr;
    }

    private static int[] createArray(int size) {
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }
}
