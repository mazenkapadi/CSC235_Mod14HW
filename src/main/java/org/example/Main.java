package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = sumOfPrimesWithDigit5(n);
        System.out.println("The sum of prime numbers with the digit 5 from 0 to " + n + " is: " + result);
    }

    public static int sumOfPrimesWithDigit5(int n) {
        int sum = 0;
        for (int i = 5; i <= n; i++) {
            if (containsDigit5(i) && isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean containsDigit5(int number) {
        while (number > 0) {
            if (number % 10 == 5) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
