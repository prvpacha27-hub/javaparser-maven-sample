package com.example; // Change this if your project uses a different package name

public class DummyCalculatorcopy {

    public int addNumbers(int a, int b) {
        int result = a + b;
        System.out.println("Adding: " + result);
        return result;
    }

    public int subtractNumbers(int a, int b) {
        int result = a - b;
        System.out.println("Subtracting: " + result);
        return result;
    }

    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void generateReport(int limit) {
        System.out.println("Generating Prime Report up to: " + limit);
        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
        System.out.println("Report Generation Complete.");
    }
}
