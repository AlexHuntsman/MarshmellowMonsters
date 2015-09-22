package marshmellows.controller;

import marshmellows.model.MarshmallowMonster;
import marshmellows.view.MarshmallowOutput;
import java.util.Scanner;
public class MonsterController
	{
		private MarshmallowMonster alexMonster;
		private MarshmallowMonster userMonster;
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
			myOutput.displayMonsterConsole(alexMonster.toString());
			myOutput.displayMonsterGUI(alexMonster.toString());
			myOutput.displayMonsterAdGUI(alexMonster.toString());
			myOutput.displayNotVirusGUI(null);
			//makeUserMonster();
			myOutput.displayMonsterGUI("New Monster Info " + userMonster.toString());
			
		}
		
		private void askQuestions()
		{
			System.out.println("Type in a better name for the monster");
			String betterMonsterName = monsterScanner.next();
			alexMonster.setMonsterName(betterMonsterName);
			
			System.out.println("Type in a new amount of Eyes");
			int updatedMonsterEyes = monsterScanner.nextInt();
			alexMonster.setMonsterEyes(updatedMonsterEyes);
			
			System.out.println("Type in a new amount of Noses");
			int updatedMonsterNoses = monsterScanner.nextInt();
			alexMonster.setMonsterNoses(updatedMonsterNoses);
			
			System.out.println("Type in a new amount of Stngers");
			int updatedMonsterStinger = monsterScanner.nextInt();
			alexMonster.setMonsterStinger(updatedMonsterStinger);
			
			System.out.println("Type in a new amount of Legs");
			double updatedMonsterLegs = monsterScanner.nextDouble();
			alexMonster.setMonsterLegs(updatedMonsterLegs);
			
			System.out.println("Type in a new amount of Hairs");
			double updatedMonsterHair = monsterScanner.nextDouble();
			alexMonster.setMonsterHair(updatedMonsterHair);
			
			System.out.println("Is it true or false that the monster has a belly button? ");
			boolean updatedMonsterBellyButton = monsterScanner.nextBoolean();
			alexMonster.setMonsterBellyButton(updatedMonsterBellyButton);
		}
		/**
		 *This method will get the information to create the instance of a MarshmellowMonster. 
		 */
		private void makeUserMonster()
		{
			//Step one: Get Variables
			String userName;
			int userEyes;
			int userNoseCount;
			int userStinger;
			double userLegs;
			double userHair;
			boolean userBellyButton;
			
			//Step two Define Variables
			System.out.println("Type in a name for your monster.");
			userName = monsterScanner.nextLine();
			
			System.out.println("Type in the number of eyes for your monster");
			userEyes = monsterScanner.nextInt();
			
			System.out.println("Type in the umber of Noses your monster has");
			userNoseCount = monsterScanner.nextInt();
			
			System.out.println("Type in the number of Stingers your monster will have");
			userStinger = monsterScanner.nextInt();
			
			System.out.println("Type in the number of legs your monster has. Type in a floating point or a decimal");
			userLegs = monsterScanner.nextDouble();
			
			System.out.println("Type how much hair your monster has. Type in a floating point or a decimal");
			userHair = monsterScanner.nextDouble();
			
			System.out.println("Does your Monster have a bellybutton? Type true or false");
			userBellyButton = monsterScanner.nextBoolean();
			
			//Step three: Make a monster - use the Constructor!!! Remember order of the parameters matter!
			userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton, userStinger );
		}
	}
