/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_appicaion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import static quiz_appicaion.Quiz.score;

/**
 *
 * @author admin
 */
public class Quiz extends JFrame implements ActionListener{
    String questions[][]=new String[10][5];
    String answer[][]=new String[10][2];
    String useranswer[][]=new String[10][1];
    String name;
    String start;
    JLabel qno,question;
    ButtonGroup optiongroup;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,lifeline,submit;
    public static int timer=15;
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
    Quiz(String name){
        this.name=name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/QuizImage.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(0, 0, 1440, 392);
        
        qno=new JLabel();
        qno.setBounds(130, 445, 900, 40);
        qno.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(qno);
        
        
        question=new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(question);
        
        questions[0][0]="Which of the following keywords is used to define a variable in Javascript?";
        questions[0][1]="Var";
        questions[0][2]="let";
        questions[0][3]="both 1 and 2";
        questions[0][4]="none";
        
        questions[1][0]="Javascript is an _______ language?";
        questions[1][1]="Object-Oriented";
        questions[1][2]="Object-Based";
        questions[1][3]="Procedural";
        questions[1][4]="None";
        
        questions[2][0]="Which of the following methods is used to access HTML elements using Javascript?";
        questions[2][1]="getElementByID()";
        questions[2][2]="getelementbyclassname()";
        questions[2][3]="both 1 and 2";
        questions[2][4]="None";
        
        questions[3][0]="Upon encountering empty statements, what does the Javascript Interpreter do?";
        questions[3][1]="throws an error";
        questions[3][2]="ignores the statement";
        questions[3][3]="gives a warning";
        questions[3][4]="None";
        
        questions[4][0]="Which of the following methods can be used to display data in some form using Javascript?";
        questions[4][1]="docment.write()";
        questions[4][2]="console.log()";
        questions[4][3]="window.alert()";
        questions[4][4]="all of above";
        
        questions[5][0]="How can a datatype be declared to be a constant type?";
        questions[5][1]="const";
        questions[5][2]="var";
        questions[5][3]="let";
        questions[5][4]="constant";
        
        questions[6][0]="What will be the output of the following JavaScript code snippet?\n" +
"\n" +
"<p id=\"demo\"></p>\n" +
"var txt1 = \"Sanfoundry_\";\n" +
"var txt2 = \"Javascriptmcq\";\n" +
"document.getElementById(\"demo\").innerHTML = txt1 + txt2;";
        questions[6][1]="error";
        questions[6][2]="Sanfoundry_ Javascriptmcq";
        questions[6][3]="undefined";
        questions[6][4]="Sanfoundry_Javascriptmcq";
        
        questions[7][0]="Which of the following is not javascript data types?";
        questions[7][1]="Null type";
        questions[7][2]="Undefined type";
        questions[7][3]="Number type";
        questions[7][4]="All of the mentioned";
        
        questions[8][0]="Where is Client-side JavaScript code is embedded within HTML documents?";
        questions[8][1]="A URL that uses the special javascript:code";
        questions[8][2]="A URL that uses the special javascript:protocol";
        questions[8][3]="A URL that uses the special javascript:encoding";
        questions[8][4]="A URL that uses the special javascript:stack";
        
        questions[9][0]="Which of the following object is the main entry point to all client-side JavaScript features and APIs?";
        questions[9][1]="Position";
        questions[9][2]="Window";
        questions[9][3]="Standard";
        questions[9][4]="Location";
        
        answer[0][1]="both 1 and 2";
        answer[1][1]="Object-Oriented";
        answer[2][1]="both 1 and 2";
        answer[3][1]="ignores the statement";
        answer[4][1]="all of above";
        answer[5][1]="const";
        answer[6][1]="Sanfoundry_Javascriptmcq";
        answer[7][1]="All of the mentioned";
        answer[8][1]="A URL that uses the special javascript:protocol";
        answer[5][1]="Window";
        
        opt1=new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setForeground(Color.black);
        opt1.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(opt1);
        
        opt2=new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setForeground(Color.black);
        opt2.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(opt2);
        
        opt3=new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setForeground(Color.black);
        opt3.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(opt3);
        
        opt4=new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setForeground(Color.black);
        opt4.setFont(new Font("Tahoma",Font.ITALIC,24));
        add(opt4);
        
        optiongroup=new ButtonGroup();
        optiongroup.add(opt1);
        optiongroup.add(opt2);
        optiongroup.add(opt3);
        optiongroup.add(opt4);
        
        next=new JButton("Next");
        next.setBounds(1100, 450, 200, 30);
        next.setFont(new Font("Tahoma",Font.ITALIC,24));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline=new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 530, 200, 30);
        lifeline.setFont(new Font("Tahoma",Font.ITALIC,24));
        lifeline.setBackground(Color.BLUE);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit=new JButton("Submit");
        submit.setBounds(1100, 610, 200, 30);
        submit.setFont(new Font("Tahoma",Font.ITALIC,24));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given=1;
            if(optiongroup.getSelection()==null){
                useranswer[count][0]="";
            }else{
                useranswer[count][0]=optiongroup.getSelection().getActionCommand();
            }
            
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(ae.getSource()==lifeline){
            if(count==2 || count==4 || count==6 || count==8 || count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }else if(ae.getSource()==submit){
            ans_given=1;
            if(optiongroup.getSelection()==null){
                useranswer[count][0]="";
            }else{
                useranswer[count][0]=optiongroup.getSelection().getActionCommand();
            }
                for(int i=0;i<useranswer.length;i++){
                    if(useranswer[i][0].equals(answer[i][1])){
                        score +=10;
                    }else{
                        score +=0;
                    }
                }
                setVisible(false);
                new Score(name,score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time="Time left"+timer+"seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.ITALIC,24));
        if(timer>0){
            g.drawString(time, 1100, 450);
            
        }else{
            g.drawString("time up!!", 1100, 450);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given==1){
            ans_given=0;
            timer=15;
        }else if(timer<0){
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            if(count==9){
                if(optiongroup.getSelection()==null){
                useranswer[count][0]="";
            }else{
                useranswer[count][0]=optiongroup.getSelection().getActionCommand();
            }
                for(int i=0;i<useranswer.length;i++){
                    if(useranswer[i][0].equals(answer[i][1])){
                        score +=10;
                    }else{
                        score +=0;
                    }
                }
                setVisible(false);
                new Score(name,score);
            }else{
              if(optiongroup.getSelection()==null){
                useranswer[count][0]="";
            }else{
                useranswer[count][0]=optiongroup.getSelection().getActionCommand();
            }
            count++;
            start(count);  
            }
            
        }
    }
    
    public void start(int count){
        qno.setText(""+(count+1)+".");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        optiongroup.clearSelection();
    }
    public static void main(String[] args){
        new Quiz("User");
    }
    
}
            
                  
        
            

    
 
    
    

    

