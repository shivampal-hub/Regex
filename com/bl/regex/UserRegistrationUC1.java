package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {

    public static void main(String[] args) {

        System.out.println("Enter a valid First Name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();

        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(firstName);
        boolean isValid = m.matches();

        if (isValid == true) {
            System.out.println(firstName);
        } else
            System.out.println("Invalid Entry.Please check again");
    }
}
