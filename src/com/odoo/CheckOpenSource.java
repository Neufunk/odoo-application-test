package com.odoo;

class CheckOpenSource {

    /* This method goes from 1 up to 99, and replace every multiple of 3 by "Open", every multiple of 7 by "Source",
    and multiple of both numbers by "OpenSource" */

    void checkOpenSource() {
        for (int i = 1; i <= 99; i++) {
            if (testThree(i) && testSeven(i)) {
                System.out.println("OpenSource");
            } else if (testThree(i)) {
                System.out.println("Open");
            } else if (testSeven(i)) {
                System.out.println("Source");
            } else {
                System.out.println(i);
            }
        }
    }

    private Boolean testThree(int i) {
        Boolean answer;
        answer = i % 3 == 0;
        return answer;
    }

    private Boolean testSeven(int i) {
        Boolean answer;
        answer = i % 7 == 0;
        return answer;
    }
}

