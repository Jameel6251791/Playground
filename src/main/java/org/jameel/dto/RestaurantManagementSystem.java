package org.jameel.dto;

import java.util.Arrays;

public class RestaurantManagementSystem {
    private static final int MAX_COMBO_NUM = 20;
    private int comboNum = 0;
    private Combo[] combos;

    public RestaurantManagementSystem() {
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo(Combo combo) {
        if (comboNum < MAX_COMBO_NUM) {
            //add combo
            combos[comboNum] = combo;
        } else {
            System.out.println("Not good");
        }
    }

    @Override
    public String toString() {
        String combosStr = "[";
        for (Combo combo : combos) {
            if (combo != null) {
                combosStr += combo + ", ";
            }
        }
        combosStr += "]";

        return "RestaurantManagementSystem{" +
                "combos=" + combosStr +
                '}';
    }
}
