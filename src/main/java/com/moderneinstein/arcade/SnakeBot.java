package com.moderneinstein.arcade ;
import java.lang.Thread ;
import java.lang.Runnable ; 
import java.util.LinkedList  ; 
import java.awt.event.KeyEvent ; 
import java.awt.event.KeyAdapter ; 
import java.awt.event.KeyListener ; 
import java.util.Random ; 
import java.lang.Math ; 
import java.util.Collections ; 
import java.awt.Dimension ; 
import java.awt.Rectangle ; 
import java.awt.Graphics ; 
import java.awt.Point ;  
import java.awt.Component ;
public class SnakeBot extends Thread implements Runnable {
public Game game ; 
public Random random ; 
public Snake snake ; 
public Grid grid ; 
public Food spot ;
public static int width = Grid.WIDTH ; 
public static int length = Grid.LENGTH ;
public SnakeBot(Game game1){
this.game = game1  ; 
this.random = new Random() ; 
this.grid = this.game.grid ;
this.snake = this.grid.snake ; 
this.spot = this.grid.food ;
}
@Override
public void run(){
 /// this.random = new Random() ;
  int digit4 = this.random.nextInt(2) ;
 Integer int4= snake.position[0]%width;
 Integer int5 = snake.position[1]%length ;
  int digit5 = spot.posX%width  ; 
  int digit6 = spot.posY%length ;
  correlate(int4,int5,digit5,digit6,digit4) ;
 // System.out.printf("Snake : %s ; %s ",Integer.toString(int4),Integer.toString(int5))   ;
 // System.out.printf("Food : %s ; %s ", Integer.toString(digit5), Integer.toString(digit6))   ;
  }
//System.out.println(digit4)  ;
  //if(digit4==1) 
    //	}     // 	
public void correlate(Integer int4,Integer int5, int digit5, int digit6,int digit4 ) {
     if(digit4==1){
	
		if(digit5>int4&&(digit5-int4)<width/2
		||(int4-digit5)>=width/2){
		if(snake.direction[0]<=0){
		   snake.direction[0] = 1 ; 
		   snake.direction[1] = 0 ; 
 	//		return ; 
	 //       System.out.println("A1")  ;
			}
			}
	if(digit5 <int4&&(int4-digit5)<width/2
	|| ((digit5-int4)>=width/2)){
		if(snake.direction[0]>=0){
		   snake.direction[0] = -1 ;
		    snake.direction[1] = 0  ; 
			//		return  ;
	    //    System.out.println("A2")  ;
		}
	} 
	
	}
	if(digit4==0){
	 if((digit6 >int5&&(digit6-int5)<length/2)
	  ||(int5-digit6)>=length/2 ){
	 	if(snake.direction[1]<=0){
		    snake.direction[1] = 1  ;
		    snake.direction[0] = 0 ; 
	//		return  ;
		//	System.out.println("B1") ;
		}	
	}
        if((digit6<int5&& (int5-digit6)<length/2)
		|| (digit6-int5) >= length/2 ){
			if(snake.direction[1]>=0){
		  snake.direction[1] = -1 ; 
		   snake.direction[0] = 0 ; 
		   	return ; 
          //       System.out.println("B2") ;
		}
	}
	
}
}
 
}