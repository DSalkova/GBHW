package HW8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultBtnListener implements ActionListener {
    private JTextField inputField;

    public ResultBtnListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double a;
        double b;
        double result = 0;
        JButton btn = (JButton) e.getSource();
        String str = inputField.getText() + " " + btn.getText();
            if (str.contains("-")) {
                a = Double.parseDouble(str.substring(0, str.indexOf("-") - 1));
                b = Double.parseDouble(str.substring(str.indexOf("-") + 2, str.length() - 1));
                result = a - b;
            } else if (str.contains("+")) {
                a = Double.parseDouble(str.substring(0, str.indexOf("+") - 1));
                b = Double.parseDouble(str.substring(str.indexOf("+") + 2, str.length() - 1));
                result = a + b;
            } else if (str.contains("*")) {
                a = Double.parseDouble(str.substring(0, str.indexOf("*") - 1));
                b = Double.parseDouble(str.substring(str.indexOf("*") + 2, str.length() - 1));
                result = a * b;
            } else if (str.contains("/")) {
                a = Double.parseDouble(str.substring(0, str.indexOf("/") - 1));
                b = Double.parseDouble(str.substring(str.indexOf("/") + 2, str.length() - 1));
                if (b == 0) result = 0;
                else result = a / b;
            }
        inputField.setText(Double.toString(result));
    }
}
