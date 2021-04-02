
public class War extends Magic{
	War(int magicCost) {
		super(magicCost);
		// TODO Auto-generated constructor stub
	}

	@Override
	void cast(Monster playerMonster, int playerMagicPoints,int index) {
		if(playerMagicPoints<magicCost){
			return;			
		}
		
		playerMonster.setAttackPoints(playerMonster.getAttackPoints()*2);
		
	}
}
