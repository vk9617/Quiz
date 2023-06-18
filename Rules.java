/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_appicaion;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author admin
 */
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        
        JLabel text=new JLabel("Welcome "+name+" Quiz Time");
        text.setBounds(50,20,700,45);
        text.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        text.setForeground(new Color(30,144,254));
        add(text);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        rules.setForeground(new Color(30,144,254));
        rules.setText("<html>"+"Tetris. Tetris is a surprising game. On paper, at least, it seems unlikely that something so basic should have done so" +"<br><br>"+
"Goals. The aim in Tetris is simple; you bring down blocks from the top of the screen. You can move the blocks around" +"<br><br>"+
"Rules. Tetris has very simple rules: you can only move the pieces in specific ways; your game is over if your pieces." +"<br><br>"+
"Feedback. Each time you clear a line in Tetris, you are awarded more points."+"<html>");
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.blue);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.red);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(300,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        } else if(ae.getSource() == back){
            setVisible(false);
            new Login();
    }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
    
}
