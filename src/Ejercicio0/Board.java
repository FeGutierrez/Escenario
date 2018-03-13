/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{
    
    private int xRef=200;
    private int yRef=0;
    private Timer timer;
            
    public Board() {
       this.timer = new Timer(30, this);
       this.timer.start();
    }

    public int getxRef() {
        return xRef;
    }

    

    public void setxRef(int xRef) {
        this.xRef = xRef;
    }

    public int getyRef() {
        return yRef;
    }

    public void setyRef(int yRef) {
        this.yRef = yRef;
    }
    
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //dibujarEscenario(g);
        
        
        Polygon poligono = new Polygon();
        poligono.addPoint(xRef + 60,yRef+100);
        poligono.addPoint(xRef + 100,yRef+100);
        poligono.addPoint(xRef + 130,yRef+60);
        poligono.addPoint(xRef + 200,yRef+60);
        poligono.addPoint(xRef + 230,yRef+100);
        poligono.addPoint(xRef + 270,yRef+100);
        poligono.addPoint(xRef + 270,yRef+140);
        poligono.addPoint(xRef + 60,yRef+140);
        poligono.addPoint(xRef + 60,yRef+100);
        
        g.fillOval(xRef+90, yRef+120, 40, 40);
        
        g.fillOval(xRef+200, yRef+120, 40, 40);        
        //poligono.addPoint(xRef + 60,yRef+60);
        //poligono.addPoint(xRef + 60,yRef+100);
        //
        //poligono.addPoint(xRef + 200,yRef+100);
        //poligono.addPoint(xRef + 20,yRef+50);
        //poligono.addPoint(xRef + 20,yRef+50);
        g.drawPolygon(poligono);
        g.fillPolygon(poligono);
        
        g.drawRect(xRef+55, yRef+95, 220, 50);
        g.drawRect(xRef+99, yRef+55, 135, 45);
        g.drawRect(xRef+87, yRef+118, 45, 45);
        g.drawRect(xRef+197, yRef+118, 45, 45);
        
//        Polygon poligono2 = new Polygon();
//        poligono2
//        poligono.addPoint(xRef + 55,yRef+55);
//        poligono.addPoint(xRef + 275,yRef+95);
//        poligono.addPoint(xRef + 275,yRef+145);
//        poligono.addPoint(xRef + 55,yRef+145);
//        poligono.addPoint(xRef + 55,yRef+55);
//        g.drawPolygon(poligono2);
        
        
        
        
        
    }
//
//    private void dibujarEscenario(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(Color.RED);
//        //the first two parameters are the position (x,y) and after comes the width and the height
//        g2d.fillOval(0, 0, 30, 30);
//        g2d.drawOval(0, 50, 30, 30);
//               
//        g2d.fillRect(50, 0, 30, 30); 
//        g2d.drawRect(50, 50, 30, 30);
//        
//        g2d.drawString("Puntaje del Juego", 100, 100);
//        
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xRef++;
        repaint();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}