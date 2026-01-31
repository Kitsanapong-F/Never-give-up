package ordering.service;

import java.util.List;

import ordering.model.OrderItem;

public class ReceiptService {
      public void print(List<OrderItem> items, double total) {
        System.out.println("\n====== RECEIPT ======");
        for (OrderItem item : items) {
            System.out.println(
                item.getFood().getName() + " x" + item.getQuantity()
                + " = " + item.getTotal()
            );
        }
        System.out.println("---------------------");
        System.out.println("TOTAL: " + total);
    }
}
