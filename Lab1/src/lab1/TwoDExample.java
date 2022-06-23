/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author User
 */
public class TwoDExample extends JComponent {
  
    public void paint(Graphics g){
       g.setColor(Color.red);
       Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
       g.setFont(font);
       //g.drawLine(50, 50, 350, 350);
       
       g.fillRect(0, 50, 60, 150);
       
       
    }
    
    public static void main(String[] args){        
        TwoDExample t = new TwoDExample();
        JFrame frame = new JFrame("Custom component");
        
        frame.add(t);        
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);        
    }
}
