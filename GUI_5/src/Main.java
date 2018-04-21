import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("      ");
        JTextField text = new JTextField(25);
        JButton button = new JButton();

        panel.add(button);


        ButtonFactory bu = new ButtonFactory(panel);
        bu.actionPerformed();

        JFrame mainFrame = new JFrame () ;
            mainFrame.setContentPane(panel);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
            mainFrame.setVisible(true);
        }
    }
