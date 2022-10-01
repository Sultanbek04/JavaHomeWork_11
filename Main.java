package com.google.lesson_11;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        printNaturalNumber(6, 15, 3);
    }

    public static void printNaturalNumber(int... n) {
        Random random = new Random();
        int sum = 0;
        try {
            if (n.length > 4) {
                throw new SlishkomMnogo();
            }
            if (Arrays.stream(n).min().getAsInt() < 0) {
                throw new NiggativeException();
            }

            for (int i = 0; i < n.length; ++i) {
                for (int j = 0; j < n[i]-1; j++) {
                    if (n[i] % (j+1) == 0) {
                        sum += j+1;
                    }
                }
                System.out.println("Первое натуральное число: " + random.nextInt(69));
                if (sum == n[i]) {
                    System.out.println(n[i] + " is " + "Совершенное число!");
                } else {
                    System.out.println(n[i] + " is not " + "Совершенное число!");

                }
                sum = 0;
            }

        } catch (NiggativeException exception) {
            System.out.println("No niggative numbers nigga!");
        } catch (SlishkomMnogo exception) {
            System.out.println("натуральные числа будут рассчитываться очень долго");
        }

    }
}
