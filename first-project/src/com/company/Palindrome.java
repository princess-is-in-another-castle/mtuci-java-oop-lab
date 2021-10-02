package com.company;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String s) {
        if (s.toUpperCase().equals(reverseString(s.toUpperCase()))) {
            return true;
        }
        return false;
    }

}
