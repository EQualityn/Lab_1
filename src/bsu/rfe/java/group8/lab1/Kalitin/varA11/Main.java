package bsu.rfe.java.group8.lab1.Kalitin.varA11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of product(name/type/type, name/type, name): ");
        String searchProduct = input.nextLine();
        System.out.println(searchProduct);
    }
}