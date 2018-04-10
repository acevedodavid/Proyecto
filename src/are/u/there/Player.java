/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package are.u.there;

import java.awt.Graphics;

/**
 *
 * @author antoniomejorado
 */
public class Player extends Item{

    private int direction;
    private int width;
    private int height;
    private Game game;
    
    public Player(int x, int y, int direction, int width, int height, Game game) {
        super(x, y);
        this.direction = direction;
        this.width = width;
        this.height = height;
        this.game = game;
    }

    public int getDirection() {
        return direction;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void tick() {
        // moving player depending on flags
        if (game.getKeyManager().up) {
            if(game.getKeyManager().x) {
                setY(getY() - 10);
            } else {
                setY(getY() - 5);
            }
        }
        if (game.getKeyManager().down) {
           if(game.getKeyManager().x) {
                setY(getY() + 10);
            } else {
                setY(getY() + 5);
            }
        }
        if (game.getKeyManager().left) {
            if(game.getKeyManager().x) {
                setX(getX() - 10);
            } else {
                setX(getX() - 5);
            }
        }
        if (game.getKeyManager().right) {
            if(game.getKeyManager().x) {
                setX(getX() + 10);
            } else {
                setX(getX() + 5);
            }
        }
        // reset x position and y position if colision
        if (getX() + 60 >= game.getWidth()) {
            setX(game.getWidth() - 60);
        }
        else if (getX() <= -30) {
            setX(-30);
        }
        if (getY() + 80 >= game.getHeight()) {
            setY(game.getHeight() - 80);
        }
        else if (getY() <= -20) {
            setY(-20);
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, getX(), getY(), getWidth(), getHeight(), null);
    }
}