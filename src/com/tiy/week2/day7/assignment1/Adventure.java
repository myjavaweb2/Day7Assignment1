package com.tiy.week2.day7.assignment1;

import java.util.Scanner;

public class Adventure 
{
	private String[] storyLine = new String[5];
	private String[] followUpOnOptionA = new String[5];
	private String[] followUpOnOptionB = new String[5];
	private String[] followUpOnOptionC = new String[5];
	private String[] followUpOnOptionD = new String[5];
	private Scanner sc = new Scanner(System.in);
	
	public Adventure()
	{
		storyLine[0] = "a) Yes, Russia should be banned from the Rio Olympics.";
		storyLine[1] = "b) No, Russia should not be banned from the Rio Olympics.";
		storyLine[2] = "c) Yes, Russia should be banned but some of the Russia athletes" +
						"\t should be allowed to participate in the Rio Olympics under stateless status.";
		storyLine[3] = "d) No comment";	
		
		followUpOnOptionA[0] = "a) Because Russia have been violating the IOC drug rules many times.";
		followUpOnOptionA[1] = "b) Because other countries that violated the IOC drug rules were also banned before.";
		followUpOnOptionA[2] = "c) Because the IOC needs to stand firmly on its rules to deterrent others from violating its rules.";
		followUpOnOptionA[3] = "d) I do not have any reason for my answer and I am done.";
		
		followUpOnOptionB[0] = "a) Because Russia is not the only country that is violating the IOC drug rules.";
		followUpOnOptionB[1] = "b) Because other countries that violated the IOC drug rules were not banned before.";
		followUpOnOptionB[2] = "c) Because the IOC's drug rules are not clear and consistent.";
		followUpOnOptionB[3] = "d) I do not have any reason for my answer and I am done.";		
		
		followUpOnOptionC[0] = "a) Because some of the Russian athletes are innocent and therefore should not be penalized.";
		followUpOnOptionC[1] = "b) Because other athletes from other countries are also violating the IOC drug rules.";
		followUpOnOptionC[2] = "c) Because the IOC is not consistent in how it applies its drug rules on individual athletes.";
		followUpOnOptionC[3] = "d) I do not have any reason for my answer and I am done.";
		
		followUpOnOptionD[0] = "a) Because I do not have any interest in the Rio Olympics.";
		followUpOnOptionD[1] = "b) Because I do not care what the IOC do with Russia.";
		followUpOnOptionD[2] = "c) Because I have other important things to worry about than worrying about the Olympics.";
		followUpOnOptionD[3] = "d) I do not have any reason for my answer and I am done.";
	}
	
	public void writeAdventure()
	{
		boolean whileWritingText = true;
		
		while (whileWritingText)
		{			
			System.out.println("\n");
			
			System.out.println("Once upon a time, there is a robot that can talk and ask questions.\n" +
					 "The robot would like to ask you a question for which your answer or opinion is needed.\n" +
					 "There have been rumors that the IOC is considering whether to ban Russia from the Rio Olympics.");
			
			System.out.println("\n");
			
			System.out.println("Please select the answer from among the options presented that better reflects your opinion.");
					 
			System.out.println("a) Yes, Russia should be banned from the Rio Olympics.\n" +
						"b) No, Russia should not be banned from the Rio Olympics.\n" +
						"c) Yes, Russia should be banned but some of the Russia athletes\n" +
						"   should be allowed to participate in the Rio Olympics under stateless status.\n" +
						"d) No comment");	
			
			if (whileWritingText)
			{
				// get user selected answer
				System.out.println("Please enter the letter of the option that better reflects your reason (a, b, c, d): ");
				String selectedAnswer = sc.nextLine();
				whileWritingText =!selectedAnswer.equalsIgnoreCase("x");
					
				switch (selectedAnswer)
				{
				case "a":
					System.out.println(storyLine[0]);
					followUpOnOptionA();
					break;
				case "b":
					System.out.println(storyLine[1]);
					followUpOnOptionB();
					break;
				case "c":
					System.out.println(storyLine[2]);
					followUpOnOptionC();
					break;
				case "d":
					System.out.println(storyLine[3]);
					followUpOnOptionD();
					break;
				}
			}		
		}
		
		System.out.println("Exiting Adventure");
	}
	
