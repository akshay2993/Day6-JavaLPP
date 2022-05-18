package com.bridgelabz.JavaPP_Day6;

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNo(int n){
        int reverse = 0;
        while(n > 0){
            int rem = n % 10;
            reverse = (reverse*10)+rem;
            n = n/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num = sc.nextInt();

        System.out.println(reverseNo(num));
    }
}
