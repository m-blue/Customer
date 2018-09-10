package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String customerName = "";
        String customerPhone = "";
        String customerContact = "";

        Scanner input = new Scanner(System.in);
        int userInput;
        boolean isValid = false;

        do {
            System.out.println("Please choose between a Residential or a Business customer");
            System.out.println("1. Residential");
            System.out.println("2. Business");

            userInput = input.nextInt();

            switch (userInput){
                case 1:
                    isValid = true;
                    CustomerInfo(customerName, customerPhone);
                    break;

                case 2:
                    isValid = true;
                    CustomerInfo(customerName, customerPhone, customerContact);
                    break;

                default:
                    System.out.println("Invalid Entry");
            }
        }while(!isValid);

    }

    private static void CustomerInfo(String name, String number){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = input.nextLine();
        System.out.println("Please enter your phone number");
        number = input.nextLine();

        System.out.println(name);
        System.out.println(number);

    }

    private static void CustomerInfo(String name, String number, String contact){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your business name");
        name = input.nextLine();
        System.out.println("Please enter your contact name");
        contact = input.nextLine();
        System.out.println("Please enter your phone number");
        number = input.nextLine();

        System.out.println(name);
        System.out.println(contact);
        System.out.println(number);

    }
}
