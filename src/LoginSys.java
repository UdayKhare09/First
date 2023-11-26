import Menus.AdminMenu;
import Menus.MainMenu;
import Resources.Strings;

public class LoginSys {
    public static void login () {
        while (true) {
            System.out.print("Enter your username: ");
            String username = new java.util.Scanner(System.in).next();
            System.out.print("Enter your password: ");
            String password = new java.util.Scanner(System.in).next();
            for (String credential : Strings.loginCredentials) {
                String[] user = credential.split(",");
                if (user[0].equals(username) && user[1].equals(password)) {
                    System.out.println("Login successful");
                    if (username.equals("admin")) {
                        System.out.println("Welcome admin");
                        AdminMenu.adminmenu();
                    } else {
                        System.out.println("Welcome " + username);
                        MainMenu.mainmenu();
                    }
                }
            }
            System.out.println("Invalid username or password");
            System.out.println("Do you want to try again? (y/n)");
            String tryAgain = new java.util.Scanner(System.in).next();
            if (tryAgain.equals("n")) {
                System.out.println("Thank you for using our program");
                System.exit(0);
            }
        }
    }
}
