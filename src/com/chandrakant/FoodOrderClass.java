package com.chandrakant;

import java.util.Scanner;

public class FoodOrderClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Tomato online food order service. \nHere the India's best restaurants.");
        foodServiceShop();
    }

    public static void foodServiceShop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.KFC");
        System.out.println("2.McDonolds");
        System.out.println("3.Dominose");
        System.out.println("Please enter your choice.");
        int menuNumber = sc.nextInt();
        selectMenu(menuNumber);
    }

    private static void selectMenu(int menuNumber) {
        switch (menuNumber) {
            case 1:
                KFC kfc = new KFC();
                KFC.restaurant();
                KFC.menu();
                break;
            case 2:
                McDonolds mcDonolds = new McDonolds();
                McDonolds.restaurant();
                McDonolds.menu();
                break;
            case 3:
                Dominose Dominose = new Dominose();
                Dominose.restaurant();
                Dominose.menu();
                break;
            default:
                System.out.println("Please select proper menu number!");
                FoodOrderClass foodOrderClass = new FoodOrderClass();
        }
    }
}
