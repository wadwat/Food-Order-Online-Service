package com.chandrakant;

import java.util.Scanner;

public class McDonolds {
    static String name;
    static String address;

    public static void restaurant() {
        System.out.println("Welcome to McDonolds online food order service.");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter your Name : ");
        name = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Please enter your Addrees : ");
        address = sc2.next();
        System.out.println("Thank you for giving your information.");
    }

    public static void menu() {
        System.out.println("Here the list of food items.");
        System.out.println("1.McSaver American Cheese Supreme-Veg Meal");
        System.out.println("2.McSaver American Cheese Supreme-chicken Meal");
        System.out.println("3.Mexican McAlooTikki Meal");
        System.out.println("4.Cheese Crispy with Whole Wheat Bun");
        System.out.println("5.Chicken Fries with Coca Cola (500g)");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please select your food item.");
        int recipie = sc3.nextInt();
        switch (recipie) {
            case 1 :
                recipieNo1();
                break;
            case 2 :
                recipieNo2();
                break;
            case 3 :
                recipieNo3();
                break;
            case 4 :
                recipieNo4();
                break;
            case 5 :
                recipieNo5();
                break;
            default :
                System.out.println("Please select proper recipie.");
                menu();
        }
    }

    public static void recipieNo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("McSaver American Cheese Supreme-Veg Meal. \nPer Quantity = 475 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 475 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : McSaver American Cheese Supreme-Veg Meal. \nPer Quantity = 475 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((475 * Quantity) + 40));
                System.out.println("Thank you for using McDonolds. \nHave a good day.");
                break;
            case 0:
                System.out.println("Order has been cancle.");
                menu();
                break;
            default:
                System.out.println("Please select proper number.");
                recipieNo1();
        }

    }

    public static void recipieNo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("McSaver American Cheese Supreme-chicken Meal. \nPer Quantity = 509 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 509 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : McSaver American Cheese Supreme-chicken Meal. \nPer Quantity = 509 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((509 * Quantity) + 40));
                System.out.println("Thank you for using McDonolds. \nHave a good day.");
                break;
            case 0:
                System.out.println("Order has been cancle.");
                menu();
                break;
            default:
                System.out.println("Please select proper number.");
                recipieNo2();
        }
    }

    public static void recipieNo3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mexican McAlooTikki Meal. \nPer Quantity = 449 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 449 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Mexican McAlooTikki Meal. \nPer Quantity = 449 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((449 * Quantity) + 40));
                System.out.println("Thank you for using McDonolds. \nHave a good day.");
                break;
            case 0:
                System.out.println("Order has been cancle.");
                menu();
                break;
            default:
                System.out.println("Please select proper number.");
                recipieNo3();
        }
    }

    public static void recipieNo4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cheese Crispy with Whole Wheat Bun. \nPer Quantity = 339 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 339 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Cheese Crispy with Whole Wheat Bun. \nPer Quantity = 339 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((339 * Quantity) + 40));
                System.out.println("Thank you for using McDonolds. \nHave a good day.");
                break;
            case 0:
                System.out.println("Order has been cancle.");
                menu();
                break;
            default:
                System.out.println("Please select proper number.");
                recipieNo4();
        }
    }

    public static void recipieNo5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chicken Fries with Coca Cola (500g). \nPer Quantity = 298 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 298 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Chicken Fries with Coca Cola (500g). \nPer Quantity = 298 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((298 * Quantity) + 40));
                System.out.println("Thank you for using McDonolds. \nHave a good day.");
                break;
            case 0:
                System.out.println("Order has been cancle.");
                menu();
                break;
            default:
                System.out.println("Please select proper number.");
                recipieNo5();
        }
    }
}
