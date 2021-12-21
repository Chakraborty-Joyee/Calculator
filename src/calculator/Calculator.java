/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import  java.awt.event.*;

public class Calculator implements ActionListener{
    
    JFrame f;
    JPanel p1, p2, p3;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,o1,o2,o3,o4,o5,o6;
    
    double a = 0, b = 0, result = 0;
    char operator;
    
    Calculator ()
    {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setBounds(10, 10, 420, 56);
        p1.setBackground(Color.black);
       
        t = new JTextField(12);
        t.setBounds(5, 5, 40, 80);
        Font fon = new Font("BOLD", Font.BOLD, 30);
        t.setFont(fon);
        
        {
            p2 = new JPanel();
            p2.setBounds(10, 90, 310, 465);
            p2.setBackground(Color.black);
            
            b1 = new JButton("0");
            b1.setFont(fon);
            
            b2 = new JButton("1");
            b2.setFont(fon);
            
            b3 = new JButton("2");
            b3.setFont(fon);
            
            b4 = new JButton("3");
            b4.setFont(fon);
            
            b5 = new JButton("4");
            b5.setFont(fon);
            
            b6 = new JButton("5");
            b6.setFont(fon);
            
            b7 = new JButton("6");
            b7.setFont(fon);
            
            b8 = new JButton("7");
            b8.setFont(fon);
            
            b9 = new JButton("8");
            b9.setFont(fon);
            
            b10 = new JButton("9");
            b10.setFont(fon);
            
            b11 = new JButton(".");
            b11.setFont(fon);
            
            b12 = new JButton("00");
            b12.setFont(fon);
        }
        
        p3 = new JPanel();
        p3.setBounds(330, 90, 100, 465);
        p3.setBackground(Color.black);
        
        o1 = new JButton("+");
        o1.setFont(fon);
        
        o2 = new JButton("-");
        o2.setFont(fon);
        
        o3 = new JButton("%");
        o3.setFont(fon);
        
        o4 = new JButton("/");
        o4.setFont(fon);
        
        o5 = new JButton("*");
        o5.setFont(fon);
        
        o6 = new JButton("=");
        o6.setFont(fon);
        
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b10.addActionListener(this);
         b11.addActionListener(this);
         b12.addActionListener(this);
         
        o1.addActionListener(this);
        o2.addActionListener(this);
        o3.addActionListener(this);
        o4.addActionListener(this);
        o5.addActionListener(this);
        o6.addActionListener(this);
        
        
        f.add(p1);
        p1.add(t);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.setLayout(new GridLayout(4, 3, 20 , 20));
        f.add(p2);
        
        p3.add(o1);
        p3.add(o2);
        p3.add(o3);
        p3.add(o4);
        p3.add(o5);
        p3.add(o6);
        p3.setLayout(new GridLayout(6, 1, 10, 10));
        f.add(p3);
        
        f.setSize(450, 600);
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true); 
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("0"));
        if(e.getSource()==b2)
            t.setText(t.getText().concat("1"));
        if(e.getSource()==b3)
            t.setText(t.getText().concat("2"));
        if(e.getSource()==b4)
            t.setText(t.getText().concat("3"));
        if(e.getSource()==b5)
            t.setText(t.getText().concat("4"));
        if(e.getSource()==b6)
            t.setText(t.getText().concat("5"));
        if(e.getSource()==b7)
            t.setText(t.getText().concat("6"));
        if(e.getSource()==b8)
            t.setText(t.getText().concat("7"));
        if(e.getSource()==b9)
            t.setText(t.getText().concat("8"));
        if(e.getSource()==b10)
            t.setText(t.getText().concat("9"));
        if(e.getSource()==b11)
            t.setText(t.getText().concat("."));
        if(e.getSource()==b12)
            t.setText(t.getText().concat("00"));
        
        
        if(e.getSource() == o1)
        {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }
        if(e.getSource() == o2)
        {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }
        if(e.getSource() == o3)
        {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }
        if(e.getSource() == o4)
        {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        }
        if(e.getSource() == o5)
        {
            a = Double.parseDouble(t.getText());
            operator = 5;
            t.setText("");
        }
        if(e.getSource() == o6)
        {
            b=Double.parseDouble(t.getText());
            switch (operator) {
                case 1 -> result = a + b;
                case 2 -> result = a - b;
                case 3 -> result = a * b;
                case 4 -> result = a / b;
                case 5 -> result = a % b;
                default -> result = 0;
            }
            t.setText(""+result);
        }
    
        
        
    }

    
    public static void main(String[] args) {
       
        new Calculator();
       
    }

    
}
