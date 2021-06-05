package com.chandrakant;

import java.util.Scanner;

public class Dominose {
    static String name;
    static String address;

    public static void restaurant() {
        System.out.println("Welcome to Dominose online food order service.");
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
        System.out.println("1.Cheese n Corn");
        System.out.println("2.Double Cheese Margherita");
        System.out.println("3.Creamy Tomato Pasta Pizza");
        System.out.println("4.Chicken Golden Delight");
        System.out.println("5.Indi Chicken Tikka");
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
        System.out.println("Cheese n Corn. \nPer Quantity = 139 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 139 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Cheese n Corn. \nPer Quantity = 139 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((139 * Quantity) + 40));
                System.out.println("Thank you for using Dominose. \nHave a good day.");
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
        System.out.println("Double Cheese Margherita. \nPer Quantity = 309 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 309 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Double Cheese Margherita. \nPer Quantity = 309 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((309 * Quantity) + 40));
                System.out.println("Thank you for using Dominose. \nHave a good day.");
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
        System.out.println("Creamy Tomato Pasta Pizza. \nPer Quantity = 469 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 469 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Creamy Tomato Pasta Pizza. \nPer Quantity = 469 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((469 * Quantity) + 40));
                System.out.println("Thank you for using Dominose. \nHave a good day.");
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
        System.out.println("Chicken Golden Delight. \nPer Quantity = 649 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 649 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Chicken Golden Delight. \nPer Quantity = 649 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((649 * Quantity) + 40));
                System.out.println("Thank you for using Dominose. \nHave a good day.");
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
        System.out.println("Indi Chicken Tikka. \nPer Quantity = 599 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 599 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Indi Chicken Tikka. \nPer Quantity = 599 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((599 * Quantity) + 40));
                System.out.println("Thank you for using Dominose. \nHave a good day.");
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