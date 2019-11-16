/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.ja.serrafgabriel.shapes.view;

import fr.dauphine.ja.serrafgabriel.shapes.model.Circle;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class CircleDrawer implements Drawer {
    
    private Circle c;
    
    public CircleDrawer(Circle c){
        this.c = c;
    }
    
    @Override
    public void draw(Graphics g) {
        int radius = (int) c.getRadius();
        int x = c.getCenter().getX() - radius;
        int y = c.getCenter().getY() - radius;
        g.drawOval(x, y, radius*2 , radius*2);
        g.setColor(Color.red);
    }
    
}
