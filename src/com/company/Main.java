package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Pass or Fail");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in English");
        int e =sc.nextInt();
        System.out.println("Enter your marks in Hindi");
        int h =sc.nextInt();
        System.out.println("Enter your marks in Maths");
        int m =sc.nextInt();
        int total  = e+h+m;
        double percent = total *100 /300;
        System.out.println(percent);
        if (e>=33 && h>=33 &&m>=33);
        else
            System.out.println("You Failed ");
        if(percent>40)
            System.out.println("Congratulations you have passed the exam");
        else;
        System.out.println("You have failed ");


    }
}
