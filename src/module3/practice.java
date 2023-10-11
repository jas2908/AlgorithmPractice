package module3;

import java.util.Arrays;

public class practice {
    public static int highestProduct(int[] a) {
        int n = a.length;
        if (n < 3) {
            return -1;
        } //the array should contain at least three numbers

        //Approach 1 Brute Force
        /*int highestProduct=Integer.MIN_VALUE;

        for (int i = 0; i < n-2; i++){
            for (int j = i + 1; j < n-1 ; j++){
                for (int k = j + 1; k < n; k++){
                    int product = a[i]*a[j]*a[k];
                    if(product>=highestProduct)
                    {
                        highestProduct = product;
                    }
                    // alternative-highestProduct = Math.max(highestProduct, a[i] * a[j] * a[k]);

                }
            }
        }

        return highestProduct;

    }}*/

        //Approach 2 Quich Sort
        /*quickSort(a, 0, n - 1);

        int possibility1=a[n - 1] * a[n - 2] * a[n - 3];//product of 3 largest numbers
        int possibility2= a[0] * a[1] * a[n - 1];//product of 2 smallest & the largest number

        return Math.max(possibility1,possibility2);
    }*/

        //Approach 3 Single Scan
        int largestNumber = Integer.MIN_VALUE, //initializing the 5 numbers
                secondLargest = Integer.MIN_VALUE,
                thirdLargest = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE,
                secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) //running loop and swapping numbers to find the 3 largest numbers
        {
            if (a[i] > largestNumber)
            {
                thirdLargest = secondLargest;
                secondLargest = largestNumber;
                largestNumber = a[i];
            }
            else if (a[i] > secondLargest)
            {
                thirdLargest = secondLargest;
                secondLargest = a[i];
            }

            else if (a[i] > thirdLargest)
                thirdLargest = a[i];

            if (a[i] < smallestNumber) //swapping to find the 2 smallest numbers
            {
                secondSmallest = smallestNumber;
                smallestNumber = a[i];
            }

            else if(a[i] < secondSmallest)
                secondSmallest = a[i];
        }
        int possibility1=largestNumber * secondLargest * thirdLargest;
        int possibility2=smallestNumber * secondSmallest * largestNumber;

        return Math.max(possibility1,possibility2);//comparing which combination is higher
    }
    static int partition(int a[], int low, int high) {//help method for quick sort
        int pivot = a[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high]
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    static void quickSort(int a[], int low, int high) {//help method for quick sort
        if (low < high) {
            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }}}







