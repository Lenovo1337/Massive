package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[] {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int[] numbers1 = {10, 22, 15, 30, 50, 3, 8};
            int sumResult = 0;


            for (int number : numbers1) {
                sumResult += number;
            }

            sumResult *= -1;


        int[] numbers3 = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int paired = 0;




        for (int number : numbers3) {
            if (number % 2 == 0) {
                paired++;
            }
        }




        int[] numbers4 = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int unpaired = 0;




        for (int number : numbers4) {
            if (number % 3 == 0) {
                unpaired++;
            }
        }


        int[] numbers5 = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int minValue = 0;


        for (int i = 1; i < numbers5.length; i++) {
            if (numbers5[i] < minValue) {
                minValue = numbers5[i];
            }
        }

        int[] numbers6 = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int maxValue = 0;


        for (int i = 1; i < numbers6.length; i++) {
            if (numbers6[i] > maxValue) {
                maxValue = numbers6[i];
            }
        }

        int numbers7 [] = new int[] {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};


        for (int i = 1; i < numbers7.length; i++) {
            numbers7[i] = (int) (Math.random() *20) + 1;
        }







        System.out.println("Massive elements: " +Arrays.toString(numbers));
        System.out.println("Sum of negative numbers: " + sumResult );
        System.out.println("Number of paired numbers " + paired);
        System.out.println("Number of unpaired numbers " + unpaired);
        System.out.println("Minimum value " + minValue);
        System.out.println("Maximal value " + maxValue);
        System.out.println("Arithmetic mean " +Arrays.toString(numbers7));
    }
}
