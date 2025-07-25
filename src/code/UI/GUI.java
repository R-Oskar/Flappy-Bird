package code.UI;

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

    public GUI() {
        setTitle("Flappy Bird");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        Color lightBlue = new Color(135, 206, 250);
        getContentPane().setBackground(lightBlue);
        setIconImage(new ImageIcon(getClass().getResource("/ressources/images/Flappy Bird Icon.png")).getImage());
    }
}
