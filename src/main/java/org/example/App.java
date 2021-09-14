package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the username?");
        String uiuser = sc.nextLine();
        System.out.println("What is the password? ");
        String uipasswordAttempt = sc.nextLine();
        String password = "abc$123";

        if(uipasswordAttempt.equals(password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");






    }
}