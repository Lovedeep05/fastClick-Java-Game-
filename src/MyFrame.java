import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JPanel box;
    JLabel endMessage;
    Boolean isEnd = false;
    JButton playAgain;
    MyFrame(){
        this.setTitle("ClickMaster");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
        this.setLayout(null);
        this.addKeyListener(this);
        JLabel title = new JLabel("Press 'A' to move right, 'L' to move left");
        title.setBounds(0,0,500,50);
        title.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        endMessage = new JLabel();
        endMessage.setBounds(0,400,500,50);
        endMessage.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        box = new JPanel(null);
        box.setBackground(Color.blue);
        box.setSize(20,20);
        box.setLocation(240,240);

        playAgain = new JButton("PLAY AGAIN");
        playAgain.setBounds(175,225,150,50);
        playAgain.setVisible(false);
        playAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                box.setLocation(240,240);
                playAgain.setVisible(false);
                endMessage.setVisible(false);
                isEnd = false;
            }
        });

        this.add(playAgain);
        this.add(endMessage);
        this.add(title);
        this.add(box);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(isEnd);
        if(!isEnd) {
            char c = e.getKeyChar();
            System.out.println(c);
            int x = box.getX(), y = box.getY();
            System.out.println(x + "," + y);
            if (c == 'a' || c == 'A') {
                box.setLocation(x + 20, y);
            }
            if (c == 'l' || c == 'L') {
                box.setLocation(x - 20, y);
            }
            if (x > 440) {
                endMessage.setText("Player on the LEFT won");
                endMessage.setVisible(true);
                System.out.println("LEFT");
                isEnd = true;
                playAgain.setVisible(true);
            }
            if (x < 40) {
                endMessage.setText("Player on the RIGHT won");
                endMessage.setVisible(true);
                System.out.println("RIGHT");
                isEnd = true;
                playAgain.setVisible(true);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
