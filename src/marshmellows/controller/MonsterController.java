package marshmellows.controller;

import marshmellows.model.MarshmallowMonster;
import marshmellows.view.MarshmallowOutput;
import java.util.Scanner;
public class MonsterController
	{
		private MarshmallowMonster alexMonster;
		private MarshmallowOutput myOutput;
		private Scanner monsterScanner;
		public MonsterController()
		{
			int eyes = 3;
			double legs = 8;
			double hair = 8;
			int noses = 1;
			boolean hasBellyButton = true;
			String name = "MR Spidder";
			int Stinger = 1;
			
			monsterScanner = new Scanner(System.in);
			myOutput = new MarshmallowOutput();
			alexMonster = new MarshmallowMonster(name, eyes, noses,hair,legs,hasBellyButton, Stinger);
			
		}
		public void start()
		{
			myOutput.displayMonsterInfo(alexMonster.toString());
			askQuestions();
			myOutput.displayMonsterInfo("New Monster Info" + alexMonster.toString());
		}
		private void askQuestions()
		{
			System.out.println("Type in a better name or the monster");
			String betterMonsterName = monsterScanner.next();
			alexMonster.setMonsterName(betterMonsterName);
			
		}
	}
