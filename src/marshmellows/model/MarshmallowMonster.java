package marshmellows.model;

public class MarshmallowMonster
	{
		private String monsterName;
		private int monsterEyes;
		private int monsterNoses;
		private double monsterHair;
		private double monsterLegs;
		private boolean monsterBellyButton;
		private int monsterStinger;
		private MarshmallowMonster()
		{
			
		}
		public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton, int monsterStinger)
		{
			this.monsterName = monsterName;
			this.monsterEyes = monsterEyes;
			this.monsterNoses = monsterNoses;
			this.monsterHair = monsterHair;
			this.monsterLegs = monsterLegs;
			this.monsterBellyButton = monsterBellyButton;
			this.monsterStinger = monsterStinger;
			
		}

	}
