import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username  ");
        username = input.nextLine();
        if (username.equals("Admin")) {
            System.out.println("Enter your password: ");
            password = input.nextLine();
            if (password.equals("P@ssword"))
                System.out.println("Hello " + username + ", you are logged in");
            else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("No user with this name");
        }
        input.close();
    }
}