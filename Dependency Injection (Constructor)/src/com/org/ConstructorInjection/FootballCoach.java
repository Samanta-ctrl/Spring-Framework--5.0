package com.org.ConstructorInjection;

public class FootballCoach  implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fs;
	
	//define a parameterized constructor for dependency injection
	public FootballCoach(FortuneService fs) 
	{
		System.out.println("FootballCoach: parameterized constructor for constructor injection");
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "try to goal within 30 minutes";
	}

	@Override
	public String getDailyFortune() 
	{
		return "Just do it: "+fs.getFortune();
	}
}
