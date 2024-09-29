import java.util.Scanner;

public class LoginForm {
    public static boolean authenticate(String username, String password) {
        // Dummy authentication logic
        return username.equals("shubham916") && password.equals("12345");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful!");
            // Proceed to main system
        } else {
            System.out.println("Invalid credentials.");
        }

        scanner.close();
    }
}
