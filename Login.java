/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_appicaion;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author admin
 */
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
       
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/LoginIcons.png"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(0, 0, 100, 50);
        
        JLabel text=new JLabel(" Quiz Time");
        text.setBounds(450, 60, 300, 45);
        text.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        text.setForeground(new Color(30,144,254));
        add(text);
        
        JLabel name=new JLabel(" Enter your name");
        name.setBounds(550, 150, 300, 20);
        name.setFont(new Font("Viner Hand ITC",Font.BOLD,10));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(450, 200, 300, 30);
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(450, 270, 120, 30);
        rules.setBackground(Color.red);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(620, 270, 120, 30);
        back.setBackground(Color.blue);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(800,400);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name=tfname.getText();
           setVisible(false);
           new Rules(name);
        } else if(ae.getSource() == back){
            setVisible(false);
    }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
