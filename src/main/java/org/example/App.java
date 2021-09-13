package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("How many euros are you exchanging?");
        Scanner sc = new Scanner(System.in);
        float euros = Float.parseFloat(sc.nextLine());
        System.out.println("What is the exchange rate?");
        float exchange_rate = Float.parseFloat(sc.nextLine());
        float exchange_to_US_currency = (float)(Math.ceil(euros*exchange_rate*100))/100;
        System.out.printf("%.0f euros at an exchange rate of %.4f is \n%.2f U.S. dollars. ", euros, exchange_rate, exchange_to_US_currency);


    }
}
