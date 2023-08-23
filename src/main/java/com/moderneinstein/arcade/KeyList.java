package  com.moderneinstein.arcade ;

import java.awt.event.*;
import java.awt.event.KeyAdapter ;
import java.awt.event.KeyEvent ;
import java.awt.event.KeyListener ;
//import com.example.Snake;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ; 
import java.awt.event.MouseListener  ;
import java.awt.event.MouseEvent  ;
import java.awt.Container ; 
import java.awt.Component ;
import java.awt.Rectangle  ; 

public class KeyList extends KeyAdapter{
    public Snake snake1;
	public Game game1  ;
	public Grid grid1 ;
	public  KeyList lists  = this ;
    public KeyList(Snake sn1){
        this.snake1 = sn1;
    }
	public KeyList(Grid grid2){
		this.grid1  =  grid2  ;
		this.snake1 = grid2.snake ;
	}
    public KeyList(){
    //   Snake snake1 = new Snake() ; 
       this(new Snake()) ;
    }
	public  KeyList(Game game2){
		 this.game1  =  game2   ;
		 this.grid1 = game2.grid ; 
		 this.snake1  =  grid1.snake ;
	}
	public void init6(){
		game1.setLayeredPane(game1.layeredPane) ;
			 game1.requestFocus(); 
			 game1.setAutoRequestFocus(true) ;
			 grid1.suspend =  true  ;
			 	Container cont1 = game1.getContentPane() ; 
	game1.addKeyListener(game1.keyList) ;   
	game1.threads[4].run() ;
	}
    @Override
    public void keyPressed(KeyEvent event1){
        //System.out.println(e.getKeyCode())
		int digit1 =  event1.getID();
		int digit2  = event1.getKeyCode()  ;
		String  str4   =    event1.paramString()  ;
		//Object obj1  = event1.getSource()  ;
		int digit3   = event1.getKeyCode()  ;
        switch(digit2){
            case KeyEvent.VK_UP:
            this.snake1.direction[0]=0;
            this.snake1.direction[1]=-1;
            break;
            case KeyEvent.VK_DOWN:
            this.snake1.direction[0]=0;
            this.snake1.direction[1]=1;
            break;
            case KeyEvent.VK_LEFT:
            this.snake1.direction[0]=-1;
            this.snake1.direction[1]=0;
            break;
            case KeyEvent.VK_RIGHT:
            this.snake1.direction[0]=1;
            this.snake1.direction[1]=0;
            break;
			case KeyEvent.VK_SPACE :
			boolean bool3  = !(this.grid1.suspend) ;
			bool3 = true ;
		this.grid1.suspend =  bool3  ;
		KeyListener listener2 = game1.keyList ;
		//this.grid.
		//  System.out.println(bool3)  ;
			break ;
			case KeyEvent.VK_ENTER :
			boolean bool4  = false ;
			this.grid1.suspend =  bool4 ;
			this.game1.start = true ;
			break ;
			case KeyEvent.VK_SHIFT :
			this.grid1.suspend = true ;
			//game.grid = new Grid() ;
		  //	game1.layeredPane.remove(grid1) ;
		 //  KeyList lists  = this ;
		  new Thread (){
			@Override 
			public void run( ) {
		  game1.init4(game1.G4) ;  
		  game1.setBounds(new Rectangle(510,510))   ; 
	      game1.setBounds(new Rectangle(500,500 ) ) ; 
		//  game1.addKeyListener(lists)  ;
		} }.run( ) ;
		  break  ;  
			case KeyEvent.VK_ESCAPE :
			new Thread( ){
				@Override
				public void run( ){
			 Container cont1 = game1.getLayeredPane() ; 
			 if(cont1.equals(game1.newPane)) {
				grid1.snake.velocity  = game1.listeners[1].flip ; 
				grid1.lapse = game1.listeners[3].flip ;
				validateArray() ;
				init6() ;
			 }
			 game1.setBounds(new Rectangle(510,510))   ; 
			 game1.setBounds(new Rectangle(500,500 ) ) ; } }.start( ) ; 
			 break ;
            default:
            break;
        }
    }
	public void validateArray(){
		 grid1.array1[0] = game1.array1[0]  ;
		 grid1.array1[1]  =  game1.array1[1]  ;
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
    public void keyTyped(KeyEvent event1){
        //System.out.println(e.getKeyCode());
		int digit1 =  event1.getID();
		int digit2  = event1.getKeyCode()  ;
		String  str4   =    event1.paramString()  ;
		//Object obj1  = event1.getSource()  ;
		int digit3   = event1.getKeyCode()  ;
        switch(digit2){
            case KeyEvent.VK_UP:
            this.snake1.direction[0]=0;
            this.snake1.direction[1]=-1;
            break;
            case KeyEvent.VK_DOWN:
            this.snake1.direction[0]=0;
            this.snake1.direction[1]=1;
            break;
            case KeyEvent.VK_LEFT:
            this.snake1.direction[0]=-1;
            this.snake1.direction[1]=0;
            break;
            case KeyEvent.VK_RIGHT:
            this.snake1.direction[0]=1;
            this.snake1.direction[1]=0;
            break;
			case   KeyEvent.VK_SPACE  :
			boolean bool2  = !(this.grid1.suspend) ;
		//	 this.grid1.suspend  = bool2  ;
  		// System.out.println(bool2)  ;
			 break   ;
            default:
            break;
    }
} 
    @Override
     public void keyReleased(KeyEvent event1){
        //System.out.println(e.getKeyCode()); 
		int digit1 =  event1.getID();
		int digit2  = event1.getKeyCode()  ;
		String  str4   =    event1.paramString()  ;
		//Object obj1  = event1.getSource()  ;
		int digit3   = event1.getKeyCode()  ;
        switch(digit2){
            case KeyEvent.VK_UP:
            this.snake1.direction[0]=0;
            this.snake1.direction[1]=-1;
            break;
            case KeyEvent.VK_DOWN:
            this.snake1.direction[0]=0;
            this.snake1.direction[1]=1;
            break;
            case KeyEvent.VK_LEFT:
            this.snake1.direction[0]=-1;
            this.snake1.direction[1]=0;
            break;
            case KeyEvent.VK_RIGHT:
            this.snake1.direction[0]=1;
            this.snake1.direction[1]=0;
            break;
			case KeyEvent.VK_SPACE  :
			boolean bool1 = !(this.grid1.suspend) ;
	  //	this.grid1.suspend = bool1 ;
	 //  System.out.println(bool1)  ;
			break ; 
            default:
            break;
        }
    }
}
