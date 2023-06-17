package Adrian_mpplmodul9;
import java.util.Scanner;
public class TarikSetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String pengguna = "Adrian Alfajri";
        String nomorRekening = "123456789";
        
        System.out.println("Selamat datang, " + pengguna);
        System.out.println("Silakan pilih jenis transaksi:");
        System.out.println("1. Tarik Tunai");
        System.out.println("2. Setor Tunai");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        
        System.out.print("Jumlah Uang: ");
        double jumlahUang = input.nextDouble();
        
        boolean berhasil = false;
        if (pilihan == 1) {
            berhasil = tarikTunai(nomorRekening, jumlahUang);
        } else if (pilihan == 2) {
            berhasil = setorTunai(nomorRekening, jumlahUang);
        }
        
        if (berhasil) {
            System.out.println("\nTransaksi berhasil!");
            if (pilihan == 1) {
                System.out.println("Anda telah menarik tunai sebesar " + jumlahUang);
            } else if (pilihan == 2) {
                System.out.println("Anda telah melakukan setor tunai sebesar " + jumlahUang);
            }
        } else {
            System.out.println("\nTransaksi gagal. Pastikan saldo mencukupi.");
        }
    }
    
    public static boolean tarikTunai(String nomorRekening, double jumlahUang) {
        double saldo = 5000; // Contoh saldo
        
        if (saldo >= jumlahUang) {
            return true;
        }
        
        return false;
    }
    
    public static boolean setorTunai(String nomorRekening, double jumlahUang) {
        return true; 
        }
}
