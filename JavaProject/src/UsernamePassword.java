import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "P@ssword";

        Scanner input = new Scanner(System.in);
        for (int i = 5; i >= 1; i--) {
            System.out.println("Enter your username  ");
            String userInput = input.nextLine();
            if (userInput.equals(username)) {
                for (int j = 5; j >= 1; j--) {
                    System.out.println("Enter your password  ");
                    String userInputPas = input.nextLine();
                    if (userInputPas.equals(password)) {
                        System.out.println("Logged in");
                        return;
                    }
                    else {
                        System.out.println("Wrong password");
                    }
                }
                return;
            }
            else {
                System.out.println("Wrong username");
            }
        }
        input.close();
    }
}