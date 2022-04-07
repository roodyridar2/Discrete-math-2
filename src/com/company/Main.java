package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] options= {"OR gate", "AND gate", "Reverse gate", "Exit"};
        ImageIcon image = new ImageIcon("decision.png");
        boolean flag = true;

        while(flag) {
            String option = (String) JOptionPane.showInputDialog(null,"Choose logic gate please!",
                    "Discrete Math",1,image,options,options[0]);

            if(option.equals("OR gate")){
                OrGate();

            }
            else if(option.equals("AND gate")){
                AndGate();

            }else if(option.equals("Reverse gate")){
                Reverse();

            }else if(option.equals("Exit")){
                flag = false;
            }

        }


    }
    public static void OrGate(){
        JTextField condition1 = new JTextField(5);
        JTextField condition2 = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("First:"));
        myPanel.add(condition1);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Second:"));
        myPanel.add(condition2);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter True and False Values", JOptionPane.OK_CANCEL_OPTION);

        String con1 = condition1.getText();
        String con2 = condition2.getText();

        boolean one = Boolean.parseBoolean(con1);
        boolean two = Boolean.parseBoolean(con2);

        if(one || two){
            final ImageIcon icon = new ImageIcon("light-bulb128.png");
            JOptionPane.showMessageDialog(null, "TRUE", "OR Gate", JOptionPane.INFORMATION_MESSAGE, icon);

        }else {
            final ImageIcon icon = new ImageIcon("light-bulb-off-128.png");
            JOptionPane.showMessageDialog(null, "FALSE", "OR Gate", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    public static void AndGate(){
        JTextField condition1 = new JTextField(5);
        JTextField condition2 = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("First:"));
        myPanel.add(condition1);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Second:"));
        myPanel.add(condition2);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter True and False Values", JOptionPane.OK_CANCEL_OPTION);

        String con1 = condition1.getText();
        String con2 = condition2.getText();
        boolean one = Boolean.parseBoolean(con1);
        boolean two = Boolean.parseBoolean(con2);

        if(one && two){
            final ImageIcon icon = new ImageIcon("light-bulb128.png");
            JOptionPane.showMessageDialog(null, "TRUE", "OR Gate", JOptionPane.INFORMATION_MESSAGE, icon);
        }else{
            final ImageIcon icon = new ImageIcon("light-bulb-off-128.png");
            JOptionPane.showMessageDialog(null, "FALSE", "AND Gate", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    public static void Reverse(){
        JTextField condition = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Condition: "));
        myPanel.add(condition);
        myPanel.add(Box.createHorizontalStrut(75));

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter True and False Values", JOptionPane.OK_CANCEL_OPTION);

        String con = condition.getText();
        boolean state = Boolean.parseBoolean(con);


        if(state){
            final ImageIcon icon = new ImageIcon("light-bulb-off-128.png");
            JOptionPane.showMessageDialog(null, "FALSE", "OR Gate", JOptionPane.INFORMATION_MESSAGE, icon);
        }else{
            final ImageIcon icon = new ImageIcon("light-bulb128.png");
            JOptionPane.showMessageDialog(null, "TRUE", "Reverse Gate", JOptionPane.INFORMATION_MESSAGE, icon);
        }

    }
}