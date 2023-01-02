import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number");
        int number = input.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println("0-14");
        } else if (number >= 15 && number <= 35) {
            System.out.println("15-35");
        } else if (number >= 36 && number <= 50) {
            System.out.println("36-50");
        } else if (number >= 50 && number <= 100) {
            System.out.println("50-100");
        } else {
            System.out.println("Please, choose the correct number ");
        }
        input.close();
    }
}

