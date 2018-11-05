package com.example.timingtests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TimingTests {

    public static void main(String[] args) {

        int[] tenArray = new int[10];
        for (int i = 0; i < tenArray.length; i++) {
            tenArray[i] = i + 1;
        }

//        int[] hundArray = new int[100];
//        for (int i = 0; i < hundArray.length; i++) {
//            hundArray[i] = i + 1;
//        }
//
//
//        int[] thouArray = new int[1000];
//        for (int i = 0; i < thouArray.length; i++) {
//            thouArray[i] = i + 1;
//        }
////
//        int[] milArray = new int[1000000];
//        for (int i = 0; i < milArray.length; i++) {
//            milArray[i] = i + 1;
//        }

        long startTime = System.nanoTime();

        Collections.shuffle(Arrays.asList(tenArray));

        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;

        System.out.println("Time taken to shuffle 10 object array in n/s: " + timeTaken);
    }
}
