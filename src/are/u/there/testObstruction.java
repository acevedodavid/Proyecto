/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package are.u.there;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

/**
 *
 * @author davidacevedo
 */
public class testObstruction extends Item {

    public testObstruction(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void tick() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void render(Graphics g) {
        Math.random();
        g.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
        g.fillRect(this.x, this.y, this.getWidth(), this.getHeight());
    }
    
}
