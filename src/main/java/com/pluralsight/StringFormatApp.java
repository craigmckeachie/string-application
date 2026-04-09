package com.pluralsight;

public class StringFormatApp {

    public static void main(String[] args) {
//        double price = 29.9923;
//        String message = "this is the price: "  + String.format("%.2f",   price);
//
//        System.out.println(message);

        int id = 10135;
        String name = "Brandon Plyers";
        char middleInitial = 'F';
        float pay = 5239.77f;

//        String message = "Brandon Plyers id:10135 $5,239.77";
//        String message =  name + "id: " + id + " $" + pay;
        String message = String.format("%s Initial:%c  id:%d $%.2f", name,middleInitial, id, pay);

        System.out.println(message);



    }
}
