package ru.geekshildt.GeekBrains;

public class AverageSum {
    public static void main(String[] args) {
        int[] myArray = new int[] {2, 5, 110, 49, -50, 7, 15, 0};
        System.out.println(SumtheAverage(myArray));
    }

    private static double SumtheAverage(int[] myArray) {
        double sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        return sum/myArray.length;
    }
}
