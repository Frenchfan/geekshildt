package ru.geekshildt.GeekBrains;

public class MaxMin {
    public static void main(String[] args) {
        int[] myArray = new int[] {2, 55, 1, -49, 3, 7, 15, 0};
        int maxi = 0;
        int mini = 1;
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
        System.out.println(mini + " " + maxi);
    }
}
