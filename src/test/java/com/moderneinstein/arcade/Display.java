package com.moderneinstein.arcade  ;
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
public class Display {
    public JFrame panel1 ; 
	public JButton button1 ; 
	public Graphics graphics1 ; 
	public JButton button2 ;
	public JButton button3 ;
	public JButton  button4 ;
	public Display(){
		 button1 = new JButton("This is Random 1") ;
		 button2 =new JButton("This is Random 2")  ;
		 button3 = new JButton("This is Random 3 ") ;
		 button4 = new JButton("This is Random 4 ")  ;
		 panel1 = new JFrame() ; 
		 graphics1 =  panel1.getGraphics() ; 
		 init1(graphics1) ;
	}
	public void init1(Graphics g1){
	Rectangle rect1 = new  Rectangle (10,10,80,80)  ;
		button1.setBounds(rect1 )  ;
		button1.setVisible(true) ;
		button1.setBackground(new Color(60,80,100)) ;
		button1.setFocusable(true) ;
		panel1.setEnabled(true) ;
		button2.setBounds(rect1) ;
		button2.setVisible(true) ;
		button2.setFocusable(true) ;
		button2.setBackground(new Color(50,100,150)) ;
	    button3.setVisible(true)  ;
		button3.setFocusable(true) ;
		button3.setBounds(rect1) ;
		button3.setBackground(new Color(200,150,180)) ;
		button4.setBounds(rect1) ;
		button4.setVisible(true) ;
		button4.setFocusable(true) ;
		button4.setBackground(new Color(100,150,200)  )  ;
	}
	public void init2(Graphics g1){
		panel1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		panel1.setAutoRequestFocus(true) ;
	panel1.setBounds(new Rectangle(0,0,500,500)) ;
	GridLayout layout1 = new GridLayout(2,2)  ;
		panel1.setLayout(layout1 )  ;
	//panel1.setLayout(null) ;
		panel1.setVisible(true) ;
		Container cont1 = panel1.getContentPane()  ; 
//		button1.setVerticalAlignment(JButton.BOTTOM ) ;
//	button1.setHorizontalAlignment(JButton.RIGHT) ;
	//	button2.setVerticalAlignment(JButton.NORTH) ;
	//	button2.setHorizontalAlignment(JButton.LEFT) ;
		cont1.add(button1,BorderLayout.NORTH )  ;
		cont1.add(button2,BorderLayout. SOUTH  )  ;
		cont1.add(button3,BorderLayout. EAST )   ;
		cont1.add(button4, BorderLayout. WEST )  ;
	JLabel label1 = new JLabel("Rand Text ")  ;
	    label1.setBounds(0,0,50,50) ;
		label1.setVisible(true) ;
		label1.requestFocus() ;
		label1.setBackground(new Color(60,80,100)) ;
		panel1.setFocusTraversalKeysEnabled(true) ;
		panel1.setFocusTraversalPolicyProvider(true ) ;
	//	panel1.add(button1) ;
	//	panel1.add(button2) ;
	//	panel1.add(label1)  ;
	}
	public static void main(String[] args){
		Display display1 = new Display() ;
		Graphics graphics2 = display1.graphics1 ;
		display1.init2(graphics2 )  ;
	//	display1.panel1.frameInit() ;
	}
}