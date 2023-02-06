package Classtask2;

public class Rectangle extends Shape {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                "} " + super.toString();
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }
}
