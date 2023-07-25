package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }

    public static void main(String[] args) {
        System.out.println(Utils.isAllPositiveNumbers(List.of("1", "-3", "6", "8")));
    }
}