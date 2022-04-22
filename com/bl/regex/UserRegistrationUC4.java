package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC4 {

    static String number;
    static boolean isValid;

    public static void main(String[] args) {

        System.out.println("Enter a valid Mobile Number");

        UserRegistrationUC4 user2 = new UserRegistrationUC4();
        user2.mobileCheck();
        System.out.printf("%s : %s%n", number, isValid);

    }

    public boolean mobileCheck() {

        Scanner sc = new Scanner(System.in);
        number = sc.nextLine();

        Pattern p = Pattern.compile("^[0-9]{2}[ ][6-9]{1}[0-9]{9}$");
        Matcher m = p.matcher(number);
        isValid = m.matches();

        return isValid;

    }
}
