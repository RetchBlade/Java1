package Aufgabe6_2021;

import java.util.Random;
import java.util.Scanner;

public class Blackbox {
    public static int zeichen(char[] a) {
        if (a.length < 3) {
            throw new IllegalArgumentException("Array must have at least three elements");
        }
        int lower = (int) a[0];
        int upper = (int) a[1];
        int target = (int) a[2];
        if (target < lower || target > upper) {
            return -1;
        }
        Random random = new Random();
        int count = 0;
        while (true) {
            int r = lower + random.nextInt(upper - lower);
            count++;
            if (r == target) {
                return count;
            }
        }
    }

    public static String eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three visible ASCII characters: ");
        String input = scanner.nextLine();
        if (input.length() != 3) {
            throw new IllegalArgumentException("Exactly three characters are required");
        }
        for (int i = 0; i < 3; i++) {
            char c = input.charAt(i);
            if (c < 32 || c > 126) {
                throw new IllegalArgumentException("Only visible ASCII characters are allowed");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        try {
            String input = eingabe();
            char[] a = new char[3];
            a[0] = input.charAt(0);
            a[1] = input.charAt(1);
            a[2] = input.charAt(2);
            int result = zeichen(a);
            if (result == -1) {
                System.out.println("The target character is not within the range of the two boundary characters");
            } else {
                System.out.println("It took " + result + " random characters to generate the target character");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}