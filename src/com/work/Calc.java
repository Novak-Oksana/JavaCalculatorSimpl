package com.work;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Calc extends JDialog {
    private JPanel contentPane;
    private JTextField axtx;
    private JTextField bxtx;
    private JTextField op;
    private JTextField resxtx;
    private JButton btncalc;
    private Calculator calc = new Calculator();

    public Calc() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btncalc);

        btncalc.addActionListener(this::actionPerformedCalc);


    }

    public static void main(String[] args) {
        Calc dialog = new Calc();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void actionPerformedCalc(ActionEvent e) {
         int a= Integer.parseInt(axtx.getText());
         int b= Integer.parseInt(bxtx.getText());
        char op = this.op.getText().charAt(0);
        int res = calc.funct_calc(a, b, op);
        resxtx.setText("" + res);
            }
}
