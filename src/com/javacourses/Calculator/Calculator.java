package com.javacourses.Calculator;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Oleg on 01.02.14.
 */
public class Calculator extends JApplet {
    public static void main(String[] args) {
        ValuesCalculations vc=new ValuesCalculations();
        JFrame frame=new JFrame("Calculator");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp1=new JPanel();
        jp1.setLayout(new GridLayout(3,1));

        JPanel jpFields=new JPanel();
        jpFields.setLayout(new GridLayout(2,1));

        JPanel jp2=new JPanel();
        jp2.setLayout(new GridLayout(2,3));

        JPanel jp3=new JPanel();
        jp3.setLayout(new GridLayout(2,3));

        JTextField tf1=new JTextField(10);
        jpFields.add(tf1);
        JTextField tf2=new JTextField(10);
        jpFields.add(tf2);
        tf1.setEditable(false);
        tf2.setEditable(false);
        jp1.add(jpFields);
        jp1.add(jp2);
        jp1.add(jp3);

        ButtonAction ba=new ButtonAction(tf1,tf2,vc);
        JButton b1=new JButton("1");
        b1.addActionListener(ba);
        jp2.add(b1);
        JButton b2=new JButton("2");
        b2.addActionListener(ba);
        jp2.add(b2);
        JButton b3=new JButton("3");
        b3.addActionListener(ba);
        jp2.add(b3);
        JButton b4=new JButton("4");
        b4.addActionListener(ba);
        jp2.add(b4);
        JButton b5=new JButton("5");
        b5.addActionListener(ba);
        jp2.add(b5);
        JButton b6=new JButton("6");
        b6.addActionListener(ba);
        jp2.add(b6);
        JButton b7=new JButton("7");
        b7.addActionListener(ba);
        jp3.add(b7);
        JButton b8=new JButton("8");
        b8.addActionListener(ba);
        jp3.add(b8);
        JButton b9=new JButton("9");
        b9.addActionListener(ba);
        jp3.add(b9);
        JButton b0=new JButton("0");
        b0.addActionListener(ba);
        jp3.add(b0);
        JButton bp=new JButton("+");
        bp.addActionListener(ba);
        jp3.add(bp);
        JButton be=new JButton("=");
        be.addActionListener(ba);
        jp3.add(be);

        frame.setContentPane(jp1);

        frame.setVisible(true);
    }
}
