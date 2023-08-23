package com.moderneinstein.arcade ;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Date;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.*;
import java.io.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Component;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.awt.Robot;
import java.awt.AWTException;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.lang.Math;
public class Snake extends Component {
    public int posX=8;
    public int posY=8;
    public Integer[] position= new Integer[]{posX,posY};
    public int length=1;
    public int velocity=2;
    public Color color;
	public ArrayList<Integer[]> positions ; 
    public  Integer score = 0;
    public  int count = 2;
    public static   Integer[] direction=new Integer[]{0,1};
    public Random rand = new Random();
    public Snake(){
	 super() ;
	 this. positions = new ArrayList<Integer[]>() ;
	  this.positions.add(this.position) ;
	  Integer[] tmp1= null ;
	  for(int c=1;c<this.length;c++){
	  tmp1 = new Integer[2] ;
		 // 	tmp1[0] = new Integer[posX -c*this.direction[0]][posY-c*this.direction[1]] ;
		 tmp1[0] = position[0]- c*this.direction[0] ;
		 tmp1[1] = position[1] - c*this.direction[1] ;
		 System.out.println(tmp1[0]) ;
		 System.out.println(tmp1[1]) ;
		positions.add(tmp1) ;
	  }
	  this.color = new Color(rand.nextInt(256),
	  rand.nextInt(256),rand.nextInt(256)) ;
    }

