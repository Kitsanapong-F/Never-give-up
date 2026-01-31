package ordering.service;

import java.util.ArrayList;
import java.util.List;

import ordering.model.Food;
import ordering.model.OrderItem;

public class CartService {
       private List<OrderItem> cart = new ArrayList<>();

    public void addItem(Food food, int qty) {
        cart.add(new OrderItem(food, qty));
    }

    public List<OrderItem> getItems() {
        return cart;
    }

    public boolean isEmpty() {
        return cart.isEmpty();
    }

    public double getTotal() {
        double sum = 0;
        for (OrderItem item : cart) {
            sum += item.getTotal();
        }
        return sum;
    }
}
