package com.odoo;

import java.util.List;

class StringToInt {

    /* This method takes a List<String> as input, and outputs the sum of numbers in it, if any */

    int stringToInt(List<String> stringList) {
        int sum = 0;
        for (String aStringList : stringList) {
            if (isInteger(aStringList)) {
                sum += Integer.valueOf(aStringList);
            }
        }
        System.out.println(sum);
        return sum;
    }

    private boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
