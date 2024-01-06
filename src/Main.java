package src;

import java.util.*;

public class Main {
    static ArrayList<User> userCredentials = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String displayUsername;

    public static void main(String[] args) {
        User newUser = new User("kevin", "kevin123123");
        userCredentials.add(newUser);

        while (true) {
            System.out.println("=========COMPUTER SHOP==========");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");

            System.out.print("Enter Command : ");
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("0")) {
                System.out.println("Goodbye");
                return;
            }

            switch (command) {
                case "1" -> handleLogin();
                case "2" -> handleRegister();
                default -> System.out.println("Please enter a valid command");
            }
        }
    }

    static void handleDisplayMainDashboard(String displayUsername) {
        new Dashboard(displayUsername);
    }

    static void handleLogin() {
        System.out.println("=========LOGIN==========");

        while (true) {
            for (User user : userCredentials) {
                System.out.print("Enter username : ");
                String username = sc.nextLine();

                if (username.equals(user.getUsername())) {

                    System.out.print("Enter password : ");
                    String password = sc.nextLine();

                    // login success
                    if (password.equals(user.getPassword())) {
                        System.out.println("Login success");
                        displayUsername = user.getUsername();

                        // display main dashboard
                        handleDisplayMainDashboard(displayUsername);
                        return;
                    } else {
                        System.out.println("Password incorrect");
                        System.out.println();
                    }

                } else {
                    System.out.println("Username not found");
                    System.out.println();
                }
            }
        }
    }

    static void handleRegister() {
        System.out.println("=========REGISTER==========");

        boolean isRegister = true;
        User newUser;

        while (isRegister) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            if (userCredentials.contains(username)) {
                System.out.println("Username already exists");
            } else {
                System.out.print("Enter password (min 8 characters): ");
                String password = sc.nextLine();

                if (password.length() < 8) {
                    System.out.println("Password is less than 8 characters");
                } else {
                    newUser = new User(username, password);
                    userCredentials.add(newUser);
                    System.out.println("Registration successful:");

                    handleLogin();
                    isRegister = false;
                }
            }
        }
    }

}