    public synchronized void transverse(){
		Integer[] tmp2 = null ;
		Integer[] tmp3 = null ;
		for(int c=length-1;c>0;c--){
			tmp2 = this.positions.get(c-1) ;
			tmp3 = this .positions.get(c);
			tmp3[0] =tmp2[0];
			tmp3[1] = tmp2[1] ;
			}
			    this.position[0]+=(direction[0])  ;
        this.position[1]+=(direction[1])  ;
		this.positions.set(0,this.position) ;
		if(this.position[0]<0){
				this.position[0]+= Grid.LENGTH  ;
			}
			if(this.position[1]<0){
				this.position[1] += Grid.WIDTH  ;
			}
    }
    public synchronized void spawn(boolean bool1){
		this.position[0] = Integer.valueOf(8) ;
		this.position[1] = Integer.valueOf(8) ;
		this.positions = new ArrayList<Integer[]>() ;
		this.length =  4  ; 
		this.count = 0  ; 
		this.direction = new Integer[]{1,0} ;
		this.positions.add(this.position)  ;
		Integer[] tmp = null ; 
		for(int v= 1;v<length;v++){
			tmp = new Integer[2] ;
			tmp[0] = this.position[0]-v*direction[0] ;
			tmp[1] = this.position[1] - v*direction[1] ;
			this.positions.add(tmp) ;
		}
		if(bool1==true){
		this.color  = new Color(rand.nextInt(256),rand.nextInt(256),
			rand.nextInt(256))  ;
			}
    }
    public synchronized void live(){
        this.position[0]+=(direction[0]*this.velocity)/20;
        this.position[1]+=(direction[1]*this.velocity)/20;
    }
    public synchronized void respawn(){
        this.position[0]=8;
        this.position[1]=8;
        this.velocity = 1;
    }
    public Integer[] getPos(){
        return this.position;
    }
    public int getPos1(){
        return this.position[0]; 
    }
    public int getPos2(){
        return this.position[1];
    }
    public int getLength(){
        return length;
    }
    public int getVelocity(){
        return this.velocity;
    }
    public Color getColor(){
        return this.color;
    }
    public synchronized void impose(){

    }
    public void grow(){
        this.length++;
     //   this.score++;     
	        int size1 = this.positions.size() ;
	    Integer[] tmp4 = new Integer[2]  ;
		if(size1>1){
	    Integer[] tmp1= this.positions.get(size1-2) ;
	    Integer[] tmp2 = this.positions.get(size1-1) ;
     	    int var4 = tmp1[0]-tmp2[0] ;
   	    int var5 = tmp1[1]-tmp2[1] ;
	    tmp4[0] = tmp2[0]- var4 ; 
            tmp4[1] = tmp2[1]- var5 ;
		}
		else{
		Integer[] tmp3 = this.positions.get(0) ;
		int var4 = tmp3[0]-this.direction[0] ; 
		int var5 = tmp3[1]-this.direction[1] ;
		tmp4[0] = var4 ; 
		tmp4[1] = var5 ; 
		this.positions.add(tmp4)  ;
		return  ; 
		}
	  this.positions.add(tmp4) ;	   
    }
    @Override
    public synchronized void paint(Graphics g){
        g.setColor(this.color);
        for(int i=0;i<=length;i++){
            int var2 = Math.round(position[0]/5000);
            int var3 = Math.round(position[1]/5000);
        }
		Integer[] tmp3 = null ;
	//	System.out.println(length);
	int digit2 = 0 ; 
	Integer[] main2 = this.positions.get(0)  ;
		for(int c=0;c<length;c++){
			tmp3 = this.positions.get(c) ;
			 int var2 = (Math.round(tmp3[0])) ;
			int var3 = (Math.round(tmp3[1])) ;
		//	System.out.printf("%d : %d. %d  ",c,var2,var3) ;
			g.drawRect(var2%Grid.LENGTH*Grid.HGAP,var3%Grid.WIDTH*Grid.VGAP
			,Grid.HGAP,Grid.VGAP) ; 
            Integer[] array5  ;
			g.fillRect(var2%Grid.LENGTH*Grid.HGAP,var3%Grid.WIDTH*Grid.VGAP
			,Grid.HGAP,Grid.VGAP) ;
		}
        //g.fillRect(this.position[0],this.position[1],Grid.HGAP,;Grid.VGAP);
    }
    @Override
    public synchronized void update(Graphics g1){
		if(velocity == 0){
			velocity = 1  ; 
		}
		count = count+1 ;
		if(count>=500/this.velocity){
        transverse();
		count = 0 ; 
		}
    //    Graphics g2=g1.create();
    //    this.color = new  Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        g1.setColor(this.color);
       // if(this.isAlive==false){
         //   g1.dispose();
      //  }
		//Thread.sleep(500) ;
		
        paint(g1);
        //g.drawRect(this.position[0],this.position[1],Grid.HGAP,Grid.VGAP);
    }

    
/*
//	@Override
    public void keyPressed(KeyEvent e){
        //System.out.println(e.getKeyCode());
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
            //count++;
            direction[0]=0;
            direction[1]=-1;
            break;
            case KeyEvent.VK_DOWN:
            direction[0]=0;
            direction[1]=1;
            break;
            case KeyEvent.VK_LEFT:
            direction[0]=-1;
            direction[1]=0;
            break;
            case KeyEvent.VK_RIGHT:
            direction[0]=1;
            direction[1]=0;
            break;
            default:
            break;
        }
    }
    //@Override
    public void keyTyped(KeyEvent e){
        //System.out.println(e.getKeyCode());
    } 
    //@Override
     public void keyReleased(KeyEvent e){
        //System.out.println(e.getKeyCode());
    }

    //public static void main(String[] args){

 
*/   //}
}
/**
 *    //public static Integer[] DIRECTION = new Integer[]{1,-1};
    //public int[][] var1 = new int[40][2];
   // public ArrayList<Integer[]> list1 = 
   // new ArrayList<Integer[]>(Collections.synchronizedList(new ArrayList<Integer[]>()));
   // ListIterator<Integer[]> iterator1 = list1.listIterator();
   // ListIterator<Integer[]> iterator2  = list1.listIterator();
 //   public int dateCount;
    //ArrayList arrayList = new ArrayBlockingQueue<>(capacity, fair)
   //Grid grid = new Grid();
   //ArrayList<Integer> arrayList = new ArrayList<Integer>();
   // public boolean isAlive;  

         //  this.spawn();
      // / this.transverse();
      //  this.live();
        //this.paint();
        //this.update()
        //this.Respawn();
        //this.paint(Graphics.create());
        //this.update();
//        date = new Date();

//        Date date_=new Date();
//	date = new Date() ;
//        if((date_.getTime()-date.getTime())/(dateCount*1000)>=1){
  //      dateCount++;
        //Thread.sleep(50) ;

        	//	tmp3 = new Integer[]{tmp2[0],tmp2[1]} ;
		//	this.positions.set(c,tmp3);
	
  //  }
        //Robot robot = new Robot();
        /*for(int i=0;i<length;i++){
            robot.delay(100);
            var1[i][0]=var1[i][0]=position[0]-i*direction[0];
            var1[i][1]=var1[i][0]=position[0]-i*direction[0];
        }*/
           /*for(int i=0;i<length;i++){
             //   for(int j=0;j<2;j++){
                //Thread.sleep(200);
                 if(i!=0){
                //if(var1[i-1]>0){
                var1[i][0]=var1[i-1][0]*direction[0];
                var1[i][1]=var1[i-1][1]*direction[1];
                
                //Thread.sleep(200);
               // }
            }
        }*/
        
    /*}catch(AWTException E){
        E.printStackTrace();
    }//
        public void eat(){
//        if(this.posX==Food.currentPosX&&this.posY==
//		Food.currentPosY&&this.length<Grid.LENGTH){
 //           grow();
   //     }
    }

        //direction = new Integer[length];
        //g=this.getParent().getGraphics();
        //var1.add()
        //arrayList.add(4);
        //arrayList.add(6);
        //System.out.println(arrayList);
        //System.out.println(Arrays.deepToString(var1));
        //System.out.println(Arrays.toString(position));
      //  this.color = new  Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));

                  //System.out.println(i);
       //     g.drawRect(var2%Grid.LENGTH *Grid.HGAP-i*direction[0]*Grid.HGAP,
      //      var3%Grid.WIDTH*Grid.VGAP-i*direction[1]*Grid.VGAP,Grid.HGAP,Grid.VGAP);
      //      g.fillRect(var2%Grid.LENGTH*Grid.HGAP-i*direction[0]*Grid.HGAP,
     //       var3%Grid.WIDTH*Grid.VGAP-i*direction[1]*Grid.HGAP,Grid.HGAP,Grid.VGAP);
            //g.drawLine()

            		//	digit2 = p
	//		int var2 = Math.round((main2[0]-(main2[0]-tmp3[0])*5000)/5000) ;
	//		int var3 = Math.round((main2[1]-(main2[1]-tmp3[1])*5000)/5000) ;  

       //this.paint(g);
        //count++;
		/*
        var1[0][0]=position[0]/20;
        var1[0][1]=position[1]/20;
        count+=1;
        var1[count%var1.length][0]=Math.round(position[0]/20);
        var1[count%var1.length][1]=Math.round(position[1]/20);
        while(iterator2.hasPrevious()==true){
            iterator2.previous();
        }
        if(!iterator1.hasNext()){
        //iterator1.add(getPos());
        }
        if(list1.size()>Grid.LENGTH){
            iterator2.remove();
            iterator2.next();
        }
		
        //System.out.println(list1.toString());
            //public Integer[][] foodPos;
  //  public static final int MAXLENGTH= Grid.LENGTH;  

   //   public KeyListener listener;

     //  public Date date;

     //	  Integer pos1 = null ; 
//	  Integer pos2 = null ;

    //private Date datetime;

            //Thread.sleep(50);
 */
