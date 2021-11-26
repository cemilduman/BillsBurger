package com.academylearningprogram.cemil.items;

import com.academylearningprogram.cemil.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;

public class RollType {
    private HashMap<Integer ,String> rollType;

    public String rollType(){
        this.rollType = new HashMap<>();
        this.rollType.put(1, "Brown Rye Bread Roll");
        this.rollType.put(2, "White Bread Roll");
        this.rollType.put(3, "Sesame Bread Roll");
        this.rollType.put(4, "Crunchy Bread Roll");
        this.rollType.put(5, "Sesame Bread with Garlic Sauce");
        return this.rollType.get(Utils.ReadInt("Please choose roll type:\n1-) Brown Rye Bread Roll\n" +
                "2-) White Bread Roll\n3-) Sesame Bread Roll\n4-) Crunchy Bread Roll\n5-) Sesame Bread with Garlic Sauce\n\nSELECTION: "));
    }
}
