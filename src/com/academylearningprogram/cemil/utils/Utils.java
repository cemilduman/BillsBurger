package com.academylearningprogram.cemil.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utils {
    private static Scanner scan = new Scanner(System.in);

    public static int ReadInt(String query){
        System.out.print(query);
        int selection = scan.nextInt();
        scan.nextLine();
        return selection;
    }
    public static String ReadString(String query){
        System.out.println(query);
        String selection = scan.nextLine();
        return selection;
    }

    public static void menuMain(){
        menuHeader();
        boolean control = true;
        while(control){
            int selectedNumber = menuSelection();
            control = menuSelectionProcess(selectedNumber);
        }
        menuFooter();
    }

    public static void menuHeader(){
        System.out.print("\n****WELCOME TO BILL'S BURGER****\n");
        System.out.println("\nToday: " + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MMMM/dd")) + "\n");
        System.out.println("\n****BURGERS****\n\nSTANDARD BURGER (*Up to 4 additions are allowed*) starts at $5.27 (*additions not included*)\n\n" +
                "DELUXE BURGER (Comes with coke&fries included in price) - (*Up to 2 additions are allowed*) starts at $9.63 (*additions not included*)\n\n" +
                "HEALTHY BURGER (Comes with BROWN RYE BREAD ROLL) - (*Up to 6 additions allowed*) starts at $7.65 (*additions not included*)\n");
    }

    public static void menuFooter(){
        System.out.println("Thank you for choosing Bill's Burger. Your order is ready. Plase come again....\n\n GOOD BYE!!!");
    }

    public static int menuSelection(){
      return ReadInt("\nPlease make your selection:\n1-) STANDARD BURGER\n2-) DELUXE BURGER\n3-) HEALTHY BURGER\n\nSELECTION: ");
    }

    public static boolean menuSelectionProcess(int number){
        boolean menuExit = false;
        switch (number){
            case 1:
                FactoryForBurgers.FactoryOfStandardBurger();
               return menuExit;
            case 2:
                FactoryForBurgers.FactoryOfDeluxeBurger();
                return menuExit;
            case 3:
                FactoryForBurgers.FactoryOfHealthyBurger();
                return menuExit;
            default:
                System.out.println("\nYou entered wrong number for choice. Please enter a number between \"1-3\" !!!");
                return !menuExit;
        }
    }
}
