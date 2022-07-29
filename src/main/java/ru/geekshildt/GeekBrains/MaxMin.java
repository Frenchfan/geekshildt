package ru.geekshildt.GeekBrains;

public class MaxMin {

static class Extremums {
    int min;
    int max;

    public Extremums(int[] myArray) {
        this.min = MaxMinFind(myArray).min;
        this.max = MaxMinFind(myArray).max;
    }

    public Extremums(int mini, int maxi) {
        this.max = maxi;
        this.min = mini;
    }
    public static Extremums MaxMinFind(int[] myArray) {
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
        return new Extremums(mini, maxi);
    }
}
    public static void main(String[] args) {
        int[] myArray = new int[] {2, 55, 1, -49, 3, 7, 15, 0};
        Extremums myExtremums = new Extremums(myArray);
        System.out.println(myExtremums.max);
        System.out.println(myExtremums.min);
    }

}
