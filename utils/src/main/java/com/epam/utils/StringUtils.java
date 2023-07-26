package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        try {
            String regex = "^0+[0-9].*";
            if(str.matches(regex)){ return false; }

            return Double.parseDouble(str) > 0;
        } catch (Exception e){
            System.out.println("An Exception occurred:");
            System.out.println(e);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber(null));
    }
}
