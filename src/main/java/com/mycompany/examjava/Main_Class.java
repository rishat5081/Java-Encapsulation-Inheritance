package com.mycompany.examjava;

import java.util.Scanner;

public class Main_Class {

    public static void main(String[] args) {
        Slider slider = new Slider();
        Scanner scanner = new Scanner(System.in);
        // task 14 
        System.out.println("Please enter the Value for the Slider : ");
        int value = scanner.nextInt();
        slider.setValue(value);

        //end of task 14 
       
        //task 15 
        System.out.println("Please give value of Slider: ");
        int value2 = scanner.nextInt();

        if (slider.getMinValue() < value2 || slider.getMaxValue() > value) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("Valid Value");
        }
    }
}
