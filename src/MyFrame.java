import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JPanel box;
    MyFrame(){
        this.setTitle("ClickMaster");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
        this.setLayout(null);
        this.addKeyListener(this);

        box = new JPanel(null);
        box.setBackground(Color.blue);
        box.setSize(20,20);
        box.setLocation(240,240);



        this.add(box);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        if(c=='a'){
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
