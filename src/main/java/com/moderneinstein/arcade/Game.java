package  com.moderneinstein.arcade ;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.*;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import javax.swing.WindowConstants;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
import javax.swing.JRootPane;
import javax.swing.JLayeredPane;
import java.awt.FileDialog;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.imageio.ImageIO ;
import javax.imageio.stream.ImageInputStream ;
import java.awt.ImageCapabilities ; 
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
import     java.io.* ; 
import  java.io.IOException   ;
import com.moderneinstein.arcade.Field ;
import com.moderneinstein.arcade.Game  ;
import com.moderneinstein.arcade.Scene ; 
import com.moderneinstein.arcade.Grid ; 
import com.moderneinstein.arcade.Snake ; 
import com.moderneinstein.arcade.CustomButton ;
import com.moderneinstein.arcade.ButtonListener ;

public class Game extends Field {
     public   Grid grid    ;
	public JLayeredPane newPane ;
		public Thread[] threads ;
		public Thread  thread8 ;
		CustomButton[]  buttons  ; 
		ButtonListener[] listeners  ; 
		public Game present ;
//public Thread thread5 ;
    //public JPanel pane = new JPanel();
    public Game(){
        super();
		Component comp1 = new JButton("Graphics Component") ; 
		this.G4  = comp1.getGraphics()  ;
		present = this ; 
	//	 BufferedImage image = new BufferedImage(50,50,BufferedImage.TYPE_INT_RGB);
	//	this.G4	 = image.getGraphics( )    ;
		try{
		 this.scene1  = new  Grid(this) ;
		 this.grid = (Grid)scene1 ;
		 this.grid.field1 = this ;
		 System.out.println(this.grid.field1 ) ; 
		 array1  =   new boolean[3]  ;
		 threads = new Thread[8]   ;
		 	     threads[7] = thread8;
		 buttons  =  new CustomButton[8]  ;
		 listeners = new ButtonListener[8] ;
		 new Thread (){ 
			@Override 
			public void run (){
		 allocateThreads() ;
			init3(G4)  ;
		init4(G4)  ; } 
		 }.start() ; 
        }catch(IllegalArgumentException|
		NullPointerException  exp ){
            exp.printStackTrace();
       
		this.setFocusTraversalPolicyProvider(true);
    }
	}
  //  @Override
  public void init3(Graphics g3){
 boolean bool1 = false ; 
      grid =  new Grid(this)   ;
  layeredPane = new JLayeredPane() ;
       layeredPane.setLayout(new GridLayout());
		   layeredPane.add(grid,0 )  ;
        layeredPane.setLayer(grid,JLayeredPane.MODAL_LAYER,2);
  	        if(layeredPane.isVisible()==false){
            layeredPane.setVisible(true);
        }
        layeredPane.setBounds(new Rectangle(0,0,100,100));
        this.keyList =  new KeyList(this);
// this.createRootPane()  ;
      this.setLayeredPane((layeredPane));
       this.addKeyListener(keyList);
	   	setBounds(new Rectangle(510,510))   ; 
	setBounds(new Rectangle(500,500 ) ) ; 
	//   this.keyList.keyPressed(new KeyEvent())
  }
  public class CustomThread 
  extends Thread implements Runnable {
  	 public JButton button1 ; 
	 public Color color1 ;
	public Random random1  ;
	public int int4 ;
	public  int count = 0 ;
	 //boolean[]  array4 ; 
	 public CustomThread(JButton button2, int int5 ){
	 	random1 = new Random()  ; 
		 color1 = new Color(random1.nextInt(256) ,
		 random1.nextInt(256), random1 .nextInt(256 ) )  ;
		 button1 = button2 ;
		 int4 = int5 ;
	 }
	 public CustomThread(JButton button2 ,Color color2,int int5  ){
	 	random1 = new Random()  ; 
		color1 = color2  ; 
		button1 = button2 ;
		int4= int5 ;
	 }
	 public   Color computeOpposite(Color color1){
	 	int digit1 = color1.getRed() ;
		int digit2 = color1.getGreen(); 
		int digit3 = color1.getBlue() ; 
		Color color2 =
		 new Color(256-digit1,256-digit2,256-digit3)  ;
		 return color2 ;
	 }
	 @Override
	 public void run(){  
	//	new Thread( )
color1 = computeOpposite(color1) ;
if(int4>=0 ){
array1[int4] = true  ;
}
button1.setBackground(color1) ;
	//	count = count+1 ;
	//	count4  =  count4  +  1 ;
	//	System.out.println(count4) ; 
	 }
	
  }
  public void allocateThreads(){
     buttons[0] = new 	CustomButton(this,"Snake Color Change ",20 ,50 )  ;
     buttons[1]= new CustomButton(this,"Snake  Phase Length " ,20  , 50 ) ;
     buttons[2] = new CustomButton(this,"Activate The Bot " ,20 , 50 ) ;
     buttons[3] = new CustomButton(this,"Snake Velocity  " , 20  , 50 ) ; 
	  listeners[0] = new ButtonListener(this,buttons[0] ,new Color(150,150,150 ),false )  ;
       listeners[1] = new ButtonListener(this,buttons[1], new  Color(180,180,180  ) ,true ) ;
	  listeners[2] = new ButtonListener(this,buttons[2],  new Color(60,80,100),false)  ;
	  listeners[3] = new ButtonListener(this,buttons[3], new Color(150,200,250 ),true ) ;
	    threads[0] = new CustomThread(buttons[0],buttons[0].color1,1 ) ; 
   threads[1] = new CustomThread(buttons[1],buttons[1].color1,0 )  ;
    threads[2] = new CustomThread(buttons[2], buttons[2].color1,2)  ;
     threads[3]   =   new   CustomThread(buttons[3], buttons[3].color1,-1) ; 
listeners[0].thread1 = threads[0]  ;
listeners[1].thread1 = threads[1] ;
listeners[2].thread1  =  threads[2]  ;
listeners[3].thread1 = threads [3]  ;
  threads[5]        = new Thread(){
	@Override 
	public void run(){
	init3(G4) ;
	  if(listeners[3].flip ==0 ){
	  	listeners[3].flip =listeners[3].flip ;
	  }
	grid.snake.velocity   =  listeners[3].flip ; 
	grid.lapse  =   listeners[1].flip ;
	//start = true ;
	validateArray()  ;
	restore() ; 
	} 
}   ; 
      threads[4]   = new Thread(){
	@Override
	public void run(){ 
		int size1 = array1.length ; 
		for(int c=0;c<size1 ;c++ ){
			array1[c]  =   false ;
		}
		listeners[1].flip = 0 ; 
		listeners[3].flip = 0 ; 
       buttons[1].setLabel(listeners[1].string4.concat(new String(":0"))) ;
	   buttons[3].setLabel(listeners[3].string4.concat(new String(":0"))) ;	
	}     
    }  ;
  }    
  public void restore(){
  	Container cont1 = getContentPane() ; 
    setAutoRequestFocus(true) ;  
	requestFocus()  ;  
	grid.addKeyListener(keyList) ;   
	threads[4].run() ;
		System.out.println("Compile") ;
  }
public synchronized void init4(Graphics g4){
//	new Thread (){
	//	@Override 
	//	public void run () {
	 newPane = new JLayeredPane() ;	 
	 	   GridLayout layout1 = new GridLayout(3,2) ;
	 initialisePane(newPane,new Rectangle(0,0,50,50), new Color 
	 (100,160,100),new Dimension(50,50), layout1 )  ;   
	newPane.setLayer(buttons[0],JLayeredPane.POPUP_LAYER,1)  ; 
	 JButton button5  = new   JButton("Reset " )  ;
		button5.setBackground(new Color(150,180,210) )  ;
		listeners[4] = new ButtonListener(present,button5 , new Color(120,160,180  ) ,false) ;
		listeners[4].thread1  =   threads[4]   ;
	   JButton button6 = new JButton("Continue " ) ;
button6.setBackground(new Color (200,240,200)  )   ;   
      listeners[5] = new ButtonListener(present,button6, new Color(160,200,240 ),false  )  ; 
listeners[5].thread1   =     threads[5]   ;
buttons[3].setBounds(10,10,50,50) ; 
		newPane.add(buttons[0]) ;
	   newPane.add(buttons[1]) ;
	   newPane.add(buttons[2] ) ;
	   newPane.add(buttons[3]) ;
	   newPane.add(button5 )  ; 
	   newPane.add(button6  )  ; 
		present.setLayeredPane(newPane) ;
			setBounds(new Rectangle(510,510))   ; 
	setBounds(new Rectangle(500,500 ) ) ; 
    // 	} // }.start() ; 
}
public void validateArray(){
		 grid.array1[0] = array1[0]  ;
		 grid.array1[1]  =  array1[1]  ;
		 if(array1[2] 
		 ==true ){
		 	thread8  =  new SnakeBot(this ) ;
		 }
		 else{
		 	thread8 = null ;
		 }
		 threads[7] = thread8 ;
}
@Override 
    public void update(Graphics f){
	//if(newPane)
	if(newPane!=null){
		newPane.repaint() ;
		newPane.update(f) ;
		}
		if(layeredPane!=null){
		layeredPane.repaint() ; 
		layeredPane.update(f) ;
		}
		if(grid!=null){	
		if(grid.suspend==false){
		grid.update(f) ;
		}
	}
	//	this.update(f) ;
    }
	
