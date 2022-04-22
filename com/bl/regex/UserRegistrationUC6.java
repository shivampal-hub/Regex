package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC6 {

    static String password;
    static boolean isValid;

    public static void main(String[] args) {

        System.out.println("Enter a valid Password");

        UserRegistrationUC6 user2 = new UserRegistrationUC6();
        user2.passwordCheck();
        System.out.printf("%s : %s%n", password, isValid);
    }

    public boolean passwordCheck() {

        Scanner sc = new Scanner(System.in);
        password = sc.nextLine();

        Pattern p = Pattern.compile("^(?=.*[A-Z])[a-zA-Z]{8,}$");
        Matcher m = p.matcher(password);
        isValid = m.matches();

        return isValid;

    }
}
