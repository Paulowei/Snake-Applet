package com.moderneinstein.arcade ;
import java.util.Arrays  ;
import java.awt.event.KeyListener ; 
import java.awt.event.KeyEvent ; 
import java.awt.event.ActionListener ; 
import java.awt.event.ActionEvent ; 
import java.awt.event.FocusListener ; 
import java.awt.event.FocusEvent   ;
import java.io.Serializable  ;
import javax.swing.JButton   ;
import java.awt.Color  ;
import java.lang.Thread ; 
import java.awt.Component ; 
import java.awt.Container ;
import javax.swing.JPanel ; 
import javax.swing.JLayeredPane ;
import java.awt.Rectangle;
import com.moderneinstein.arcade.Field ;
import com.moderneinstein.arcade.Game  ;
import com.moderneinstein.arcade.Scene ; 
import com.moderneinstein.arcade.Grid ; 
import com.moderneinstein.arcade.Snake ; 
import com.moderneinstein.arcade.CustomButton ;
import com.moderneinstein.arcade.ButtonListener ;

public class ButtonListener implements FocusListener,
Serializable,ActionListener, KeyListener {
	public JButton button1 ; 
	public Color color1  ;
	public Color color2 ;
	public Thread thread1   = null ; 
	int flip = 0;
	public boolean   increment ;
	public String string4 ; 
	public Game game1 ;
	public static boolean isChanged = false  ; 
	public ButtonListener (Game game2 , JButton button2,boolean bool1) {
		this.button1 = button2 ;
		this.color1 = button1.getBackground() ;
		this.color2 =  new Color(150,150,150  )  ;
		this.string4 =  button2.getLabel() ;
		increment = bool1  ;
		init() ;
		this.game1 = game2 ; 
	}
	public ButtonListener(Game game2 , boolean bool1){
		JButton button2 = new JButton("This is Random") ; 
		Color color4 =new Color(150,150,150) ; 
		this.button1 = button2 ; 
		this.color2 = color4  ;
		this.string4 = button2.getLabel()   ;
		increment = bool1  ;
		init() ;
		this.game1  =  game2 ;
	}
	public ButtonListener (Game game2 ,JButton button4, Color color2,boolean bool1  ){
		this.button1= button4 ;
		this.color1 = button1.getBackground() ;
		this.color2 = color2 ;
		this.string4    =  button4.getLabel() ;
		increment =  bool1 ;
		init() ; 
		this.game1 = game2 ;
		}
     public   void   init (){
	 	button1.addFocusListener(this)  ;
		button1.addActionListener(this)  ;
		button1.addKeyListener(this)  ;
 	 } 
	@Override
	public void focusGained(FocusEvent event1 ){
	    String str4 = event1.paramString() ; 
		boolean bool1 = event1. isTemporary() ; 
	     int digit1= event1.getID () ;
		 Object obj1 = event1.getSource() ;
		 if(digit1==  FocusEvent.FOCUS_GAINED){
	//  button1.setBackground(color2 ) ;
		// System.out.println(85)  ;
	}
	}
        @Override 
	 public void  focusLost(FocusEvent event2){
	 	String str4 =  event2.paramString()  ;  
		boolean bool2  =  event2.isTemporary()  ;
		int digit1  =  event2.getID()  ;
		Object obj1 = event2.getSource() ;
		if(digit1 == FocusEvent.FOCUS_LOST  ){
	//button1.setBackground(color1)  ;
	//  System.out.println(86)  ;
		}
	 }
	 
	 	@Override 
		public void actionPerformed  (ActionEvent event2 ) {
			int digit1  = event2.getID( ) ; 
			int digit2 = event2. getModifiers  () ;
	//		System.out.println(digit1 ) ;   
			Object obj1 = event2.getSource() ;
			String str4 =event2.paramString() ;
			if (digit1== ActionEvent. ACTION_PERFORMED ) {
	//	array1[1] = true  ;
//		button2.setBackground(new Color(70,100,130 ) )   ; 
             flip = flip+ 1;
			if(thread1!=null){
				thread1.run() ;
			}
			if(increment==true){
			String  label  = this.string4.concat(":").concat(Integer.toString(flip)) ; 
			button1.setText(label) ; 
			}
			isChanged  = true  ;
			}
		}
	@Override 
		public void keyPressed(KeyEvent event4){
			int digit1 = event4.getID()  ; 
			int digit2 =     event4.getKeyCode() ; 
			int digit3   = event4.getModifiers() ; 
			Object     obj1    =     event4.getSource()     ;
		//	   System.out.println(digit1 ) ; 
			if(digit2    ==    KeyEvent. VK_UP||
			 digit2== KeyEvent.VK_ENTER ){
			 flip=flip + 1 ;
			if(thread1!=null){
		//thread1.run() ;
				} 
				isChanged = true ;
				if(increment==true){
					String label = this.string4.concat("").concat(Integer.toString(flip))   ;
			button1.setText(label )  ; 
			}
				}
				/* 
				if(digit2== KeyEvent.VK_ESCAPE){
					Container cont1 = game1.getLayeredPane() ; 
					if(cont1==game1.newPane&&isChanged  == true ){
					game1.grid.snake.velocity = game1.listeners[3].flip ;
					game1.grid.lapse = game1.listeners[1].flip ;
					System.out.println(game1.listeners[1].flip) ;
					System.out.println(game1.listeners[3].flip) ;
					System.out.println(game1.array1[2]) ;
					validateArray();
						init6() ; 
					}
					System.out.println("Execute");
					game1.setBounds(new Rectangle (510,510)) ;
					game1.setBounds(new Rectangle(500,500)) ;
				}*/
		}
		public void init6(){
			new Thread(){ 
				@Override 
				public void run (){
			game1.setLayeredPane(game1.layeredPane) ;
			game1.requestFocus()  ;
			game1.setAutoRequestFocus(true) ;
			game1.grid.suspend = true  ;
			//game1.addKeyListener(game1.keyList)  ;
			game1.threads[4].run() ;
			isChanged = false ;}
				}.start ( )   ; 
		}
			public void validateArray(){
		 game1.grid.array1[0] = game1.array1[0]  ;
		 game1.grid.array1[1]  =  game1.array1[1]  ;
		 if(game1.array1[2] 
		 ==true ){
		 	game1.thread8  =  new SnakeBot(game1) ;
		 }
		 else{
		 	game1.thread8 = null ;
		 }
		 game1.threads[7] = game1.thread8 ;
}
		@Override
		public void  keyTyped(KeyEvent event4 ){
				int digit1 = event4.getID()  ; 
			int digit2 =     event4.getKeyChar() ; 
			int digit3   = event4.getModifiers() ; 
			Object     obj1    =     event4.getSource()     ;
		}
		@Override 
		public    void     keyReleased(KeyEvent   event4 ){
		   	int digit1 = event4.getID()  ; 
			int digit2 =     event4.getKeyCode() ; 
			int digit3   = event4.getModifiers() ; 
			Object     obj1    =     event4.getSource()     ;
		}
}
				/*
						String str7 = button1.getLabel()   ;
			String  str2   =    str7.substring(0, str7.length()- Integer.toString(flip-1).length())  ;
			String str3 = Integer.toString(flip) ;
			String str5 =  str2.concat(new String("")).concat(str3)  ;
			*/
			/*
				String str7 = button1.getLabel()   ;
			String str4 = Integer.toString(flip) ;
			String  str2   =    str7.substring(0, str7.length()- Integer.toString(flip-1).length())  ;
		String str5 =  str2.concat(new String("")).concat(str4)  ;
		*/