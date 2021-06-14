package com.hackathon.codehealerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeHealerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeHealerExampleApplication.class, args);
    }


    public int getSum(int[] array) {
        String argStr = java.util.Arrays.toString(array); // Noncompliant
        int argHash = java.util.Arrays.hashCode(array); // Noncompliant
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
