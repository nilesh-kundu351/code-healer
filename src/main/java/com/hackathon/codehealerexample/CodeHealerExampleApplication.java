package com.hackathon.codehealerexample;


public class CodeHealerExampleApplication {
    public int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public String getSubString(String s, int start, int end) {
        if (s == null) {
            return null;
        }
        return s.substring(start, end);
    }

}
