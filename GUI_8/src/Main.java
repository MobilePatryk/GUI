import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        CustomTableModel t = new CustomTableModel(5,5);
        JTable table = new JTable(t);
        table.setEnabled(false);

        JPanel panel = new JPanel(new BorderLayout());
        //panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
        panel.add(table,BorderLayout.CENTER);

        JTextField txt = new JTextField(5);
        JTextField txt1 = new JTextField(5);

        JButton b = new JButton("OK");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String y = txt.getText();
                String x = txt1.getText();

                t.setColumn(Integer.valueOf(y));
                t.setRow(Integer.valueOf(x));mv

            }
        });
        //b.setSize(10,10);
        JPanel nPanel = new JPanel();
        nPanel.add(txt);
        nPanel.add(txt1);
        nPanel.add(b);

        panel.add(nPanel,BorderLayout.PAGE_START);


        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
