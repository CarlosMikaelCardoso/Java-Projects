package Estudos;
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Valor de x?"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Valor de y?"));
        y = x + y;
        JOptionPane.showMessageDialog(null, y);
        double a = Double.parseDouble(JOptionPane.showInputDialog("What's Your Height?"));
        JOptionPane.showMessageDialog(null, a);
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, name);
    }
}