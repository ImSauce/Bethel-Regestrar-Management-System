
package run;

import com.formdev.flatlaf.FlatIntelliJLaf;
import frame.main;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import server.serverConfig;


public class Run {
    
    
   

     
     public static void main(String args[]) {

         FlatIntelliJLaf.setup();
         UIManager.put("TableHeader.font", new Font("Arial",Font.PLAIN, 12));
        UIManager.put("TableHeader.background", new ColorUIResource(245,245,245)); // Dark gray background
        UIManager.put("TableHeader.foreground", new ColorUIResource(Color.BLACK)); // White foreground
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          //  new splash.SplashScreen(null, true).setVisible(true);
                new serverConfig().setVisible(true);
            }
        });
    }
}
