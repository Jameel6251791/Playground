package org.jameel;

import org.jameel.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish frenchFries = new Dish("French Fries", 2.99, FoodType.VEGETABLE);
        Beverage coke = new Beverage("Coke", 1.99, false);
        Combo cokeAndFries = new Combo("Coke and Fries");
        cokeAndFries.addDish(frenchFries);
        cokeAndFries.addBeverage(coke);

        restaurantManagementSystem.addCombo(cokeAndFries);

        System.out.println(restaurantManagementSystem);



    }
}
