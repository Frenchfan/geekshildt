package ru.geekshildt.GeekBrains;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] myArray = new int[] {0, 1, 2, 3, 4, 5};
        int temp;
        for (int i = 0; i <= myArray.length / 2; i++) {
            temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArray));
    }
}

