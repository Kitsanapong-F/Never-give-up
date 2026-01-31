package ordering.controller;

import java.util.Scanner;

import ordering.model.Food;
import ordering.service.CartService;
import ordering.service.MenuService;
import ordering.service.ReceiptService;

public class Controller {
    private MenuService menuService = new MenuService();
    private CartService cartService = new CartService();
    private ReceiptService receiptService = new ReceiptService();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            showMenu();
            int choice = sc.nextInt();

            if (choice == 0) {
                if (cartService.isEmpty()) {
                    System.out.println("Cart is empty!");
                } else {
                    receiptService.print(
                        cartService.getItems(),
                        cartService.getTotal()
                    );
                    break;
                }
            } else if (choice > 0 && choice <= menuService.getMenu().size()) {
                Food food = menuService.getMenu().get(choice - 1);
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                if (qty > 0) {
                    cartService.addItem(food, qty);
                    System.out.println("Added to cart.");
                } else {
                    System.out.println("Invalid quantity.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n--- MENU ---");
        int i = 1;
        for (Food f : menuService.getMenu()) {
            System.out.println(i++ + ". " + f.getName() + " - " + f.getPrice());
        }
        System.out.println("0. Checkout");
        System.out.print("Select: ");
    }
}
