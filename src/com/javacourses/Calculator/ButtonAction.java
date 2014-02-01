package com.javacourses.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Oleg on 01.02.14.
 */
public class ButtonAction implements ActionListener {
    JTextField tf1;
    JTextField tf2;
    JButton jb;
    ValuesCalculations vc;

    public ButtonAction(JTextField tf1, JTextField tf2, ValuesCalculations vc) {
        this.tf1=tf1;
        this.tf2=tf2;
        this.vc=vc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=((JButton)e.getSource()).getText();
        switch(s) {
            case ("1"):
                tf1.setText(tf1.getText()+"1");
                tf2.setText(tf2.getText()+"1");
                break;
            case ("2"):
                tf1.setText(tf1.getText()+"2");
                tf2.setText(tf2.getText()+"2");
                break;
            case ("3"):
                tf1.setText(tf1.getText()+"3");
                tf2.setText(tf2.getText()+"3");
                break;
            case ("4"):
                tf1.setText(tf1.getText()+"4");
                tf2.setText(tf2.getText()+"4");
                break;
            case ("5"):
                tf1.setText(tf1.getText()+"5");
                tf2.setText(tf2.getText()+"5");
                break;
            case ("6"):
                tf1.setText(tf1.getText()+"6");
                tf2.setText(tf2.getText()+"6");
                break;
            case ("7"):
                tf1.setText(tf1.getText()+"7");
                tf2.setText(tf2.getText()+"7");
                break;
            case ("8"):
                tf1.setText(tf1.getText()+"8");
                tf2.setText(tf2.getText()+"8");
                break;
            case ("9"):
                tf1.setText(tf1.getText()+"9");
                tf2.setText(tf2.getText()+"9");
                break;
            case ("0"):
                tf1.setText(tf1.getText()+"0");
                tf2.setText(tf2.getText()+"0");
                break;
            case ("+"):
                tf1.setText(tf1.getText()+" + ");
                if (!(tf2.getText().isEmpty())) {
                    vc.sVal1=tf2.getText();
                    tf2.setText("");
                }

                break;
            case ("="):
                tf1.setText(tf1.getText()+" = ");
                if (!(tf2.getText().isEmpty())) {
                    vc.sVal2=tf2.getText();
                    tf2.setText("");
                    double result=vc.plus();
                    tf1.setText(tf1.getText()+result);
                    vc.sVal1=""+result;
                }
                break;
        }
    }


}
