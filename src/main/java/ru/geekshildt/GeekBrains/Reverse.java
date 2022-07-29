package ru.geekshildt.GeekBrains;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] myArray = new int[] {8, 2, 4, 3, 5, 9, 11};
        int temp;
        for (int i = 0; i < myArray.length / 2; i++) {
            temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArray));
    }
}

