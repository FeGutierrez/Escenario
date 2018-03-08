/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author Estudiante
 */
public class Ejecicio00 {
    class NewPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawLine(0, 0, 50, 50);
            g.drawString("Banner", 0, 40);
        }
    }
}
