package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC2 {

    static String name;
    public static boolean isValid;

    public static void main(String[] args) {


        System.out.println("Enter a valid First Name");
        UserRegistrationUC2 user = new UserRegistrationUC2();
        user.nameCheck();
        System.out.printf("%s : %s%n", name, isValid);

        System.out.println("Enter a valid Last Name");
        user.nameCheck();
        System.out.printf("%s : %s%n", name, isValid);

    }

    public boolean nameCheck() {

        Scanner sc = new Scanner(System.in);
        name = sc.next();

        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(name);
        isValid = m.matches();

        return isValid;

    }
}
