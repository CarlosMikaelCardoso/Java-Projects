package Estudos.GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class GUI_labels {

    public static void main(String[] args) {
        // Certifique-se de que o caminho da imagem está correto
        ImageIcon image = new ImageIcon("C:\\Users\\Administrator\\Documents\\Codes\\Java\\Estudos\\GUI\\confia.png");
        Border border = BorderFactory.createLineBorder(Color.green);
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(67,48,99));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setResizable(true);
        frame.add(label);
        frame.setVisible(true); // Torna o frame visível após adicionar o label
        frame.pack();
    }
}
