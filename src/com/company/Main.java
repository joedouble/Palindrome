package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String userString = new String();
        String reversedString = new String();
        boolean comparedStrings = false;

        System.out.println("This program is a palindrome checker.");
        System.out.println("Please enter a word or phrase that you'd like to check.");
        userString = myScanner.nextLine();

        userString = userString.replaceAll("[^a-zA-z]", "");

        //System.out.println(userString);

        for(int i = userString.length()-1; i >=0; i--)
        {
            reversedString = reversedString + userString.charAt(i);
        }

        comparedStrings = userString.equalsIgnoreCase(reversedString);

        //System.out.println(reversedString);
        System.out.println(comparedStrings);

    }
}
