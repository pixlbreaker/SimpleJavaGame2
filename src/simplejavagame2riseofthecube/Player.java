package simplejavagame2riseofthecube;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Player {
    
    // Variables
    private static final int WIDTH = 15, HEIGHT =15;
    private SimpleJavaGame2RiseOfTheCube game;
    private int up, down, left, right;
    private int x, xa, y, ya;
    
    /**
     * Constructor for the Player
     * @param game
     * @param up
     * @param down
     * @param x
     * @param y 
     */
    public Player(SimpleJavaGame2RiseOfTheCube game, int up, int down, 
            int right, int left, int x, int y){
        this.game = game;
        this.x = x; 
        y = game.getHeight() / 2;
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
    }
    
    /**
     * Update Function
     */
    public void update(){
        if (y > 0 && y < game.getHeight() - HEIGHT - 29)
            y += ya;
        else if (y == 0)
            y++;
        else if (y == game.getHeight() - HEIGHT - 29)
            y--;
        
        if (x > 0 && x < game.getWidth() - WIDTH -29)
            x += xa;
        else if (x == 0)
            x++;
        else if (x == game.getWidth() - WIDTH -29)
            x--;
    }
    
    /**
     * Pressed a Key
     * @param keyCode 
     */
    public void pressed (int keyCode){
        if (keyCode == up)
            ya = -2;
        else if (keyCode == down)
            ya = 2;
        else if (keyCode == right)
            xa = 2;
        else if (keyCode ==left)
            xa = -2;
            
    }
    
    /**
     * Released A Key
     * @param keyCode 
     */
    public void released (int keyCode){
//        if (keyCode == up || keyCode == down)
//            ya = 0;
    }
    
    /**
     * Gets the Bounds for the Player
     * @return 
     */
    public Rectangle getBounds(){
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
    
    /**
     * Paint Function
     * @param g 
     */
    public void paint(Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}