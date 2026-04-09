package com.pluralsight;

public class StringFormatApp {

    public static void main(String[] args) {
//        double price = 29.9923;
//        String message = "this is the price: "  + String.format("%.2f",   price);
//
//        System.out.println(message);

        int id = 10135;
        String name = "Brandon Plyers";

        float pay = 5239.77f;

        String messageTemplate = "Brandon Plyers id:10135 $5239.77";
        String messageUsingConcat =  name + " id:" + id + " $" + pay;
        String messageUsingStringFormat = String.format("%s id:%d $%.2f", name, id, pay);

        System.out.println(messageTemplate);
        System.out.println(messageUsingConcat);
        System.out.println(messageUsingStringFormat);






    }
}
