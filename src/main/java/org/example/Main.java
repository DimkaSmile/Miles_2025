package org.example;

public class Main {
    public static void main(String[] args) {

        int prise = 130;
        int discount = 20;
        int bonusPerMiles = prise / discount;


        System.out.println("Ваша скидка: " + bonusPerMiles );
    }

}