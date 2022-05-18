package com.bridgelabz.JavaPP_Day6;

import java.util.Scanner;

public class PerfectNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 1;

        for (int i = 1; i*i <= num ; i++) {
            if (num%i == 0) {
                if(i*i != num) {
                    sum = sum + i + num / i;
                } else {
                    sum = sum + i;
                }
            }
        }
        if (sum == num && num != 1)
            System.out.println(num+" is a perfect number!");

        System.out.println("Not a perfect number!");
    }
}

