package simplejavagame2riseofthecube;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

    private SimpleJavaGame2RiseOfTheCube game;
    private Ball ball;
    private Player player;
    private int score;
    
    public GamePanel(SimpleJavaGame2RiseOfTheCube game){
        setBackground(Color.BLACK);
        this.game = game;
        ball = new Ball(game);
        player = new Player(game, KeyEvent.VK_W, KeyEvent.VK_S, 20, 20);
        Timer timer = new Timer(5, (ActionListener) this);
        timer.start();
        addKeyListener((KeyListener) this);
        setFocusable(true);
    }
    
    /**
     * Gets the Player
     * @return 
     */
    public Player getPlayer(){
        return player;
    }
    
    /**
     * Increases the Score
     */
    public void increaseScore(){
        score++;
    }
    
    
    public int getScore(){
        return score;
    }
    
    private void update() {
        ball.update();
        player.update();
    }
    
    public void actionPerformed(ActionEvent e){
        update();
        repaint();
    }

    public void keyPressed(KeyEvent e){
        player.pressed(e.getKeyCode());
    }
    
    public void keyReleased(KeyEvent e){
        player.released(e.getKeyCode());
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawString(iterator, WIDTH, WIDTH);
    }
}