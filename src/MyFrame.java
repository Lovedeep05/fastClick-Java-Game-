import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("ClickMaster");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
        this.setLayout(null);

        JPanel box = new JPanel(null);
        box.setSize(20,20);
        box.setLocation(250,250);
    }

}
