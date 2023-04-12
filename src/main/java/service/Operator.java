package service;

public class Operator {
    public Double square(Double side) {
        Double perimeter = side * 4;
        return perimeter;
    }

    public Double rectangle(Double length, Double width) {
        Double perimeter = 2 * (length + width);
        return perimeter;
    }

    public Double triangle(Double firstSide, Double secondSide, Double base) {
        Double perimeter = firstSide + secondSide + base;
        return perimeter;
    }

    public Double circle(Double radios) {
        Double perimeter = (2 * 3.14 * radios);
        return perimeter;
    }

}
