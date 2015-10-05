package marshmellows.controller;

import marshmellows.model.MarshmallowMonster;
import marshmellows.view.MarshmallowOutput;
import marshmellows.view.PopupMonsterDisplay;

import java.util.Scanner;
public class MonsterController
	{
		private PopupMonsterDisplay myPopups;
		private MarshmallowMonster alexMonster;
		private MarshmallowMonster userMonster;
		private MarshmallowMonster myTestMonster;
		private MarshmallowOutput myOutput;
		private Scanner monsterScanner;

		public MonsterController()
		{
			int eyes = 1;
			int noses = 0;
			int Stinger = 2;
			double legs = 20;
			double hair = 2.5;
			boolean hasBellyButton = true;
			String name = "Lord Destructor";
			
			
			monsterScanner = new Scanner(System.in);
			myOutput = new MarshmallowOutput();
			myPopups = new PopupMonsterDisplay();
			alexMonster = new MarshmallowMonster(name, eyes, noses,hair,legs,hasBellyButton, Stinger);
			
		}
		
		public void start()
		{
			myOutput.displayMonsterGUI(alexMonster.toString());
			//myOutput.displayMonsterConsole(alexMonster.toString());
			//myOutput.displayMonsterGUI(alexMonster.toString());
			//myOutput.displayMonsterAdGUI(alexMonster.toString());
			//myOutput.displayNotVirusGUI(null);
			//makeUserMonster();
			//myOutput.displayMonsterGUI("New Monster Info " + userMonster.toString());
			makePopupMonster();
			//myOutput.displayMonsterGUI("New Monster Info " + popupMonster.toString());
			
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
			
			System.out.println("Type in the number of Noses your monster has");
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
		
		private void makePopupMonster()
		{
			
			String popupName = myPopups.grabAnswer("type in a name for your monster");
			myPopups.showResponce("You typed in: " + popupName);
			
			String tempEyes = myPopups.grabAnswer("Type in the number of eyes for your monster");
			int popupEyes;
			
			while(!isInteger(tempEyes))
			{
				tempEyes = myPopups.grabAnswer("type in a real integer for the number of eyes");
			}
			
			if(isInteger(tempEyes))
			{
				popupEyes = Integer.parseInt(tempEyes);
			}
			else
			{
				popupEyes = -99;
			}
			
			myPopups.showResponce("You typed " + popupEyes);
			
			String tempNoses = myPopups.grabAnswer("Type in the number of Noses for your monster");
			int popupNoses;
			
			while(!isInteger(tempNoses))
			{
				tempNoses = myPopups.grabAnswer("type in a real integer for the number of Noses");
			}
			
			if(isInteger(tempNoses))
			{
				popupNoses = Integer.parseInt(tempNoses);
			}
			else
			{
				popupNoses = -99;
			}
			
			myPopups.showResponce("You typed " + popupNoses);
			
			String tempStinger = myPopups.grabAnswer("Type in the number of Stingers for your monster");
			int popupStinger;
			
			while(!isInteger(tempStinger))
			{
				tempStinger = myPopups.grabAnswer("type in a real integer for the number of stingers");
			}
			
			if(isInteger(tempStinger))
			{
				popupStinger = Integer.parseInt(tempStinger);
			}
			else
			{
				popupStinger = -99;
			}
			
			myPopups.showResponce("You typed " + popupStinger);
			
			String tempLegs = myPopups.grabAnswer("Type in the number of legs your monster has");
			double popupLegs;
			
			while(!isDouble(tempLegs))
			{
				tempLegs = myPopups.grabAnswer("Type in a real number for the number of legs your monster has");
			}
			
			if(isDouble(tempLegs))
			{
				popupLegs = Double.parseDouble(tempLegs);
			}
			else
			{
				popupLegs = -99;
			}
			myPopups.showResponce("You typed " + popupLegs);
			
		}
		private boolean isInteger(String input)
		{
			Boolean isInt = false;
			
			try
			{
				int temp = Integer.parseInt(input);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.showResponce("not an int - bad value will be used");
			}
			return isInt;
		}
		private boolean isDouble(String input)
		{
			Boolean isDouble = false;
			
			try
			{
				double temp = Double.parseDouble(input);
				isDouble = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.showResponce("not a double - bad value will be used");
			}
			
			return isDouble;
		}
	}
