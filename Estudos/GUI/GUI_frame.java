package Estudos.GUI;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GUI_frame extends JFrame{
    GUI_frame(){
        this.setTitle("Jframe Title");  //creates a title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of application
        this.setResizable(false);  //prevents frame from being resize
        this.setSize(420,420);  //defines the size of frame
        this.setVisible(true);  //make the frame visible

        ImageIcon image = new ImageIcon("confia.png");  //create an ImageIcon
        this.setIconImage(image.getImage());  //change icon of image


        this.getContentPane().setBackground(new Color(67,48,99));
    }
}
