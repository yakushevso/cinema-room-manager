package cinema;

import java.util.*;

public class Cinema {
    public static void profitCalculation() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int rows = sc.nextInt();

            System.out.println("Enter the number of seats in each row:");
            int seat = sc.nextInt();

            int total;

            if (rows * seat <= 60) {
                total = rows * seat * 10;
            } else {
                total =  rows / 2 * seat * 10 + (rows % 2 == 0 ? rows / 2 : rows / 2 + 1) * seat * 8;
            }

            System.out.printf("Total income:\n$%d", total);
        }
    }

    public static void main(String[] args) {
        profitCalculation();
    }
}