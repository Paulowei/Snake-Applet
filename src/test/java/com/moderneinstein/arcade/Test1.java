package com.moderneinstein.arcade ;
import javax.swing.JButton ; 
import javax.swing.JPanel ; 
import javax.swing.JLayeredPane ; 
import javax.swing.JFrame ; 
import java.awt.Component ; 
import java.awt.Container ;
import java.util.Arrays ; 
import java.awt.Graphics ;
import java.awt.Rectangle ;
import java.awt.Color ; 
import javax.swing.WindowConstants  ; 
import javax.swing.filechooser.FileNameExtensionFilter ; 
import java.awt.BorderLayout ; 
import java.awt.GridLayout ; 
import javax.swing.JLabel ;
public class Test1 {
    public JFrame panel1 ; 
	public JButton button1 ; 
	public Graphics graphics1 ; 
	public Test1(){
		 button1 = new JButton("this is Random") ;
		 panel1 = new JFrame() ; 
		 graphics1 =  panel1.getGraphics() ; 
		 init1(graphics1) ;
	}
	public void init1(Graphics g1){
	Rectangle rect1 = new  Rectangle (10,10,50,50)  ;
		button1.setBounds(rect1 )  ;
		button1.setVisible(true) ;
		button1.setBackground(new Color(60,80,100)) ;
		button1.setFocusable(true) ;
		panel1.setEnabled(true) ;
	}
	public void init2(Graphics g1){
		panel1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		panel1.setAutoRequestFocus(true) ;
		panel1.setBounds(new Rectangle(0,0,400,400)) ;
		panel1.setLayout(new BorderLayout() )  ;
		panel1.setVisible(true) ;
		panel1.add(button1) ;
	}
	public static void main(String[] args){
		Test1 display1 = new Test1() ;
		Graphics graphics2 = display1.graphics1 ;
		display1.init2(graphics2 )  ;
		// display1.panel1.frameInit() ;
	}
}