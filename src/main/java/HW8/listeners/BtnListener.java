package HW8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener {
    private JTextField inputField;

    public BtnListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        inputField.setText(inputField.getText() + " " + btn.getText());
    }
}
