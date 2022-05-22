package com.bridgelabz.JavaPP_Day6;

import java.util.Scanner;

public class UtilTemperatureConversion {

    public static void main(String[] args) {
        UtilTemperatureConversion utilTemperatureConversion = new UtilTemperatureConversion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n1.Celcius to Fahrenheit\t\t\t\t2.Fahrenheit to Celcius");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter temp. in Celcius:");
                int tempC = sc.nextInt();
                utilTemperatureConversion.celciusToFahrenheit(tempC);
                break;
            case 2:
                System.out.println("Enter temp. in Fahrenheit:");
                int tempF = sc.nextInt();
                utilTemperatureConversion.fahrenheitToCelcius(tempF);
                break;
        }
    }

    public void celciusToFahrenheit(int temp){
        float result = temp+(float)(9/5) + 32;
        System.out.println(temp +" C = "+ result +"F");
    }

    public  void fahrenheitToCelcius(int temp){
        float result =(temp -32) * (float)(5/9);
        System.out.println(temp +" F = "+ result +"C");
    }
}
