package entityclassassignment2;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // toString method to display product details easily
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    // Main method to collect 4 product details
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Product Price: ");
            double price = scanner.nextDouble();

            System.out.print("Product Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            products[i] = new Product(id, name, price, quantity);
            System.out.println();
        }

        System.out.println("Entered product details:");
        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}