package fuentes_henriquez_zazzali.Logic;

import java.util.Scanner;
import fuentes_henriquez_zazzali.Domain.Customer;

public class Main {
    public static void main(String[] args) {
        deployMenu();
    }

    private static void deployMenu() {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        String[] productCategories = { "Computador", "Monitor", "Mouse" };
        String[] productCategoriesEN = { "Computer", "Monitor", "Mouse" };

        do {
            System.out.println("Bienvenido al sistema de ventas de Techno Store");
            System.out.println("1. Ingresar");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            option = Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Ingrese su rut: ");
                    String rut = scan.nextLine();
                    // Obtener cliente de la base de datos
                    Customer c = getCustomerFromDatabase(rut);
                    if (c != null) {
                        deployMenuCustomer(c, productCategories, productCategoriesEN);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 2:
                    registerCustomer();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema de ventas de Techno Store");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (option != 3);
        scan.close();
    }

    private static Customer getCustomerFromDatabase(String rut) {
        // Implementar obtención de cliente desde la base de datos
        return null; // Cambiar esto con la lógica de obtención de cliente
    }

    private static void registerCustomer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su rut: ");
        String rut = scan.nextLine();
        System.out.println("Ingrese su nombre: ");
        String name = scan.nextLine();
        System.out.println("Ingrese su apellido: ");
        String lastName = scan.nextLine();
        System.out.println("Ingrese su dirección: ");
        String address = scan.nextLine();
        System.out.println("Ingrese su teléfono: ");
        String phone = scan.nextLine();
        System.out.println("Ingrese su email: ");
        String email = scan.nextLine();
        // Crear cliente en la base de datos
        Customer c = new Customer(rut, name, lastName, address, phone, email);
        scan.close();
    }

    private static void deployMenuCustomer(Customer c, String[] productCategories, String[] productCategoriesEN) {
        Scanner scan = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Que desea comprar?  ");

            for (int i = 0; i < productCategories.length; i++) {
                System.out.println((i + 1) + ". " + productCategories[i]);
            }
            System.out.println(productCategories.length + ". Salir");
            option = Integer.parseInt(scan.nextLine());

            if (option >= 1 && option <= productCategories.length) {
                String selectedCategory = productCategoriesEN[option - 1];
                showProductsByCategory(selectedCategory);
                System.out.println("Ingrese la id/s del/de los producto/s que desea comprar (Separados por ,)");
                String[] selectedProducts = scan.nextLine().replace(" ", "").split(",");
                handlePurchase(c, selectedProducts);
            } else if (option != productCategories.length + 1) {
                System.out.println("Opción inválida");
            }

        } while (option != productCategories.length + 1);
        scan.close();
    }

    private static void handlePurchase(Customer c, String[] selectedProducts) {
        // Implementar lógica de compra
    }

    private static void showProductsByCategory(String selectedCategory) {
        // Implementar obtención y visualización de productos por categoría
    }
}
