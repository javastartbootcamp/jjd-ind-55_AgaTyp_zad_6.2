package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum = 0;
        String part;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy:");
        int arrLength = scanner.nextInt();
        double[] numbers = new double[arrLength];

        if (arrLength == 1) {
            part = "liczbę";
        } else if (((arrLength % 10 == 2) || (arrLength % 10 == 3) || (arrLength % 10 == 4)) && (arrLength < 10 || arrLength > 20)) {
            part = "liczby";
        } else {
            part = "liczb";
        }

        System.out.printf("Wprowadź %d %s:\n", arrLength, part);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (double number : numbers) {
            sum += (number * number);
        }

        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);

    }
}
