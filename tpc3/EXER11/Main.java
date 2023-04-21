import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Add vehicle");
            System.out.println("2 - List vehicles");
            System.out.println("3 - Remove vehicle");
            System.out.println("4 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addVehicle(scanner);
                    break;
                case 2:
                    listVehicles();
                    break;
                case 3:
                    removeVehicle(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void removeVehicle(Scanner scanner) {
        System.out.println("Enter vehicle ID:");
        int id = scanner.nextInt();

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == id) {
                vehicles.remove(i);
                System.out.println("Vehicle removed.");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }


    private static void listVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
    private static void addVehicle(Scanner scanner) {
        System.out.println("Enter make:");
        String make = scanner.next();

        System.out.println("Enter model:");
        String model = scanner.next();

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Is it a second-hand vehicle? (y/n)");
        String answer = scanner.next();
        // add the missing closing curly brace here
    }


