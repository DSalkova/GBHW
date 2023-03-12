package HW8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFieldBtnListener implements ActionListener {
    private JTextField inputField;

    public ClearFieldBtnListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inputField.setText("");
    }
}
