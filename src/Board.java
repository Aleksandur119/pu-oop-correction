import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;


public class Board extends JFrame {

	
	
	boolean player1=true;
	
	int turn=1;
	
	int playerMagicPoints[]={10,10};
	
	
	int boardArray[][]=new int[12][12];
	
	Board(){
		initBoard();
	initBoardWithMonster(true);
	initBoardWithMonster(false);
	
	
	}
	
	
	public void init(){
		this.setSize(new Dimension(1024,728));
		
		this.setVisible(true);
		
		
		
	}
	public void initBoardWithMonster(boolean player1){
		Random r =new Random();
		for(int i=0;i<5;i++){
			
			if(!player1){
				boardArray[i][boardArray.length-1]=r.nextInt(Resourse.MONSTER_ATTACK.length);	
				boardArray[i][boardArray.length-1]*=10;
			}else{
				boardArray[i][0]=r.nextInt(Resourse.MONSTER_ATTACK.length);	
			}
		}
		
		
	}
	
	
	
	
	
	
	
	public void initBoard(){
		
		for(int i=0;i<boardArray.length;i++){
			for(int j=0;j<boardArray[i].length;j++){
				
				boardArray[i][j]=0;
				
			}
			
			
			
		}
		
}
	
	
	
	
	
 public void drawSquare(int x,int y,Graphics g){
	 g.setColor(Color.WHITE);
	 g.fill3DRect(x, y, Resourse.BOARD_WIDTH, Resourse.BOARD_HEIGHT, true);
	 
	 
 }

	public void paint(Graphics g){
		super.paint(g);
		
		for(int i=0;i<boardArray.length;i++){
			for(int j=0;j<boardArray[i].length;j++){
				
				if(boardArray[i][j]==0){
					drawSquare(i*Resourse.BOARD_WIDTH,j*Resourse.BOARD_HEIGHT+32,g);
					
				}else{
					
					int x =boardArray[i][j];
					Color c;
					if(x>=10){
						c=Resourse.player2Colors[x/10];
						x=x/10;
					}else{
						c=Resourse.colors[x];
					}
					
					new Monster(x,Resourse.MONSTER_ATTACK[x],Resourse.MONSTER_DEFECE[x]
							,Resourse.MONSTER_MAGIC[x],Resourse.MONSTER_SPEED[x],
							Resourse.MONSTER_NAME[x]).paint(g, c,i*Resourse.BOARD_WIDTH,j*Resourse.BOARD_HEIGHT);
				}
				
			}
		}
		
		
		

	}
	
}
