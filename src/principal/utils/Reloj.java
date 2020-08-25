
package principal.utils;

import java.text.DecimalFormat;
import java.time.LocalTime;
import javax.swing.JLabel;

public class Reloj implements Runnable{
    private JLabel lbl;

    public Reloj(JLabel lbl) {
        this.lbl = lbl;
    }
    
    @Override
    public void run() {
        DecimalFormat df = new DecimalFormat("00");
        while(true){
            LocalTime lt = LocalTime.now();
            String hora=df.format(lt.getHour())+':'
                       +df.format(lt.getMinute())+':'
                       +df.format(lt.getSecond());
            lbl.setText(hora);
            try {Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
    
}
