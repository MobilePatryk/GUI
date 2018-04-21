import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Main {

    public static void main(String[] args) {
            JButton button = new JButton("Red");
            JButton buttonD = new JButton("Blue");
            JButton buttonT = new JButton("Green");
            JTextField text = new JTextField("Not set yet");
            JPanel panel = new JPanel();
            panel.add(text);
            panel.add(button);
            panel.add(buttonD);
            panel.add(buttonT);
            button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.RED);
                text.setText("Red");
            }});
            buttonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.BLUE);
                text.setText("Blue");
            }});
            buttonT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.GREEN);
                text.setText("Green");
            }});


            JFrame mainFrame = new JFrame () ;
            mainFrame.setContentPane(panel);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
            mainFrame.setVisible(true);
        }
    }
