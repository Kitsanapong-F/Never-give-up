package ordering.service;

import java.util.ArrayList;
import java.util.List;

import ordering.model.Food;

public class MenuService {
     private List<Food> menu = new ArrayList<>();

    public MenuService() {
        menu.add(new Food("Fried Rice", 50));
        menu.add(new Food("Noodles", 45));
        menu.add(new Food("Burger", 60));
    }

    public List<Food> getMenu() {
        return menu;
    }
}
