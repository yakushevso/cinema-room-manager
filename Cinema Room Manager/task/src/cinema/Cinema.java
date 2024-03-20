package cinema;

public class Cinema {
    private static final int ROW = 7;
    private static final int SEAT = 8;

    public static void printField() {
        System.out.println("Cinema:");

        for (int i = 0; i <= ROW; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
            
            for (int j = 0; j < SEAT; j++) {
                if (i == 0) {
                    System.out.print(j + 1 + " ");
                } else {
                    System.out.print("S ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printField();
    }
}