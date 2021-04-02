import java.awt.Color;
import java.awt.Graphics;

public class Monster {

	int attackPoints;
	int defencePoints;
	int mp;
	float speed;
	String name;
	
	int index;
	
	boolean canAttack;
	
	
	Monster(int index,int attackPoints,int defencePoints,int mp,float speed,String name){
		this.index=index;
		this.attackPoints=attackPoints;
		this.defencePoints=defencePoints;
		this.speed=speed;
		this.mp=mp;
		this.name=name;
		
		
	}
	public void setAttack(boolean canAttack){
		this.canAttack= canAttack;
	}
	public boolean getCanAttack(){
		return canAttack;
	}
	
	public int getIndex(){
		return index;
	}
	
	public void paint(Graphics g,Color c,int x,int y){
		g.setColor(c);
		g.fill3DRect(x, y+32,Resourse.BOARD_WIDTH,Resourse.BOARD_HEIGHT,true);
	

	}
	
	public int getAttackPoints() {
		return attackPoints;
	}



	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}



	public int getDefencePoints() {
		return defencePoints;
	}



	public void setDefencePoints(int defencePoints) {
		this.defencePoints = defencePoints;
	}



	public int getMp() {
		return mp;
	}



	public void setMp(int mp) {
		this.mp = mp;
	}



	public float getSpeed() {
		return speed;
	}



	public void setSpeed(float speed) {
		this.speed = speed;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
}
