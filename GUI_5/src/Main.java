import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Main {

    public static void main(String[] args) {
            JButton button = new JButton("Red");
            JPanel panel = new JPanel();
            panel.add(button );
            button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.BLUE);
            }});
            button.addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    panel.setBackground(Color.RED);
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                    panel.setBackground(Color.GREEN);
                }
            });

            JFrame mainFrame = new JFrame () ;
            mainFrame.setContentPane(panel);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
            mainFrame.setVisible(true);
        }
    }
