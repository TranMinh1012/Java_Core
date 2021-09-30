import java.text.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ShowTimeUsingThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Runnable clock;
        clock = new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss aa");
                while(true){
                    Date currentTime = new Date();
                    String s = time.format(currentTime);
                    System.out.println(s);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ShowTimeUsingThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        Thread showTime = new Thread(clock);
        showTime.start();
    }
}
