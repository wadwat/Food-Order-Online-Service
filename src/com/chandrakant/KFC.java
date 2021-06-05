package com.chandrakant;

import java.util.Scanner;

public class KFC {
    static String name;
    static String address;

    public static void restaurant() {
        System.out.println("Welcome to KFC online food order service.");
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
        System.out.println("1.Stay Home Bucket");
        System.out.println("2.8 Pc Hot & Crispy Chicken");
        System.out.println("3.6 Pc Hot & Crispy Chicken");
        System.out.println("4.Friendship Bucket");
        System.out.println("5.Ultimate savings Bucket");
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
        System.out.println("Stay Home Bucket. \nPer Quantity = 749 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 749 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Stay Home Bucket. \nPer Quantity = 749 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((749 * Quantity) + 40));
                System.out.println("Thank you for using KFC. \nHave a good day.");
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
        System.out.println("8 Pc Hot & Crispy Chicken. \nPer Quantity = 650 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 650 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : 8 Pc Hot & Crispy Chicken. \nPer Quantity = 650 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((650 * Quantity) + 40));
                System.out.println("Thank you for using KFC. \nHave a good day.");
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
        System.out.println("6 Pc Hot & Crispy Chicken. \nPer Quantity = 499 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 499 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : 6 Pc Hot & Crispy Chicken. \nPer Quantity = 499 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((499 * Quantity) + 40));
                System.out.println("Thank you for using KFC. \nHave a good day.");
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
        System.out.println("Friendship Bucket. \nPer Quantity = 649 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 649 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Friendship Bucket. \nPer Quantity = 649 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((649 * Quantity) + 40));
                System.out.println("Thank you for using KFC. \nHave a good day.");
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
        System.out.println("Ultimate savings Bucket. \nPer Quantity = 599 Rupees");
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Total Rupees : " + 599 * Quantity);
        System.out.println("Order conform \nThen press 1 \nCancle the order \nThen press 0");
        int place = sc.nextInt();
        switch (place) {
            case 1:
                System.out.println("Your Order has been place succeessfully. \nName : " + name);
                System.out.println("Addrees : " + address);
                System.out.println("Item : Ultimate savings Bucket. \nPer Quantity = 599 Rupees");
                System.out.println("Quantity : " + Quantity);
                System.out.println("Delivery Price : 40");
                System.out.println("Total : " + ((599 * Quantity) + 40));
                System.out.println("Thank you for using KFC. \nHave a good day.");
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


