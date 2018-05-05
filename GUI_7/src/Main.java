import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("      ");
        JTextField text = new JTextField(25);
        JButton flower = new JButton();
        JButton tree = new JButton();
        JButton mush = new JButton();
        mush.setText("Grzyb");
        tree.setText("Drzewo");
        flower.setText("Kwiat");
        panel.add(flower);
        panel.add(tree);
        panel.add(mush);

        ImageIcon iTree = new ImageIcon("drzewo.jpg");
        ImageIcon iFlower = new ImageIcon("kwiat.jpeg");
        ImageIcon iMush = new ImageIcon("grzyb.jpg");

        JLabel lTree = new JLabel();
        lTree.setIcon(iTree);

        JLabel lMush = new JLabel();
        lMush.setIcon(iMush);

        JLabel lFlower = new JLabel();
        lFlower.setIcon(iFlower);

        flower.addActionListener(e -> {
                    panel.add(lFlower);
                    panel.revalidate();
                    panel.repaint();
                }
        );
        //Mozna byloby podmieniac ikone w label'u i byloby prosciej.

        JFrame mainFrame = new JFrame () ;
        mainFrame.setContentPane(panel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
