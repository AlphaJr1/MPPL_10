package Adrian_mpplmodul9;
import java.util.Timer;
import java.util.TimerTask;

public class Notif {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new ReminderTask(), 0, 60 * 60 * 1000);
        
        System.out.println("Aplikasi Notifikasi Reminder sedang berjalan...");
    }
    
    static class ReminderTask extends TimerTask {
        @Override
        public void run() {
            String pesan = "Jangan lupa bayar tagihan listrik hari ini!";
            
            sendNotification(pesan);
        }
        
        private void sendNotification(String message) {
            System.out.println("Notifikasi: " + message);
        }
    }
}
