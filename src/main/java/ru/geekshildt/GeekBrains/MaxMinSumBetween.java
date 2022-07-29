package ru.geekshildt.GeekBrains;

public class MaxMinSumBetween {
    public static void main(String[] args) {
        int[] myArray = new int[] {2, 5, 110, 49, -50, 7, 15, 0};
        int maxi = 0;
        int mini = 1;
        int sum = 0;
        if (myArray[maxi] < myArray[mini]) {
            mini = 0;
            maxi = 1;
        }
        for (int i = 2; i < myArray.length; i++) {
            if (myArray[maxi] < myArray[i]) {
                maxi = i;
                continue;
            }
            mini = myArray[mini] > myArray[i] ? i: mini;
        }
        if (mini > maxi) {
            int temp = maxi;
            maxi = mini;
            mini = temp;
        }
        for (int i = mini + 1; i < maxi; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}
