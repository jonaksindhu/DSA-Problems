package src;

import java.util.Scanner;


public class DSAproblems1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Matrix Multiplication");
        System.out.println("2. Rotate Array");
        System.out.println("3. Reverse Number");
        System.out.println("4. Monotonic Array");  
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                matrixMultiplication();
                break;
            case 2:
                rotateArray();
                break;
            case 3:
                reverseNumber();
                break;
            case 4:
                monotonicArray();
                break;  
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }

    // ---------- Matrix Multiplication ----------
    public static void matrixMultiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix Multiplication:");

        System.out.print("Enter number of rows in first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns in first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows in second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Matrix Multiplication Logic
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    // ---------- Rotate Array ----------
    public static void rotateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rotate Array:");

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter number of positions to rotate: ");
        int d = sc.nextInt();

        d = d % n; // Handle rotations greater than array size

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++)
            rotated[i] = arr[(i + d) % n];

        System.out.println("Rotated Array:");
        for (int val : rotated)
            System.out.print(val + " ");
        System.out.println();
    }

    // ---------- Reverse Number ----------
    public static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }


    public static void monotonicArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if array is monotonic:");

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i=1 ; i>=arr.length - 1; i++)
        {
            if (arr[i] > arr[i-1])
            {
                isDecreasing = false;
            }
            else if (arr[i] < arr[i-1])
            {
                isIncreasing = false;
            }
        }
        if (isIncreasing || isDecreasing)
        {
            System.out.println("The array is monotonic");
        }
        else
        {
            System.out.println("The array is not monotonic");
        }

    }
    
}
