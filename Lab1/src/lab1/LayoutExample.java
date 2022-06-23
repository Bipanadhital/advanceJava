/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author User
 */
public class LayoutExample {
   
   public static void main(String[] args) {
        // TODO code application logic here
        LayoutExample layout = new LayoutExample();
        layout.CreateGridLayout();
      
    }
   public void CreateBorderLayout(){
     JLabel lablel = new JLabel("label1");
       lablel.setBounds(10, 10, 100, 50);
       JLabel lablel2 = new JLabel("label2");
       lablel2.setBounds(10, 10, 100, 50);
       JLabel lablel3 = new JLabel("label3");
       lablel3.setBounds(100, 10, 100, 50);
       
       JFrame frame = new JFrame();
       frame.setLayout(new BorderLayout(20,20));
       frame.add(lablel,BorderLayout.SOUTH);
       frame.add(lablel2,BorderLayout.EAST);
       frame.add(lablel3,BorderLayout.CENTER);
       frame.setSize(300, 300);
       frame.setVisible(true);  
   }
   
   public void CreateGridLayout(){
       JFrame frame=new JFrame();
       frame.setLayout(new GridLayout(2,2,10,10));
       JButton button1=new JButton("btn1");
       JButton button2=new JButton("btn2");
       JButton button3=new JButton("btn3");
       JButton button4=new JButton("btn4");
       frame.add(button1);
       frame.add(button2);
       frame.add(button3);
       frame.add(button4);
       
       frame.setSize(400, 400);
       frame.setVisible(true);
   }
}
