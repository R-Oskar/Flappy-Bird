package code.main;

import code.UI.GUI;
import javax.swing.SwingUtilities;

public class Game {
    private final GUI gui;

    public Game(){
        gui = new GUI();
    }
    public void start(){
        SwingUtilities.invokeLater(() -> {
            gui.setVisible(true); // Show the GUI
        });
    }
}
