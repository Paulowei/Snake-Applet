package  com.moderneinstein.arcade ;

import java.util.Scanner; 
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
import java.util.Random;
import java.awt.Component;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Graphics;

import com.moderneinstein.arcade.Field ;
import com.moderneinstein.arcade.Game  ;
import com.moderneinstein.arcade.Scene ; 
import com.moderneinstein.arcade.Grid ; 
import com.moderneinstein.arcade.Snake ; 
import com.moderneinstein.arcade.CustomButton ;
import com.moderneinstein.arcade.ButtonListener ;
 public class Food extends Component{
    public Integer posY=8;
    public Integer posX=8;
    public static Random rand = new Random();
    public Color color;
    public boolean isAlive;
    public Food(){
        super();
		this.posY = rand.nextInt(Grid.WIDTH);
        this.posX= rand.nextInt(Grid.LENGTH);
        this.setVisible(true);
        this.color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        this.setForeground(this.color);
        this.setSize(new Dimension(1,1));
		 this.setLocation(new Point(this.posY,this.posX));
    }
    public void spawn(){
        this.posY = rand.nextInt(Grid.WIDTH);
        this.posX= rand.nextInt(Grid.LENGTH);
        this.color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		 this.setLocation(new Point(this.posY,this.posX));
    }
    public void dissappear(Graphics g){
        this.getParent().remove(this);
        }
    @Override
    public void paint(Graphics g){
        g.setColor(this.color);
        g.drawRect(this.posX*Grid.HGAP,this.posY*Grid.VGAP,Grid.HGAP,Grid.VGAP);
        g.fillRect(this.posX*Grid.HGAP,this.posY*Grid.VGAP,Grid.HGAP,Grid.VGAP);
    }
    @Override
    public  void update(Graphics g1){
        this.spawn();
        Graphics g2 = g1.create();
        this.color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        g1.setColor(this.color);
        if(this.isAlive==false){
        }
        //this.spawn();
        this.paint(g2);
    }
}
/**
 * 
 *     //public Integer[][] foodPos = new Integer[posY][posX];
 * 
 * //    public Integer[][] foodPos = new Integer[posY][posX];
 * 
 * //    public static Integer score = 0;
 * 
 *  //   public static int currentPosX;
//    public static int currentPosY;
//    public static int[] currentPos=new int[]{currentPosX,currentPosY};

//        this.setName(score.toString());

  //      KeyAdapter listener = new KeyList();
        //Dimension D1 = new Dimension(rand.nextInt(Grid.WIDTH),rand.nexInt(Grid.LENGTH);
        //this.setLocation(D1);
     //   this.addKeyListener(listener);
        //this.spawn();
        //this.disappear();

            //    Food.currentPosX= this.posX;
   //     Food.currentPosY= this.posY;

           //Food fd1 = new Food();
        //this.spawn();
		//this.setLocation(new Point(2*Grid.HGAP,2*Grid.VGAP));
      //  this.color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));

          //    score++;

              //@Override

                       //   g1.dispose();
 */


