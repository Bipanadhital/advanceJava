/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class StudentDisplay {
    
    JTable table = new JTable();
    JFrame frame ;
    
    String[] columns={"name","email","address"};
    public void ShowStudents(){
        frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","mysql");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from student");  
            while(rs.next()){
             String name = rs.getString("name");
             String email = rs.getString("email");
             String address = rs.getString("address");
             model.addRow(new Object[]{name,email,address});
        }  
        con.close();         
}
catch(Exception e){ 
    System.out.println(e);
}
  frame.add(table);
  frame.setSize(400,300);
  frame.setVisible(true);
 }
    
    public static void main(String[] args){
    StudentDisplay sd = new StudentDisplay();
    sd.ShowStudents();
}
}
