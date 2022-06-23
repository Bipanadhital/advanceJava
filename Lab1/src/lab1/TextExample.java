/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class TextExample extends Canvas {
   
    public void paint(Graphics g){
        
        g.drawString("This is BCA 6th online class", 200, 150);
    }
    public static void  main(String[] args){
      TextExample te = new TextExample();
      JFrame frame = new JFrame();
      Font font = new Font(Font.SANS_SERIF,Font.BOLD,20);
     
      frame.add(te);      
      frame.setSize(400, 400);
       frame.setFont(font);
      frame.setBackground(Color.green);
      //frame.setLayout(null);
      frame.setVisible(true);
      
    }
}
