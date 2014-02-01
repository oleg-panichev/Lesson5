package com.javacourses.ex1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Oleg on 01.02.14.
 */
public class HelloSwing extends JFrame {
    public HelloSwing() {
        setSize(200,300);
        setTitle("Hello Swing");

        JButton btn=new JButton("Ok button");
        btn.setSize(100,100);
        add(btn);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        HelloSwing helloSwing=new HelloSwing();

        JPanel windowContent=new JPanel();

        //FlowLayout fl=new FlowLayout();
        GridLayout fl=new GridLayout(4,2);
        windowContent.setLayout(fl);

        JLabel label1=new JLabel("Number 1");
        JTextField field1=new JTextField(10);

        JLabel label2=new JLabel("Number 2");
        JTextField field2=new JTextField(10);

        JLabel label3=new JLabel("Sum");
        JTextField result=new JTextField(10);
        JButton addBtn=new JButton("Add");

        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(addBtn);

        JFrame frame=new JFrame("My FIrst Calculator");
        frame.setContentPane(windowContent);
        frame.setSize(400,100);
        frame.setVisible(true);
    }
}
