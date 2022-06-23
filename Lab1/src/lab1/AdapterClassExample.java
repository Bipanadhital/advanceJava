/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class AdapterClassExample extends MouseAdapter {
    JFrame frame;
    //JFrame f = new JFrame();
    public AdapterClassExample(){
        frame = new JFrame("Adapter example");
        frame.addMouseListener(this);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);           
        
    }
    public void mouseClicked(MouseEvent e){
         Graphics g =frame.getGraphics();
         g.setColor(Color.red);
         g.fillRect(50, 50, 150, 150);
         
    }
    public static void main(String[] args) {
        new AdapterClassExample();
    }
}
