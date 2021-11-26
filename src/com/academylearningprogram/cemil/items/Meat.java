package com.academylearningprogram.cemil.items;

import com.academylearningprogram.cemil.utils.Utils;

import java.util.HashMap;

public class Meat{
    private HashMap<Integer, String> meat;

    public String meatType() {
        this.meat = new HashMap<>();
        this.meat.put(1, "Bacon");
        this.meat.put(2, "Ham");
        this.meat.put(3, "Cow");
        this.meat.put(4, "Chicken");
        return this.meat.get(Utils.ReadInt("Please choose meat type:\n1-) Bacon\n" +
                "2-) Ham\n3-) Cow\n4-) Chicken\n\nSELECTION: "));
    }

}
