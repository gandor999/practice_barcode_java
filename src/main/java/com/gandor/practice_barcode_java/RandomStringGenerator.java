package com.gandor.practice_barcode_java;

import java.util.Random;

public class RandomStringGenerator {
    private int leftLimit = 48; // letter 'a'
    private int rightLimit = 57; // letter 'z'

    public String getRandomString(int limit) {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(limit);

        for (int i = 0; i < limit; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}
