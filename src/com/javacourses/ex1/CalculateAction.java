package com.javacourses.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Oleg on 01.02.14.
 */
public class CalculateAction implements ActionListener {
    JTextField tf1;
    JTextField tf2;
    JTextField res;

    public CalculateAction(JTextField tf1, JTextField tf2, JTextField res) {
        this.tf1 = tf1;
        this.tf2 = tf2;
        this.res = res;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double v1=Double.parseDouble(tf1.getText());
        double v2=Double.parseDouble(tf2.getText());
        double result=v1+v2;
        res.setText(""+result);
    }
}