		public void increment(){
		Container cont1 =  this.getLayeredPane() ; 
	    LayoutManager layout4 = cont1.getLayout() ;  
		if(!layout4.getClass() .
		 equals(GridLayout.class  )){
			return  ;
		}
		GridLayout layout1 = (GridLayout)layout4  ;
		int size1 = layout1.getRows() ; 
		int size2 = layout1.getColumns() ; 
		Component[] comp1 = cont1.getComponents() ; 
		int size3 = comp1.length  ; 
		CustomButton button1  =  null ;
		if(size3==(size1*size2)){
			if(size1>size2){
				layout1 = new GridLayout(size1,size2+1) ;
				button1 = new CustomButton(this,"This is a Custom Button ", 
				size2* layout1.getHgap(), 0,layout1.getHgap(), layout1.getVgap()) ;
			}
			else{
				layout1 = new GridLayout(size1+1,size2) ;
				button1 = new CustomButton(this, "This is a custom button ", 
				0 , size1 * layout1.getVgap() ,layout1.getHgap (), layout1.getVgap()) ;
			}
		}
		else{
		if(size2==size1){
			 button1 = new CustomButton
		(this, "This is a new Button ",(size3%size2)	*layout1.getHgap(),(size1-1)*
		layout1.getVgap(),layout1.getHgap(),layout1.getVgap()) ;
		}
		else {
			button1 = new CustomButton(this,"This is a new Button ", (size2-1)*layout1.getHgap() , 
			(size3%size1) * layout1.getVgap() , layout1.getHgap(), layout1.getVgap() ) ;
			
		}
		}
		cont1.setLayout(layout1) ;
		cont1.removeAll() ;
		Component comp2 = comp1[0] ;
		for(int c=0 ;c<size3;c++){
			comp2= comp1[c] ;
			if(comp2!=null){
				cont1.add(comp2, c) ;
			}
		}
		cont1.add(button1,size3 )  ;
	}
}