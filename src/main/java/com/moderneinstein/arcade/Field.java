package com.moderneinstein.arcade ;
import javax.swing.JPanel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntFunction;
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
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
import javax.swing.JRootPane;
import javax.swing.JLayeredPane;
import java.awt.FileDialog;
import javax.swing.JFileChooser;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Label;
import java.util.Arrays;
import javax.imageio.ImageIO ;
import javax.imageio.stream.ImageInputStream ;
import java.awt.ImageCapabilities ; 
//import java.awt.Component.BltBufferStrategy ; 
//import java.awt.Component.FlipBufferStrategy ; 
import java.awt.BufferCapabilities ;
import java.awt.image.BufferStrategy ; 
import java.awt.Image ;
import java.awt.event.ActionListener ; 
import java.awt.event.FocusListener  ; 
import java.awt.event.FocusEvent ; 
import java.awt.event.ActionEvent ;
import java.awt.KeyboardFocusManager ; 
import java.awt.AWTKeyStroke ; 
import javax.swing.KeyStroke ;
import java.awt.Canvas ;
import javax.swing.JButton   ;
import  com.moderneinstein.arcade.Field ;
import  com.moderneinstein.arcade.Game  ;
import  com.moderneinstein.arcade.Scene ; 
import  com.moderneinstein.arcade.Grid ; 
import  com.moderneinstein.arcade.Snake ; 
import com.moderneinstein.arcade.CustomButton ;
import  com.moderneinstein.arcade.ButtonListener ;

public class Field extends JFrame   {
public Graphics G4  ; 
public JLayeredPane layeredPane  ;
public Scene scene1 ;
public boolean[] array1  ; 
public String imageStr =  "Ninja.jpeg"  ;
public KeyListener keyList ;
public boolean start  = false ;
	public Image image1 ; 
	 public  Field()  {
        super(); 
		 BufferedImage image = new BufferedImage(50,50,BufferedImage.TYPE_INT_RGB);
		G4	 = image.getGraphics();
		 this.scene1 = new  Scene() ;
		// array1  =   new boolean[3]  ;
        try{
		this.setImage();
        this.frameInit();
		init1(G4)  ; 
		init2(G4)  ;
		setBounds(new Rectangle(510,510))  ;
		setBounds(new Rectangle(500,500))  ; 
	   this.confirmBufferState() ;
        }catch(IllegalArgumentException|
		NullPointerException  | IOException exp ){
            exp.printStackTrace();
        }
		this.setFocusTraversalPolicyProvider(true);
//allocateThreads() ;
    }
	  public void init1(Graphics g1){
  	     this.setLocationRelativeTo(null);
        setVisible(true);
        processWindowEvent(new WindowEvent(this,WindowEvent.WINDOW_ACTIVATED));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        setAutoRequestFocus(true);
		setFocusTraversalKeysEnabled(true )  ;
  }
  public void init2(Graphics g2){
  		 BufferedImage image = new BufferedImage(50,50,BufferedImage.TYPE_INT_RGB);
		 Graphics g3 = image.getGraphics() ;
		   setPreferredSize(new Dimension(300,300));
        setEnabled(true);
		  setBounds(0, 0, 500,500);
        setLayout(new GridLayout());
		 this.setBackground(new Color(180,130,180))  ;
		 //this.keyList = new KeyList(this) ;
		 this.addKeyListener(this.keyList) ;
  //   layeredPane.setGraphics(g3)  ;
 //       layeredPane.setLayer(snake,JLayeredPane.MODAL_LAYER,2);
   //     layeredPane.addImpl(grid, BorderLayout.NORTH ,1);
   //     grid.paint(g3);
  }
   public void setImage() throws IOException{
 		try{
		File file2 = new File("Field.java") ;
		String str4 = file2.getAbsolutePath() ;
	  ///System.out.println(str4) ;
		String str2 = file2.toString() ;
		String str6 =  str4.substring(0,str4.length()-str2.length()) ;
		String str5 = str6.concat(this.imageStr) ;
 	 	File file1 = new File(str5)  ;
		/*
		System.out.println(file2.getName()) ;
		System.out.println(file2.getCanonicalPath()) ;
		System.out.println(file2.toString()) ;
		System.out.println(file2.getAbsolutePath()) ;
		*/
		 InputStream stream1 = new FileInputStream(file1) ;
		 ImageInputStream stream2 = ImageIO.createImageInputStream(stream1) ;
		 BufferedImage image4 = ImageIO.read(stream2) ;
		 this.image1 = image4 ;
		 this.setIconImage(image4) ;
		 }
		 catch(IOException exp1){
		  String str1 = exp1.toString()  ;
		   System.err.println(str1) ;
		 }
 }
  public void confirmBufferState()  {
    try{
 //  	this.createBufferStrategy(3) ;
 	ImageCapabilities capabilities5 =  new ImageCapabilities(true) ;
	ImageCapabilities capabilities6 = new ImageCapabilities(true ) ; 
	BufferCapabilities capability7 = new BufferCapabilities(capabilities5,capabilities6,
	BufferCapabilities.FlipContents.COPIED) ;
    this.createBufferStrategy(3,capability7) ;
	BufferStrategy strategy1 = this.getBufferStrategy() ;  
	BufferCapabilities capabilities1 = strategy1.getCapabilities()  ;
	
	if((capabilities1.getClass()).equals
	(Component.FlipBufferStrategy.class)
	){
	      System.out.println("Flip Buffer Stratergy  . ")  ;	
	}
	if((strategy1.getClass()).equals
	(Component.BltBufferStrategy.class)){
		System.out.println("Blit Buffer Stratergy .") ;
		}
//	BufferCapabilities capabilities4 = GraphicsConfiguration.getBufferCapablities() ; 
}catch(AWTException exp1){
 System.err.println(exp1.toString()) ;
         }
	/*
	BuffeStratergy stratergy2 = Component.BltBufferStratergy ;
	BufferCapabilities capabilities2 = stratergy2.getCapablities() ; 
	ImageCapabilities capability3 = capabilties2.getFrontBufferCapabilties() ;
	ImageCapabilties capabilty4 = capabilities2.getBackBufferCapabilties() ; 
	*/
	 
 }
    
     public void update(Graphics f){
	 //Override this  update method in inheriting classes ; 
	//if(newPane)
//	if(newPane!=null){
//		newPane.repaint() ;
//		newPane.update(f) ;
	//	}
		if(layeredPane!=null){
		layeredPane.repaint() ; 
		layeredPane.update(f) ;
		}
		if(scene1!=null){	
	//	if(grid.suspend==false){
		  scene1.update(f) ;
//		}
	}
	//	this.update(f) ;
    }
	 public  void initialisePane(Container cont1, Rectangle rectangle1,
  Color color1 , Dimension dimension1 ,
  LayoutManager manager1 ){
  		cont1.setVisible(true) ; 
	  cont1.setEnabled(true) ; 
	   cont1.setLayout(manager1 )   ;
	  cont1.setBackground(color1) ; 
    cont1.setBounds( rectangle1   ) ;
	 cont1.setPreferredSize(  dimension1 )  ;
	//  //	button1.setBounds(new Rectangle(10, 10  , 30 ,30 )  ); 
		cont1.setFocusTraversalKeysEnabled(true )  ;
		cont1.setFocusTraversalPolicyProvider(true ) ;
  }	
}