package cinema;

import java.util.*;

public class Cinema {
    private static final char SEAT = 'S';
    private static final char BUSY = 'B';
    private static final int MAX_SEATS = 60;
    private static final int TICKET_NORMAL_PRICE = 10;
    private static final int TICKET_LOW_PRICE = 8;

    public static void printField(int rowField, int seatField, int rowPlace, int seatPlace) {
        System.out.println("Cinema:");

        for (int i = 0; i <= rowField; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }

            for (int j = 0; j < seatField; j++) {
                if (i == 0) {
                    System.out.print(j + 1 + " ");
                } else if (rowPlace == i && seatPlace == j + 1) {
                    System.out.printf("%s ", BUSY);
                } else {
                    System.out.printf("%s ", SEAT);
                }
            }

            System.out.println();
        }
    }

    public static void calculatePrice(int rowsField, int seatField, int rowPlace) {
        if (rowsField * seatField <= MAX_SEATS || rowsField / 2 >= rowPlace) {
            System.out.printf("Ticket price: $%d\n", TICKET_NORMAL_PRICE);
        } else {
            System.out.printf("Ticket price: $%d\n", TICKET_LOW_PRICE);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int rowField = sc.nextInt();

            System.out.println("Enter the number of seats in each row:");
            int seatField = sc.nextInt();

            printField(rowField, seatField, 0, 0);

            System.out.println("Enter a row number:");
            int rowPlace = sc.nextInt();

            System.out.println("Enter a seat number in that row:");
            int seatPlace = sc.nextInt();

            calculatePrice(rowField, seatField, rowPlace);
            printField(rowField, seatField, rowPlace, seatPlace);
        }
    }
}