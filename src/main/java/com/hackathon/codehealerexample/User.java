package com.hackathon.codehealerexample;

import java.math.BigDecimal;

public class User {

    public String value;

    /**
     * 1656: Variables should not be self-assigned
     **/
    public void setName(String value) {
        this.value = value;
    }

    String greet(String name) {
        return "hello";
    }

    /**
     * 4973: Strings and Boxed types should be compared using "equals()"
     **/
    boolean compareObjects() {
        String firstName = "hackathon"; // String overrides equals
        String lastName = getLastName();

        // Non-compliant;
        return firstName.equals(lastName);
    }

    public String getLastName() {
        return "hackathon";
    }

    /**
     * 2142: "InterruptedException" should not be ignored
     **/
    public void run() {
        int a = 5;
        try {
            if (a == 5) {
                throw new InterruptedException("example");
            }
        } catch (InterruptedException e) { // Noncompliant; logging is not enough
            System.out.println("Exception occurred");
			java.lang.Thread.currentThread().interrupt();
        }
    }

    /**
     * 3067: "getClass" should not be used for synchronization
     **/
    public void doSomethingSynchronized() {
        synchronized (com.hackathon.codehealerexample.User.class) {  // Noncompliant
            System.out.println("In synchronized block");
        }
    }

    public static int x = 5;

    public int sum(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 2116: "hashCode" and "toString" should not be called on array instances
     **/
    public void arithmeticOps() {
        int[] x = new int[6];
        String argStr = java.util.Arrays.toString(x); // Noncompliant
        int argHash = java.util.Arrays.hashCode(x); // Noncompliant

        System.out.println("Args Str " + argStr + " and ArgHash " + argHash);
    }

    /**
     * 1854: Unused assignments should be removed
     **/
    public void unusedVariable() {
        int b;
        int i;

        i = 9 + 7; // Noncompliant; calculation result not used before value is overwritten
        i = compute();
        b = i + 8;

        System.out.println("Value of b is " + b);
    }

    int compute() {
        return 7;
    }

    /**
     * 2111: "BigDecimal(double)" should not be used
     **/
    public void bigDecimalEx() {
        double d = 1.1;

        BigDecimal bd1 = BigDecimal.valueOf(d); // Noncompliant; see comment above
        BigDecimal bd2 = BigDecimal.valueOf(1.1); // Noncompliant; same result

        System.out.println("Big Decimal values are " + bd1 + " and " + bd2);
    }

    /**
     * 2184: Math operands should be cast before assignment
     **/
    public void castExample() {
        float twoThirds = 2 / 3; // Noncompliant; int division. Yields 0.0
        long millisInYear = 1_000 * 3_600 * 24 * 365; // Noncompliant; int multiplication. Yields 1471228928

        System.out.println("Two-Thirds is " + twoThirds);
        System.out.println("MillisInYear " + millisInYear);
    }


}