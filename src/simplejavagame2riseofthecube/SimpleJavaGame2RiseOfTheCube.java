
package simplejavagame2riseofthecube;

import java.awt.Color;
import javax.swing.JFrame;

public class SimpleJavaGame2RiseOfTheCube extends JFrame{

    // Varaibles
    private int WIDTH = 720, HEIGHT = 1280;
    private GamePanel panel;
    
    /**
     * Constructor for the JFrame
     */
    public SimpleJavaGame2RiseOfTheCube(){
        setSize(HEIGHT, WIDTH);
        setTitle("Pong");
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new GamePanel(this);
        add(panel);
    }
    
    /**
     * Gets the Game Panel
     * @return 
     */
    public GamePanel getPanel(){
        return panel;
    }
    
    /**
     * Main Method
     * @param args 
     */
    public static void main(String[] args) {
        new SimpleJavaGame2RiseOfTheCube();
    }
    
}
