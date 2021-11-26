package com.academylearningprogram.cemil.hamburger;

import com.academylearningprogram.cemil.items.Additions;
import com.academylearningprogram.cemil.items.Meat;

public class HealthyBurger {
    private String name;
    private String rollType;
    private String meat;
    private double price = 7.65;

    public HealthyBurger(){
        this.name = "Healthy Burger";
        this.rollType = "Brown Rye Bread Roll";
        this.meat = new Meat().meatType();
        this.price = new Additions().addition(this.price,6);
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
}
