package com.org.ConstructorInjection;

public class HockeyCoach  implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fs;
	
	//define a parameterized constructor for dependency injection
	public HockeyCoach(FortuneService fs) 
	{
		System.out.println("HockeyCoach: parameterized constructor for constructor injection");
		this.fs = fs;
	}
	@Override
	public String getDailyWorkout()
	{
		return "practice in field";
	}

	@Override
	public String getDailyFortune() 
	{
		return null;
	}
}
