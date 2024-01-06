package src;

import java.util.*;

public class Dashboard {
    static Scanner sc = new Scanner(System.in);

    public Dashboard(String displayUsername) {
        while (true) {

            System.out.println();
            System.out.println("=========MAIN DASHBOARD==========");
            System.out.printf("Welcome %s\n", displayUsername);
            System.out.println();
            System.out.println("1. Buy products");
            System.out.println("2. Manage products");
            System.out.println("3. See products info");
            System.out.println("4. See user info");
            System.out.println("0. Exit");

            System.out.print("Enter command : ");
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("0")) {
                return;
            }

            switch (command) {
                case "1":

                case "2":

                case "3":

                case "4":
                default:
                    System.out.println("Please enter a valid command");
                    break;
            }
        }
    }

    static void handleBuyProduct() {

    }

}
