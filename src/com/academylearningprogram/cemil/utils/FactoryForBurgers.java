package com.academylearningprogram.cemil.utils;

import com.academylearningprogram.cemil.hamburger.DeluxeBurger;
import com.academylearningprogram.cemil.hamburger.HealthyBurger;
import com.academylearningprogram.cemil.hamburger.StandardBurger;

public class FactoryForBurgers {

    public static void FactoryOfStandardBurger(){
        StandardBurger sb =  new StandardBurger();
        System.out.println("\n****" + sb.getName() + "****\n");
        System.out.println("Rolled in: " + sb.getRollType());
        System.out.println("Meat: " + sb.getMeat());
        System.out.println("TOTAL AMOUNT: $" + sb.getPrice());
    }

    public static void FactoryOfDeluxeBurger(){
        DeluxeBurger db =  new DeluxeBurger();
        System.out.println("\n****" + db.getName() + "****\n");
        System.out.println("Rolled in: " + db.getRollType());
        System.out.println("Meat: " + db.getMeat());
        System.out.println("TOTAL AMOUNT: $" + db.getPrice());
    }

    public static void FactoryOfHealthyBurger(){
        HealthyBurger hb =  new HealthyBurger();
        System.out.println("\n****" + hb.getName() + "****\n");
        System.out.println("Rolled in: " + hb.getRollType());
        System.out.println("Meat: " + hb.getMeat());
        System.out.println("TOTAL AMOUNT: $" + hb.getPrice());
    }
}
