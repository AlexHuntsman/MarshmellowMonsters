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
		//Getters & Setters
		public String getMonsterName()
		{
			return monsterName;
		}
		
		public int getMonsterEyes()
		{
			return monsterEyes;
		}
		public int getMonsterNoses()
		{
			return monsterNoses;
		}
		public double getMonsterHair()
		{
			return monsterHair;
		}
		public double getMonsterLegs()
		{
			return monsterLegs;
		}
		public boolean getMonsterBellyButton()
		{
			return monsterBellyButton;
		}
		public int getMonsterStinger()
		{
			return monsterStinger;
		}
		
		//Setter
		public void setMonsterName(String monsterName)
		{
			this.monsterName = monsterName;
		}
		public void setMonsterEyes(int monsterEyes)
		{
			this.monsterEyes = monsterEyes;
		}
		public void setMonsterNoses(int monsterNoses)
		{
			this.monsterNoses = monsterNoses;
		}
		public void setMonsterHair(double monsterHair)
		{
			this.monsterHair = monsterHair;
		}
		public void setMonsterLegs(double monsterLegs)
		{
			this.monsterLegs = monsterLegs;
		}
		public void setMonsterBellyButton(boolean monsterBellyButton)
		{
			this.monsterBellyButton = monsterBellyButton;
		}
		public void setMonsterStinger(int monsterStinger)
		{
			this.monsterStinger = monsterStinger;
		}
		
		public String toString()
		{
			String monster = "This Monster has " + monsterEyes + " eyes, " + monsterNoses + " nose(s), and " + monsterHair + " Hairs and " + monsterLegs + " legs, and it is " + monsterBellyButton + " that he has a belly button also he has " + monsterStinger + " stinger(s), and its' name is " + monsterName;
			
			return monster;
		}

	}
