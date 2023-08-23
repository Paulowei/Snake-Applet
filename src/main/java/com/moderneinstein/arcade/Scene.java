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
import java.awt.Component   ;
import javax.swing.JFrame  ;


public class Scene extends JPanel {
    public static Integer LENGTH=16;
    public static Integer WIDTH=16;
    public static  Integer HGAP=25 ;
    public static  Integer VGAP = 25;
    public static Color foreColor;
    public static Color backColor;
	public Random random ;
	public boolean suspend  ; 
	public boolean array1[]  ;
	public Graphics  G4 ;
	public Scene(){
	long long1 = System.currentTimeMillis()  ; 
		this.random = new Random(long1)  ;
		this.suspend = false ; 
		this.array1 =new boolean[6] ;
		BufferedImage image2 = new BufferedImage(40,40,BufferedImage.TYPE_INT_RGB);
		G4 = image2.getGraphics() ; 
		
	}
	@Override 
	public void paint(Graphics G5){
	if(G5==null){
		G5 = G4.create() ; 
	}
}
@Override   
     public void update(Graphics G5){
	 	if(G5==null){
			G5 = G4.create() ; 
		}
	 }
}