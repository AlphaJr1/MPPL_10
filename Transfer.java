package Adrian_mpplmodul9;
import java.util.Scanner;
public class Transfer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String pengirim = "Adrian Alfajri";
        String nomorRekeningPengirim = "123456789";
        
        System.out.println("Selamat datang, " + pengirim);
        System.out.println("Silakan masukkan data transfer:");
        System.out.print("Nomor Rekening Penerima: ");
        String nomorRekeningPenerima = input.nextLine();
        System.out.print("Jumlah Transfer: ");
        double jumlahTransfer = input.nextDouble();
        
        boolean berhasil = transfer(pengirim, nomorRekeningPengirim, nomorRekeningPenerima, jumlahTransfer);
        
        if (berhasil) {
            System.out.println("\nTransfer berhasil!");
            System.out.println("Anda telah mentransfer " + jumlahTransfer + " ke nomor rekening " + nomorRekeningPenerima);
        } else {
            System.out.println("\nTransfer gagal. Pastikan nomor rekening penerima valid dan saldo mencukupi.");
        }
    }
    
    public static boolean transfer(String pengirim, String nomorRekeningPengirim, String nomorRekeningPenerima, double jumlahTransfer) {
        if (cekSaldo(nomorRekeningPengirim, jumlahTransfer)) {
            return true;
        }
        
        return false;
    }
    
    public static boolean cekSaldo(String nomorRekening, double jumlahTransfer) {
        double saldoPengirim = 5000; 
        if (saldoPengirim >= jumlahTransfer) {
            return true;
        }
        
        return false;
    }
}
