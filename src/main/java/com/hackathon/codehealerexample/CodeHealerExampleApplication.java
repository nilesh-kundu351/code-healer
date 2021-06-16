package com.hackathon.codehealerexample;


public class CodeHealerExampleApplication {
    public int getSum(int[] array) {
        String argStr = java.util.Arrays.toString(array);
        int argHash = java.util.Arrays.hashCode(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public String getSubString(String s, int start, int end) {
        return s.substring(start, end);
    }


}
