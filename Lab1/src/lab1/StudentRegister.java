/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class StudentRegister implements ActionListener {
  JTextField text_name,text_email,text_address; 
    JFrame frame;
    public static void main(String[] args){
        StudentRegister sr = new StudentRegister();
        sr.RegisterLogin();
    }
    
    public void RegisterLogin(){
     frame = new JFrame("Swing Lab");
     
    Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
    JLabel label_Title = new JLabel("User Info");
    label_Title.setFont(font);
    label_Title.setForeground(Color.red);
    label_Title.setBounds(50, 10, 200, 50);    
    frame.add(label_Title);
    
    JLabel label_user = new JLabel("Name");    
    label_user.setBounds(50, 150, 100, 50);
    frame.add(label_user);
    text_name = new JTextField();
    text_name.setBounds(200, 150, 100, 50);
    frame.add(text_name);
    
    JLabel label_password = new JLabel("email");
    label_password.setBounds(50, 300, 100, 50);
    frame.add(label_password);
    
    text_email = new JTextField();
    text_email.setBounds(200, 300, 100, 50);
    frame.add(text_email);
    
    JLabel label_address = new JLabel("address");
    label_address.setBounds(50, 350, 100, 50);
    frame.add(label_address);
    
    text_address = new JTextField();
    text_address.setBounds(200, 350, 100, 50);
    frame.add(text_address);
    
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
     String name=  text_name.getText();
     String email =text_email.getText();
     String address =text_address.getText();
     try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","mysql");  
    //here advance_java is database name, root is username and mysql is password  
    Statement stmt=con.createStatement();  
    stmt.executeUpdate("Insert into student values('"+name+"','"+email+"','"+address+"')");  
  
//System.out.println(rs.getString(1)+"  "+rs.getString(2));  
con.close();  
}
catch(Exception ex){ System.out.println(ex);}  
       
    } 
}
