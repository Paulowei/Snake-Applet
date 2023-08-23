package com.moderneinstein.arcade ;

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
import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Component;
import javax.swing.JFrame;
import com.moderneinstein.arcade.Field;
import com.moderneinstein.arcade.Game;
import com.moderneinstein.arcade.Scene;
import com.moderneinstein.arcade.Grid;
import com.moderneinstein.arcade.Snake;
import com.moderneinstein.arcade.CustomButton;
import com.moderneinstein.arcade.ButtonListener;
import com.moderneinstein.arcade.Food;


public class Grid extends Scene {
    public Snake snake = new Snake();
    public Food food = new Food();
    public Label label = new Label();
    public int phase = 0;
    public int lapse;
    public int remark;
    public static int[] colors1 = new  int[]{100,150,200} ;
    public static int[] colors2 = new  int[]{90,120,150} ; 
    public static int[] colors3 = new  int[]{60,90,120}  ;
    public Game field1 = null ;
    public Grid(Game game1) {
        super();
        snake = new Snake();
        food = new Food();                             
        label = new Label();
        lapse = 20;
        String str = new String("Score: ").concat((snake.score).toString());
        // g.drawString(str,350,0);
        label.setBounds(new Rectangle(380, 10, 250, 80));
        label.setText(str);
        label.setLocation(new Point(320, 160));
        label.setBounds(new Rectangle(380, 10, 250, 80));
         this.add(this.label,0);
        // this.add(this.snake,1) ;
        // this.add(this.food,2) ;
        suspend = false;
        // this.paint(g);
	this.field1 = game1 ;
	    }

    @Override
    public void paint(Graphics g) {
        // g=this.getParent().getGraphics();
        super.paint(g);
        foreColor = new Color(50, 150, 250);
        this.setForeground(foreColor);
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if ((i + j) % 2 == 0) {
                    backColor = new Color(colors2[0], colors2[1], colors2[2]);
                    g.setColor(backColor);
                    g.drawRect(HGAP * i, VGAP * j, HGAP, VGAP)  ;     
                    // g.fillRect(HGAP*i,VGAP*j,HGAP,VGAP);
                }
                if ((i + j) % 2 == 1) {
                     backColor = new Color(colors1[0], colors1[1],colors1[2]);
                    g.setColor(backColor);
                    g.drawRect(HGAP * i, VGAP * j, HGAP, VGAP);
                    // g.fillRect(HGAP*i,VGAP*j,HGAP,VGAP);
                }
            }
        }
        snake.paint(g);
        food.paint(g);
    }

    @Override
    public void update(Graphics g1) {
        snake.update(g1);
        if (snake.position[0] % LENGTH == food.posX % LENGTH
                && snake.position[1] % WIDTH == food.posY % WIDTH) {
            food.update(g1);
            if (snake.score.equals(Integer.valueOf(0))) {
                remark = lapse;
             //   System.out.println("Vrain");
            }
            snake.score = snake.score + 1;
            String str2 = new String("Score :");
            String str3 = Integer.toString(snake.score);
            String str4 = new String(" Phase :");
            String str5 = Integer.toString(this.phase);
            label.setText(str2.concat(str3).concat(str4).concat(str5));
            int trans = snake.score - lapse * phase;
            int remainder = remark - snake.score ;
            if (remainder == 0) {
                if (array1[0] == true) {
                    snake.spawn(array1[1]) ;
                }
                remark = snake.score + lapse;
                this.phase = this.phase + 1 ;
                phaseChange() ;
            }

            else {
                snake.grow();
                if (array1[1] == true) {
                    snake.color = new Color(random.nextInt(256), 
                    random.nextInt(256),  random.nextInt(256));
                }
            }
        }
        array1[1] = true;
        Graphics g2 = g1.create();
        paint(g2);
    }
    public void phaseChange(){ 
         colors3 = new int[3] ;
         parseArrays() ;
        Color colored = new Color(colors3[0],colors3[1],colors3[2]) ;
        if(this.field1!=null){
     //   System.out.println(colored) ;
     this.field1.setBackground(colored)  ; 
     this.field1.repaint() ;
    }   
   }
   public void parseArray(int[] buffer){
    for(int c=0 ;c<buffer.length;c++){
        buffer[c] = random.nextInt(256) ;
    }
   }
   public void parseArrays(){
    parseArray(colors1) ; 
    parseArray(colors2) ; 
    parseArray(colors3) ;
  
}
}
        // this.add(this.snake,1) ;
        // this.add(this.food,2) ;
