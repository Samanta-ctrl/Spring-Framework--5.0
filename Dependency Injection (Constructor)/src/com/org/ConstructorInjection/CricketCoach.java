package com.org.ConstructorInjection;

public class CricketCoach implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fs;
	
	//define a parameterized constructor for dependency injection
	public CricketCoach(FortuneService fs) //constructor 
	{
		System.out.println("CricketCoach: parameterized constructor for constructor injection");
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "practice in net and then do an YOYO test";
	}

	@Override
	public String getDailyFortune() 
	{
		return  "Just do it: "+fs.getFortune();
	}
}
