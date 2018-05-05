import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        /*
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
        JButton oFile = new JButton();
        JPanel panel = new JPanel();
        JLabel lMage = new JLabel();
        oFile.setText("Otwórz plik");
        final String[] lab = new String[1];
        oFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    lab[0] = selectedFile.getName();
                    System.out.println(lab[0]);
                    ImageIcon iMage = new ImageIcon(lab[0]);
                    lMage.setIcon(iMage);
                    mainFrame.pack();
                    //panel.revalidate();
                    //panel.repaint();

                }
            }
        });
        panel.add(oFile);
        panel.add(lMage);


        */
        JFrame mainFrame = new JFrame ();
        JPanel panel = new JPanel();

        String[] colorList = {"Zielony","Niebieski", "Czerwony"};

        JComboBox<String> comboBox = new JComboBox<>(colorList);
        comboBox.setSelectedIndex(-1);
        comboBox.addActionListener(e->{
            if((String)comboBox.getSelectedItem() == "Zielony"){
                panel.setBackground(Color.GREEN);
            }
            else if((String)comboBox.getSelectedItem() == "Czerwony"){
                panel.setBackground(Color.red);
            }
            else {
                panel.setBackground(Color.blue);
            }
        });
        panel.add(comboBox);
        mainFrame.setContentPane(panel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
