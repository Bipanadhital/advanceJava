/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class ActionEventAnonymous {
  
   
   public void CreateUI() {
      JFrame frame = new JFrame("Action Event");      
      JButton button = new JButton();
      button.setText("Click me");      
      button.setBounds(50, 50, 100, 50);
      
      JLabel label = new JLabel("hello");
      label.setBounds(50, 120, 100, 50);
      frame.add(label);
      
      button.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
             label.setText("hi");
          }
      });
      frame.add(button);      
      frame.setSize(500,500);
      frame.setLayout(null);
      frame.setVisible(true);
   }
   
}
