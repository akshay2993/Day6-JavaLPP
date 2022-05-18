package com.bridgelabz.JavaPP_Day6;

import java.util.Scanner;

public class PrimeNo {
    static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        else
            for (int i = 3; i*i <=n; i += 2){
                if (n%i == 0)
                    return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)){
            System.out.println("It is a prime no.!");
        } else {
            System.out.println("Not a prime no.!");
        }
    }
}
