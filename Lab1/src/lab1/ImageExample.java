/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import javax.swing.JFrame;
import java.awt.*;
/**
 *
 * @author User
 */
public class ImageExample extends Canvas {
    @Override
    public void paint(Graphics g){
       
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image img = tool.getImage(this.getClass().getResource("p3.gif"));
        g.drawImage(img, 50, 60, this);
    }
    
    public static void main(String[] args) {
       ImageExample mm= new ImageExample();
        JFrame frame =new JFrame("image display");
        frame.add(mm);
        frame.setSize(400, 400);        
        frame.setVisible(true);
        
    }
}
