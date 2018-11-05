package com.example.timingtests;

public class TimingTests {

    public static void main(String[] args) {

        int[] tenArray = new int[10];
        for (int i = 0; i < tenArray.length; i++) {
            tenArray[i] = i + 1;
        }
        for (int i = 0; i < tenArray.length/2; i++) {
            int temp = tenArray[i];
            tenArray[i] = tenArray[tenArray.length -i -1];
            tenArray[tenArray.length -i -1] = temp;
        }

        int[] hundArray = new int[100];
        for (int i = 0; i < hundArray.length; i++) {
            hundArray[i] = i + 1;
        }
        for (int i = 0; i < hundArray.length/2; i++) {
            int temp = hundArray[i];
            hundArray[i] = hundArray[tenArray.length -i -1];
            hundArray[hundArray.length -i -1] = temp;
        }

        int[] thouArray = new int[1000];
        for (int i = 0; i < thouArray.length; i++) {
            thouArray[i] = i + 1;
        }
        for (int i = 0; i < thouArray.length/2; i++) {
            int temp = thouArray[i];
            thouArray[i] = thouArray[thouArray.length -i -1];
            thouArray[tenArray.length -i -1] = temp;
        }

        int[] milArray = new int[1000000];
        for (int i = 0; i < milArray.length; i++) {
            milArray[i] = i + 1;
        }
        for (int i = 0; i < milArray.length/2; i++) {
            int temp = milArray[i];
            milArray[i] = milArray[tenArray.length -i -1];
            milArray[milArray.length -i -1] = temp;
        }

        long startTime = System.nanoTime();

        int test = tenArray[tenArray.length-1];

        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;

        System.out.println("Time taken to reverse 10 object array in n/s: " + timeTaken);
    }
}