	public void followUpOnOptionA()
	{
		System.out.println("\n");
		
		System.out.println("Ok, so you think that Russia should be banned from the Rio Olympics.");
		
		System.out.println("Please select the options presented below that better reflects the reason for your answer.");
				 
		System.out.println("a) Because Russia have been violating the IOC drug rules many times.\n" +
					"b) Because other countries that violated the IOC drug rules were also banned before.\n" +
					"c) Because the IOC needs to stand firmly on its rules to deterrent others from violating its rules.\n" +
					"d) I do not have any reason for my answer and I am done.");
		
		// get user selected answer
		System.out.println("Please enter the letter of the answer that better reflects your choice (a, b, c, d): ");
		String selectedAnswer = sc.nextLine();
			
		switch (selectedAnswer)
		{
		case "a":
			System.out.println(followUpOnOptionA[0]);
			break;
		case "b":
			System.out.println(followUpOnOptionA[1]);
			break;
		case "c":
			System.out.println(followUpOnOptionA[2]);
			break;
		case "d":
			System.out.println(followUpOnOptionA[3]);
			break;
		}
	}
	
	public void followUpOnOptionB()
	{
		System.out.println("\n");
		
		System.out.println("Ok, so you think that Russia should not be banned from the Rio Olympics.");
		
		System.out.println("Please select the options presented below that better reflects the reason for your answer.");
				 
		System.out.println("a) Because Russia is not the only country that is violating the IOC drug rules.\n" +
					"b) Because other countries that violated the IOC drug rules were not banned before.\n" +
					"c) Because the IOC's drug rules are not clear and consistent.\n" +
					"d) I do not have any reason for my answer and I am done.");
		
		// get user selected answer
		System.out.println("Please enter the letter of the answer that better reflects your choice (a, b, c, d): ");
		String selectedAnswer = sc.nextLine();
			
		switch (selectedAnswer)
		{
		case "a":
			System.out.println(followUpOnOptionB[0]);
			break;
		case "b":
			System.out.println(followUpOnOptionB[1]);
			break;
		case "c":
			System.out.println(followUpOnOptionB[2]);
			break;
		case "d":
			System.out.println(followUpOnOptionB[3]);
			break;
		}
	}
	
	public void followUpOnOptionC()
	{
		System.out.println("\n");
		
		System.out.println("Ok, so you think that Russia should be banned from the Rio Olympics.\n" +
					"However, you feel that some of its athletes should be allowed to participate" + 
					"in the Rio Olympics under stateless status");
		
		System.out.println("Please select the options presented below that better reflects the reason for your answer.");
				 
		System.out.println("a) Because some of the Russian athletes are innocent and therefore should not be penalized.\n" +
					"b) Because other athletes from other countries are also violating the IOC drug rules.\n" +
					"c) Because the IOC is not consistent in how it applies its drug rules on individual athletes.\n" +
					"d) I do not have any reason for my answer and I am done.");
		
		// get user selected answer
		System.out.println("Please enter the letter of the answer that better reflects your choice (a, b, c, d): ");
		String selectedAnswer = sc.nextLine();
			
		switch (selectedAnswer)
		{
		case "a":
			System.out.println(followUpOnOptionC[0]);
			break;
		case "b":
			System.out.println(followUpOnOptionC[1]);
			break;
		case "c":
			System.out.println(followUpOnOptionC[2]);
			break;
		case "d":
			System.out.println(followUpOnOptionC[3]);
			break;
		}
	}
	
	public void followUpOnOptionD()
	{
		System.out.println("\n");
		
		System.out.println("Ok, so you do not have any comment. But can you state why you do not have any comment?");
		
		System.out.println("Please select the options presented below that better reflects the reason for your answer.");
				 
		System.out.println("a) Because I do not have any interest in the Rio Olympics.\n" +
					"b) Because I do not care what the IOC do with Russia.\n" +
					"c) Because I have other important things to worry about than worrying about the Olympics.\n" +
					"d) I do not have any reason for my answer and I am done.");
		
		// get user selected answer
		System.out.println("Please enter the letter of the answer that better reflects your choice (a, b, c, d): ");
		String selectedAnswer = sc.nextLine();
			
		switch (selectedAnswer)
		{
		case "a":
			System.out.println(followUpOnOptionD[0]);
			break;
		case "b":
			System.out.println(followUpOnOptionD[1]);
			break;
		case "c":
			System.out.println(followUpOnOptionD[2]);
			break;
		case "d":
			System.out.println(followUpOnOptionD[3]);
			break;
		}
	}
	
	public static void main(String[] args) 
	{
		Adventure story = new Adventure();
		story.writeAdventure();
	}
}
