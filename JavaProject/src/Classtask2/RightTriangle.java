package Classtask2;

public class RightTriangle extends Shape {

    private double side;


    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (side * side * Math.sqrt(0.75));
    }

    @Override
    public double calculatePerimeter() {
        return side * 3;
    }
}
