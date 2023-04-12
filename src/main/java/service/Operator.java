package service;

public class Operator {
    private Double square(Double side) {
        Double perimeter = side * 4;
        return perimeter;
    }

    private Double rectangle(Double length, Double width) {
        Double perimeter = 2 * (length + width);
        return perimeter;
    }

    private Double triangle(Double firstSide, Double secondSide, Double base) {
        Double perimeter = firstSide + secondSide + base;
        return perimeter;
    }

    private Double circle(Double radios) {
        Double perimeter = (2 * 3.14 * radios);
        return perimeter;
    }

}
