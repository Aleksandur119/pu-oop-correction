
public class HealTheWorld extends Magic {

	HealTheWorld(int magicCost) {
		super(magicCost);
		// TODO Auto-generated constructor stub
	}

	@Override
	void cast(Monster playerMonster, int playerMagicPoints,int index) {
		if(playerMagicPoints<magicCost){
			return;			
		}
		
		playerMonster.setMp(Resourse.MONSTER_MAGIC[index]);
		
	}

}
