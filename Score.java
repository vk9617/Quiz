/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_appicaion;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author admin
 */
public class Score extends JFrame implements ActionListener{

    Score(String name, int score) {
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/QuizImage.jpg"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(0, 200, 300, 250);
        
        JLabel heading=new JLabel("Thakyou"+name+" Playing this game");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(heading);
        
        JLabel lblscore=new JLabel("Your score is "+score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma",Font.ITALIC,28));
        add(lblscore);
        
        JButton submit=new JButton("Play again");
        submit.setBounds(400, 270, 120, 30);
        submit.setFont(new Font("Tahoma",Font.ITALIC,24));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("user",0);
    }
    
}
