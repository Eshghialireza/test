package service;

import java.util.Scanner;

public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    Scanner doubleScanner = new Scanner(System.in);

    public void perimeterGetter(Double perimeter) {
        System.out.println("your perimeter equals to : " + perimeter);
        System.out.println(ANSI_CYAN + "-------------------------------------------------------" + ANSI_RESET);
    }

    public Double squareSideGetter() {
        System.out.println(ANSI_PURPLE + "please enter length of the side of your square" + ANSI_RESET);
        Double side = doubleScanner.nextDouble();
        return side;
    }
}
