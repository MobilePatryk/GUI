import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFactory implements ActionListener {

    private JPanel panel;
    private JFrame frame;

    public ButtonFactory(JPanel panel, JFrame frame){
        this.panel = panel;
        this.frame = frame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            JButton buttonSecond = new JButton();
            panel.add(buttonSecond);
            buttonSecond.addActionListener(new ButtonFactory(panel,frame));
            frame.setVisible(false);
            frame.setVisible(true);
        }
}
