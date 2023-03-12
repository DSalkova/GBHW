package HW8;

import HW8.components.DigitJButton;
import HW8.components.OperatorJButton;
import HW8.listeners.BtnListener;
import HW8.listeners.ClearFieldBtnListener;
import HW8.listeners.ResultBtnListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AppForm extends JFrame {

    private JTextField inputField;

    public AppForm(String title) {
        super(title);
        setBounds(1170, 110, 250, 370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);
        setJMenuBar(createMenu());

        add(createCenterPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener btnListener = new BtnListener(inputField);

        centerPanel.add(createDigitsPanel(btnListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(btnListener), BorderLayout.EAST);

        return centerPanel;
    }

    private JPanel createOperatorsPanel(ActionListener btnListener) {
        JPanel operators = new JPanel();
        operators.setLayout(new GridLayout(4, 1));

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(btnListener);
        operators.add(plus);
        JButton minus = new OperatorJButton("-");
        minus.addActionListener(btnListener);
        operators.add(minus);
        JButton multiply = new OperatorJButton("*");
        multiply.addActionListener(btnListener);
        operators.add(multiply);
        JButton divide = new OperatorJButton("/");
        divide.addActionListener(btnListener);
        operators.add(divide);

        return operators;
    }

    private JPanel createDigitsPanel(ActionListener btnListener) {
        JPanel digits = new JPanel();

        digits.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
            btn.addActionListener(btnListener);
            digits.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        calc.addActionListener(new ResultBtnListener(inputField));
        digits.add(calc);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFieldBtnListener(inputField));
        digits.add(clear);

        return digits;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        inputField.setFont(new Font("Calibre", Font.BOLD, 25));
        inputField.setMargin(new Insets(8, 0, 8, 0));
        inputField.setBackground(new Color(128, 128, 128));

        //inputField.setText("Hello, World! 3 6 9");

        return top;
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldBtnListener(inputField));
        menuFile.add(clear);

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        menuFile.add(exit);

        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("Edit"));
        menuBar.add(new JMenuItem("View"));
        menuBar.add(new JMenuItem("Help"));
        /*JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");
        JMenu menuHelp = new JMenu("Help");*/

        return menuBar;
    }
}
