package com.moderneinstein.arcade ;
import java.awt.Graphics ;
import java.util.Random ; 
import java.awt.Container ; 
import javax.swing.JButton   ;
import java.lang.String ; 
import java.awt.Color ; 
import java.awt.Rectangle ; 
import java.awt.Component ; 
//import java.awt.Rectangle ; 
import java.awt.Dimension ;
import java.awt.Point  ;
import  com.moderneinstein.arcade.Field ;
import  com.moderneinstein.arcade.Game  ;
import  com.moderneinstein.arcade.Scene ; 
import  com.moderneinstein.arcade.Grid ; 
import com.moderneinstein.arcade.Snake ; 
import  com.moderneinstein.arcade.CustomButton ;
import com.moderneinstein.arcade.ButtonListener ;
public class CustomButton extends JButton  {
	public Graphics G4  ; 
	public int xPos ; 
	public int yPos ; 
	public int height ; 
	public int width  ; 
	public Color color1  ; 
	public String str1  ;
	public Random random1 ;
	public Game game1 ; 
	public CustomButton(Game game2 , String str2,int xPos1, int yPos1){
				super() ;
	             this.xPos = xPos1   ; 
			   this.yPos = yPos1   ; 
			   this.height = 20   ; 
			   this.width = 20  ;
			   this .G4 = this.getGraphics() ;
			   this.str1 = str2 ;
			   random1 = new Random() ;
			   setVals() ;
			   this.game1 =game2 ;
	}
		public CustomButton(Game game2 , String str2 , int xPos1,int yPos1,int height1, int width1){
		super() ;
			   this.xPos = xPos1   ; 
			   this.yPos = yPos1   ; 
			   this.height = height1   ; 
			   this.width = width1   ;
			   this.G4 = this.getGraphics()  ; 
			   this.str1 = str2   ;
			   random1 = new Random() ; 
			   setVals() ;
			   this.game1 = game2  ;
		}
		public void setVals(){
			color1 = new Color(
			   random1.nextInt(256),random1.nextInt(256)
			   ,random1.nextInt(256) )   ;
			   this.setLabel(this.str1) ;
			   Rectangle rect1 = new Rectangle(xPos,yPos,width,height) ;
			   this.setBounds(rect1)  ;
			   this.setLocation(new Point(xPos,yPos)) ;
			   this.setFocusable(true ) ;
			   this.setBackground(this.color1) ;
			   this.setFocusTraversalKeysEnabled(true) ;
			   this.setVisible(true) ;
			   this.setPreferredSize(new Dimension(width,height))  ;
			   this.requestFocus()  ;
		}
//@Override 
	/*
	public void paint(Graphics G5){
	   super.paint(G4)  ;
		if(G5==null){
			G5 = G4.create()  ;
		}
		G5.setColor(this.color1)  ;
		G5.drawRect(this.xPos,this.yPos,this.width,this.height ) ;
		G5.fillRect(this.xPos, this.yPos, this.width, this.height )  ;
	}
	*/
//	@Override 
	/*
	public void update(Graphics G5){
	super.paint(G4) ; 
		if(G5 == null ) {
			G5  =  G4.create()  ;
		}
		G5.setColor(this.color1)  ;
		paint(G5) ;
	}
	*/
	  //  import java.awt.event.KeyEvent ; 
	  /*
	  ActionListener listener1 = new ActionListener(){
		@Override 
		public void actionPerformed(ActionEvent event1){
		int digit1 = event1.getID() ; 
		int digit2 = event1.getModifiers() ; 
		Object obj1 = event1.getSource()  ;
		System.out.println(digit1)  ;    
		if(digit1==ActionEvent.ACTION_PERFORMED ){
			array1[0] = true ;
			button1.setBackground(new Color(60,100,180)) ;
		}
	}
	}  ;
	ActionListener listener2 = new ActionListener(){
		@Override 
		public void actionPerformed  (ActionEvent event2 ) {
			int digit1  = event2.getID( ) ; 
			int digit2 = event2. getModifiers  () ;
			System.out.println(digit1 ) ;   
			Object obj1 = event2.getSource() ;
			if (digit1== ActionEvent. ACTION_PERFORMED ) {
				array1[1] = true  ;
				button2.setBackground(new Color(70,70,70))  ;
			}
		}
	} ;
	*/
}