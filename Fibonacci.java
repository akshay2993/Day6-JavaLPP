package com.bridgelabz.JavaPP_Day6;

import java.util.Scanner;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.(N > 0) to print its fibonacci series: ");
        int N = sc.nextInt();

        switch (N) {
            case 0:
                System.out.println(n1);
                break;
            case 1:
                System.out.println(n2);
                break;
            default:
                System.out.print(n1 + " " + n2);

                for (int i = 2; i < N; i++) {
                    n3 = n1 + n2;
                    System.out.print(" " + n3);
                    n1 = n2;
                    n2 = n3;
                }
        }
    }
}

