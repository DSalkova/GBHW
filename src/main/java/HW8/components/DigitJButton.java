package HW8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJButton extends JButton {
    public DigitJButton(String text) {
        super(text);
        setFont(new Font("Calibre", Font.BOLD, 25));
        setBackground(new Color(255, 192, 203));
    }
}
