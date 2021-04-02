
public class DefeceUp extends Magic{

	DefeceUp(int magicCost) {
		super(magicCost);
		
	}

	@Override
	void cast(Monster playerMonster, int playerMagicPoints, int index) {
		
			if(playerMagicPoints<magicCost){
				return;			
			}
			
			playerMonster.setDefencePoints(Resourse.MONSTER_MAGIC[index]);
			
		
		
	}

}
