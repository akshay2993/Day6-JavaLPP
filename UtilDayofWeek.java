package com.bridgelabz.JavaPP_Day6;

import java.util.Scanner;

public class UtilDayofWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        int day0 = dayOfWeek(month, day, year);
        System.out.println(day0);
    }

    static int dayOfWeek(int m, int d, int y){

        int y0 = y - (14 - m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14-m)/12) - 2;
        int d0 = (d + x + 31*m0/12)%7;
        return d0;
    }

}

