package com.davidcipriati;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String pin = "8763";

        System.out.println(validatePin("121317"));
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("45135"));
        System.out.println(validatePin("89abc1"));
        System.out.println(validatePin("900876"));
        System.out.println(validatePin("89abc1"));
        System.out.println(validatePin(" 4983"));
        System.out.println(validatePin(" "));
        System.out.println("================");
        System.out.println(isFactorial(2));
        System.out.println(isFactorial(27));
        System.out.println(isFactorial(24));
    }

    public static boolean validatePin(String pin) {
        String regex = "([0-9]{4})|([0-9]{6})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);

        return matcher.matches();
    }

    public static boolean isFactorial(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 1; i <= num; i++) {
            int factorial = factorial(i);
            if (factorial == num) {
                return true;
            }
            if (factorial > num) {
                return false;
            }
        }
        return false;
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}