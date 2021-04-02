
public class AtackOn extends Magic{
	AtackOn(int magicCost) {
		super(magicCost);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	void cast(Monster playerMonster, int playerMagicPoints,int index) {
		if(playerMagicPoints<magicCost){
			return;			
		}
		
		playerMonster.setAttack(true);
		
	}
}
