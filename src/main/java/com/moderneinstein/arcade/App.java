package com.moderneinstein.arcade  ;
import javax.swing.JPanel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Date;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
//import java.io.OutputStream ;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.*;
import java.io.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import javax.swing.WindowConstants;
import java.awt.image.BufferedImage;
//import java.lang.InterruptedException ;
import java.io.IOException ; 
import java.awt.event.KeyEvent ; 
import java.awt.event.KeyListener ; 
/**
 * Hello world!
 *
 */
public class App implements KeyListener{
public static Game game = null ; 
//public static  Thread thread4 = new Thread() ;
public static boolean[] array1  ; 
public static BufferedReader  buffered1  ;
public static PrintStream stream2  =  System.out    ;
public static boolean start  = false ;   
public void keyPressed(KeyEvent e){
        System.out.println(e.getKeyCode());
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
            this.game.grid.snake.direction[0]=0;
            this.game.grid.snake.direction[1]=-1;
            break;
            case KeyEvent.VK_DOWN:
            this.game.grid.snake.direction[0]=0;
            this.game.grid.snake.direction[1]=1;
            break;
            case KeyEvent.VK_LEFT:
            this.game.grid.snake.direction[0]=-1;
            this.game.grid.snake.direction[1]=0;
            break;
            case KeyEvent.VK_RIGHT:
            this.game.grid.snake.direction[0]=1;
            this.game.grid.snake.direction[1]=0;
            break;
            default:
            break;
        }
    }
  public void keyTyped(KeyEvent e){
        System.out.println(e.getKeyCode());
    } 
    //@Override
     public void keyReleased(KeyEvent e){
        System.out.println(e.getKeyCode());
    } 
	  public static String getVal(String str5){
	  String str6 = new String(" ") ;
	  try{ 
		stream2.println(str5) ;
		str6=  buffered1.readLine() ;
		}
		catch(IOException exp){
			System.err.println(exp.toString()) ;
			exp.printStackTrace() ;
		} 
		return str6 ; 
	}
    public static void  enquire(){
		 InputStream stream1 = System.in   ; 
		 InputStreamReader reader1 = new InputStreamReader(stream1) ;
		  buffered1 = new BufferedReader(reader1) ;
		// stream2 = System.out ;
		 array1 = new boolean[3] ;
		//  stream2.println("Enter 1 if the snake should alter its color frequently ") ;
		  String  str4 =  getVal("Enter 1 if the snake should alter its color frequently ")  ;
		  if(str4.equals("1")){
		  	array1[1] = true ;
		  }
	//	  stream2.println("Enter 1 to Allow the snake to shrink after phases  ") ;
		  String str5 =  getVal("Enter 1 to Allow the snake to shrink after phases  ");
		  if(str5.equals("1")){
		  	array1[0] = true ; 
		  }
		  if(array1[0]==true){
		  String str7 = getVal(" Enter the size of the phases " )  ;
		  int size1 = Integer.parseInt(str7) ;
		  game.grid.lapse = size1 ; 
		  }
		  String str8 = getVal("Enter 1 to activate the bot") ;
		  if(!str8.equals("1")){
	//	  	thread4 = null ; 
		  }
	}
    public static void main( String[] args )
    {      
        BufferedImage image = new BufferedImage(50,50,BufferedImage.TYPE_INT_RGB);
        Graphics g=image.getGraphics();
        System.out.println( "Snake" );
        System.out.println("Game is running");
        game = new Game();
	//	thread4   =    null ;
        Thread thread1 = Thread.currentThread() ; 
	   //thread4 = new SnakeBot(game) ;
		 int int4 = 0 ;
		 System.out.println(game.array1[0]) ;
		 System.out.println(game.array1[1]) ;
		 game.addKeyListener(game.keyList)  ; 
        String str1 = new String(" ") ;
        System.gc()  ;
     //   try{
	 System.out.println(60) ;
		game.grid.field1 = game ;
		while(true){
			game.update(g)  ;
			if(game.thread8!=null){
				game.thread8.run() ;
			}
		}

        }
     //   }
    }
	


		 /*
		 while(int4==0){
		  System.out.println("You will now be taken to the Menu ")  ;
		 enquire() ; 
		 String str4 = getVal("Enter 0 to return to the menu ");
		 int4= Integer.parseInt(str4) ;
		 }
		 */
	//	 while(start == false){
	//	 start = game.start   ;
	//	 	int4 = int4+ 1 ;
	//		if(int4> 10 ){
	//			int4 = 0 ;
	//		}ne 4b w 
	//		System.out.println(88) ; 
	//		System.out.println(90) ;
	//	 }
		 // Integer intVal = Integer.toString(45) ; 
		 
		 	//game.grid.array1 = array1 ;
      //  InputStream isr1 =   System.in  ; 
      //  InputStreamReader isr2 = new InputStreamReader(isr1) ;
      //  BufferedReader reader1 = new BufferedReader(isr2)   ;
	  	 /*
	 if(game.thread8!=null){
        while(true){
            game.update(g) ;
	         game.thread8.run() ;
		}
	}
	
//	else{
	  
	//	List<Double> doubled = new List<Double>() ;

		//}
//	    bot4.random = new Random() ;
	//    System.out.println("LOOP")  ;
     //       str1 = reader1.readLine()  ; 
   //         if(str1=="s"){
   //             thread1.wait(0,0) ;
  //          }
   //         if(str1=="a"){
    //            System.exit(1) ; 
    //        }
    //        //System.out.println("Game is running");

	   //    }catch(InterruptedException |IOException exp1){            
	//	exp1.printStackTrace() ; 
	  */
