package com.academylearningprogram.cemil.items;

import com.academylearningprogram.cemil.utils.Utils;

import java.util.HashMap;

public class Additions extends Utils {
    private HashMap<Integer, String> additions;

    public Additions() {
        this.additions =  new HashMap<>();
        this.additions.put(1, "Tomato");
        this.additions.put(2, "Lettuce");
        this.additions.put(3, "Mustard");
        this.additions.put(4, "Mushroom");
        this.additions.put(5, "Onion");
        this.additions.put(6, "Cheese");

    }

    public double addition(double price, int limit){
        int count = 0;
        while(count < limit){
            switch (ReadInt("Please choose additions:\n1-) Tomato\n" +
                    "2-) Lettuce\n3-) Mustard\n4-) Mushroom\n5-) Onion\n6-) Cheese\n0-) for pass\n\nSELECTION: ")){
                case 1:
                    System.out.println(this.additions.get(1) + " --> is added.");
                    price += 2.19;
                    count ++;
                    continue;
                case 2:
                    System.out.println(this.additions.get(2) + " --> is added.");
                    price += 0.23;
                    count ++;
                    continue;
                case 3:
                    System.out.println(this.additions.get(3) + " --> is added.");
                    price += 0.5;
                    count ++;
                    continue;
                case 4:
                    System.out.println(this.additions.get(4) + " --> is added.");
                    price += 3.17;
                    count ++;
                    continue;
                case 5:
                    System.out.println(this.additions.get(5) + " --> is added.");
                    price += 1.7;
                    count ++;
                    continue;
                case 6:
                    System.out.println(this.additions.get(6) + " --> is added.");
                    price += 2.0;
                    count ++;
                    continue;
                default:
                    System.out.println("This selection is passed!");
                    count ++;
                    continue;
            }
        }
        return price;
    }
}
