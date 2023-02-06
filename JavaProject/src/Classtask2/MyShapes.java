package Classtask2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShapes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Shape> collectionOfShapes = new ArrayList<>();

        Messages.printMainMenu();
        int option = input.nextInt();

        while (option > 0 && option < 8) {

            System.out.println("You have chosen " + option);
            switch (option) {
                case 1:
                    Messages.printShapesMenu();
                    int subOption = input.nextInt();
                    System.out.println("Choose your color");
                    String color = input.next();
                    switch (subOption) {
                        case 1:
                            System.out.println("Enter square side");
                            collectionOfShapes.add(new Square(color, input.nextDouble()));
                            break;
                        case 2:
                            System.out.println("Enter width and height");
                            collectionOfShapes.add(new Rectangle(color, input.nextDouble(), input.nextDouble()));
                            break;
                        case 3:
                            System.out.println("Enter circle radius");
                            collectionOfShapes.add(new Circle(color, input.nextDouble()));
                            break;
                        case 4:
                            System.out.println("Enter side");
                            collectionOfShapes.add(new RightTriangle(color, input.nextDouble()));
                            break;
                    }
                    break;
                case 2:
                    Messages.printCollection(collectionOfShapes);
                    break;
                case 3:
                    Messages.printSumPerimeters(collectionOfShapes);
                    break;
                case 4:
                    Messages.printSumAreas(collectionOfShapes);
                    break;
                case 5:
                    Messages.printTheBiggestCircumference(collectionOfShapes);
                    break;
                case 6:
                    Messages.printTheBiggestArea(collectionOfShapes);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
            }
            Messages.printMainMenu();
            option = input.nextInt();
        }

        System.out.println("Good Bye...");
        input.close();
    }

}
