package app;

import java.util.Scanner;
import model.Product;
import service.InventoryService;

public class InventoryApp {

    public static void main(String[] args) {

        // Create inventory array
        Product[] products = new Product[5];

        // Add products to inventory
        products[0] = new Product(
                "P101",
                "Wireless Mouse",
                "Electronics",
                29.99,
                45,
                120
        );

        products[1] = new Product(
                "P102",
                "Coffee Mug",
                "Home",
                12.50,
                80,
                35
        );

        products[2] = new Product(
                "P103",
                "Mechanical Keyboard",
                "Electronics",
                79.99,
                20,
                95
        );

        products[3] = new Product(
                "P104",
                "Notebook",
                "Stationery",
                5.99,
                150,
                60
        );

        products[4] = new Product(
                "P105",
                "USB-C Charger",
                "Electronics",
                39.99,
                12,
                140
        );

        Scanner scanner = new Scanner(System.in);

        InventoryService inventoryService = new InventoryService();

        boolean running = true;

        while (running) {

            System.out.println("\n===== SMART RETAIL INVENTORY =====");
            System.out.println("1. View All Products");
            System.out.println("2. Search Product by ID");
            System.out.println("3. Search Product by Name");
            System.err.println("4.View Low Stock Products");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n--- All Products ---");

                    for (Product product : products) {
                        System.out.println(product);
                    }

                    break;

                case 2:

                    System.out.print("\nEnter Product ID: ");
                    String productId = scanner.nextLine();

                    Product foundById =
                            inventoryService.searchByProductId(
                                    products,
                                    productId
                            );

                    if (foundById != null) {
                        System.out.println("\nProduct Found:");
                        System.out.println(foundById);
                    } else {
                        System.out.println("\nProduct not found.");
                    }

                    break;

                case 3:

                    System.out.print("\nEnter Product Name: ");
                    String productName = scanner.nextLine();

                    Product foundByName =
                            inventoryService.searchByProductName(
                                    products,
                                    productName
                            );

                    if (foundByName != null) {
                        System.out.println("\nProduct Found:");
                        System.out.println(foundByName);
                    } else {
                        System.out.println("\nProduct not found.");
                    }

                    break;

                case 4:
                    System.err.println("Enter low stock threshold");
                    int threshold = scanner.nextInt();
                    scanner.nextLine();

                    System.err.println("\n---Low Stock Products");
                    inventoryService.displayLowStockProducts(products, threshold);

                    break;

                case 5:

                    System.out.println(
                            "\nExiting Smart Retail Inventory Intelligence..."
                    );

                    running = false;

                    break;

                default:

                    System.out.println(
                            "\nInvalid choice. Please try again."
                    );
            }
        }

        scanner.close();
    }
}