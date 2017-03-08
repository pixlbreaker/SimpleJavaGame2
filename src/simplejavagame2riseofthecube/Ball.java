package simplejavagame2riseofthecube;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball{
    
    // Variables
    private static final int WIDTH = 15, HEIGHT = 15;
    private SimpleJavaGame2RiseOfTheCube game;
    private int x, y, xa = 2, ya = 2;
    
    public Ball(SimpleJavaGame2RiseOfTheCube game){
        this.game = game;
        x = game.getWidth()/2;
        y = game.getHeight()/2;
    }
    
    public void update(){
        
        // Move the Ball
        x += xa;
        y += ya;
    }
    
    public void checkCollision(){
        if (game.getPanel().getPlayer().getBounds().intersects(getBounds()))
            xa = -xa;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
    
    public void paint(Graphics g){
        g.setColor(new Color(0, 126, 143));
        g.fillOval(x, y, WIDTH, HEIGHT);
    }
}