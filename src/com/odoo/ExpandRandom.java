package com.odoo;

import java.util.Random;

class ExpandRandom {

    /* The goal of this method was to print a random number, that should never be greater than 7 */
    private Random random = new Random();

    private float rand5() {
        return random.nextFloat() * 5;
    }

    void rand7() {
        float min = 0;
        float max = 7;
        while (max-- > 0) {
            min += rand5();
        }
        System.out.println(min % 7);
    }
}
