package marshmellows.controller;

import marshmellows.model.MarshmallowMonster;
import marshmellows.view.MarshmallowOutput;

public class MonsterController
	{
		private MarshmallowMonster alexMonster;
		private MarshmallowOutput myOutput;
		public MonsterController()
		{
			int eyes = 3;
			double legs = 8;
			double hair = 8;
			int noses = 1;
			boolean hasBellyButton = true;
			String name = "MR Spidder";
			int Stinger = 1;
			
			myOutput = new MarshmallowOutput();
			alexMonster = new MarshmallowMonster(name, eyes, noses,hair,legs,hasBellyButton, Stinger);
			
		}
		public void start()
		{
			myOutput.displayMonsterInfo(alexMonster.toString());
		}
	}
  