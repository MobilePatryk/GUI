import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFactory implements ActionListener {

    private JPanel panel;

    public ButtonFactory(JPanel panel){
        this.panel = panel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            JButton buttonSecond = new JButton();
            panel.add(buttonSecond);
            buttonSecond.addActionListener(new ButtonFactory(panel));
            panel.repaint();
        }
}
