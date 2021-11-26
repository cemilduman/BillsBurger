package com.academylearningprogram.cemil.hamburger;


import com.academylearningprogram.cemil.items.Additions;
import com.academylearningprogram.cemil.items.Meat;
import com.academylearningprogram.cemil.items.RollType;

public class StandardBurger {
    private String name;
    private String rollType;
    private String meat;
    private double price = 5.27;

    public StandardBurger() {
        this.name = "Standard Burger";
        this.rollType = new RollType().rollType();
        this.meat = new Meat().meatType();
        this.price = new Additions().addition(this.price,4);
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
