package Classtask2;

public class Square extends Shape {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " " + super.toString();
    }

    /**
     * Method calculates area
     *
     * @return calculated area of the shape.
     */
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

}

