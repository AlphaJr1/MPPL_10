package Adrian_mpplmodul9;
import java.util.Scanner;

public class MenuBar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        do {
            System.out.println("=== Aplikasi Bankerium ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Transfer");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Setor Tunai");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    signUp();
                    break;
                case 2:
                    transfer();
                    break;
                case 3:
                    tarikTunai();
                    break;
                case 4:
                    setorTunai();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi Bankerium.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
            
            System.out.println();
        } while (pilihan != 0);
    }
    
    public static void signUp() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Sign Up ===");
        System.out.println("Silakan masukkan data pendaftaran Anda");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Nomor Telepon: ");
        String nomorTelepon = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        
        
        System.out.println("Pendaftaran berhasil!");
    }
    
    public static void transfer() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Transfer ===");
        System.out.print("Nomor Rekening Penerima: ");
        String nomorRekeningPenerima = input.nextLine();
        System.out.print("Jumlah Transfer: ");
        double jumlahTransfer = input.nextDouble();
        
        
        System.out.println("Transfer berhasil!");
    }
    
    public static void tarikTunai() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Tarik Tunai ===");
        System.out.print("Nomor Rekening: ");
        String nomorRekening = input.nextLine();
        System.out.print("Jumlah Uang: ");
        double jumlahUang = input.nextDouble();
        
        
        System.out.println("Tarik tunai berhasil!");
    }
    
    public static void setorTunai() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Setor Tunai ===");
        System.out.print("Nomor Rekening: ");
        String nomorRekening = input.nextLine();
        System.out.print("Jumlah Uang: ");
        double jumlahUang = input.nextDouble();
        
        
        System.out.println("Setor tunai berhasil!");
    }
}
