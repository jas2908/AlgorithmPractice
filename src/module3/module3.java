package module3;

import java.util.Arrays;

public class module3 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int []a = { 10, 6, -101, 5, 3, 20, -88, 33, 52, 2, -99, 2,
                -87, 43, 25, 202, 45, 92, 772, 102, 1, -2500};

        int result = practice.highestProduct(a);

        if (result == -1)
            System.out.println("Not enough numbers to calculate");
        else
            System.out.println("The highest product is " + result);

        long endTime = System.nanoTime() - startTime;
        System.out.print("The process took " + endTime + " nanoseconds");

    }
}









