import java.util.Scanner;

public class CinemaWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== CINEMA MENU ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Select menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                String name;
                int row, column;

                System.out.print("Enter audience name: ");
                name = sc.nextLine();

                while (true) {
                    System.out.print("Enter row number (1–4): ");
                    row = sc.nextInt();
                    System.out.print("Enter column number (1–2): ");
                    column = sc.nextInt();
                    sc.nextLine();

                    if (row < 1 || row > 4 || column < 1 || column > 2) {
                        System.out.println("Seat not available. Try again!");
                        continue;
                    }

                  
                    if (audience[row-1][column-1] != null) {
                        System.out.println("Seat already occupied by: " + audience[row-1][column-1]);
                        System.out.println("Please choose another seat!");
                        continue;
                    }

                    audience[row-1][column-1] = name;
                    System.out.println("Seat successfully assigned!");
                    break;
                }

            } else if (menu == 2) {
                System.out.println("\n=== AUDIENCE LIST ===");
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(audience[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Thank you. Program finished.");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
