package Adrian_mpplmodul9;
import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
        scanner.close();
    }
}
