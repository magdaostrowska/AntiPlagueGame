package GUI;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Czas implements Runnable {

    LocalTime czas = LocalTime.now();

    @Override
    public void run() {
        while (true){
            try {
                System.out.println(czas);
                Thread.sleep(1000);
                czas.plusSeconds(1);

            } catch (InterruptedException e) {
            }
        }
    }

}
