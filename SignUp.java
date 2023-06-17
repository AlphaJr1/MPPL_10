package Adrian_mpplmodul9;
import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di Aplikasi Bankerium");
        System.out.println("Silakan masukkan data pendaftaran Anda");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Nomor Telepon: ");
        String nomorTelepon = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        
        boolean isValid = validateData(nama, alamat, nomorTelepon, email);
        
        if (isValid) {
            System.out.println("\nTerima kasih, pendaftaran Anda berhasil!");
            System.out.println("Berikut adalah informasi pendaftaran Anda:");
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("Nomor Telepon: " + nomorTelepon);
            System.out.println("Email: " + email);
        } else {
            System.out.println("\nMaaf, pendaftaran Anda tidak berhasil. Silakan periksa kembali data yang Anda masukkan.");
        }
    }
    
    public static boolean validateData(String nama, String alamat, String nomorTelepon, String email) {
        if (nama.isEmpty() || alamat.isEmpty() || nomorTelepon.isEmpty() || email.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
