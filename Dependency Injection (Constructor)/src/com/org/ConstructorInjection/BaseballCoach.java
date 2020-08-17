package com.org.ConstructorInjection;

public class BaseballCoach implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fs;
	
	//define a parameterized constructor for dependency injection
	public BaseballCoach(FortuneService fors)
	{
		System.out.println("BaseballCoach: parameterized constructor for constructor injection");
		this.fs=fors;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minuits on batting practice";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my FortuneService to give a fortune
		return fs.getFortune();
	}
}
