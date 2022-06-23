/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author User
 */
public class loginForm implements ActionListener {
    JTextField text_user,text_password; 
    JFrame frame;
    public void CreateLogin(){
     frame = new JFrame("Swing Lab");
    
    Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
    JLabel label_Title = new JLabel("User Info");
    label_Title.setFont(font);
    label_Title.setForeground(Color.red);
    label_Title.setBounds(50, 10, 200, 50);    
    frame.add(label_Title);
    
    JLabel label_user = new JLabel("Username");    
    label_user.setBounds(50, 150, 100, 50);
    frame.add(label_user);
    text_user = new JTextField();
    text_user.setBounds(200, 150, 100, 50);
    frame.add(text_user);
    
    JLabel label_password = new JLabel("Password");
    label_password.setBounds(50, 300, 100, 50);
    frame.add(label_password);
    
    text_password = new JTextField();
    text_password.setBounds(200, 300, 100, 50);
    frame.add(text_password);
    
    JButton button_Login = new JButton("Login");
    button_Login.setBounds(200, 370, 100, 50);
    button_Login.addActionListener(this);
    frame.add(button_Login);
    
    frame.setSize(500, 500);
    frame.setLayout(null);
    frame.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String user=  text_user.getText();
     String password =text_password.getText();
     if (user.equals("admin") && password.equals("admin")){
       JDialog d= new JDialog(frame, "login successfull", true);
       d.setLocationRelativeTo(d);
       d.setSize(100, 100);
       d.setVisible(true);
     } else {
        JDialog d= new JDialog(frame, "login invalid", true);
       d.setLocationRelativeTo(d);
       d.setSize(100, 100);
       d.setVisible(true); 
     }
    }

}
