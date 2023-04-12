package service;

import java.util.Scanner;

public class Calculator {


    Operator operator = new Operator();
    Menu menu = new Menu();
    Scanner intScanner = new Scanner(System.in);


    public void calculate() {
        System.out.println("which one do you want to find the perimeter for? \n" +
                "1-> square \n" +
                "2-> triangle \n" +
                "3-> circle \n" +
                "4-> rectangle");
        int userInput = intScanner.nextInt();
        switch (userInput) {
            case 1: {
                Double side = menu.squareSideGetter();
                Double perimeter = operator.square(side);
                menu.perimeterGetter(perimeter);
                break;
            }
            case 2: {


                break;
            }
            case 3: {

                break;
            }
            case 4: {

                break;
            }
            default: {
                System.out.println("error");
                break;
            }
        }

    }
}
