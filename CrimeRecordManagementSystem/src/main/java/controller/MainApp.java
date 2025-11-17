package controller;

import model.User;
import service.UserService;
import java.util.Scanner;

public class MainApp {

    private static Scanner sc = new Scanner(System.in);
    private static UserService userService = new UserService();

    public static void main(String[] args) {
        System.out.println("=== Crime Records Management System ===");

        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register Admin");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	registerAdmin ();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.out.println(" Exiting System...");
                    System.exit(0);
                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }

    private static void loginUser() {
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        User user = userService.login(username, password);
        if (user != null) {
            if (user.getRole().equalsIgnoreCase("ADMIN")) {
                new AdminController().adminMenu();
            } else if (user.getRole().equalsIgnoreCase("OFFICER")) {
                new OfficerController().officerMenu();
            }
        }
    }

    private static void registerAdmin() {
        System.out.print("Enter Admin Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        userService.registerUser(username, password, role);
    }
}
