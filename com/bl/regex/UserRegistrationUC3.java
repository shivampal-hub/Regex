package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC3 {

    static String email;
    static boolean isValid;

    public static void main(String[] args) {

        System.out.println("Enter a valid Email address");

        UserRegistrationUC3 user1 = new UserRegistrationUC3();
        user1.emailCheck();
        System.out.printf("%s : %s%n", email, isValid);

    }

    public boolean emailCheck() {

        Scanner sc = new Scanner(System.in);
        email = sc.next();

        Pattern p = Pattern.compile("^[a-z0-9]{1,}([.+-][0-9a-z]{1,})?@[a-z0-9]{1,}+(.[a-z]{2,4})([.+-][a-z]{1,3})?$");
        Matcher m = p.matcher(email);
        isValid = m.matches();

        return isValid;

    }
}
