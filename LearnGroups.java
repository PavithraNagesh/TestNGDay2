package week6.day2;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups="Insane")
	public void run() {
		System.out.println("Dog is chasing");
	}
	@Test
	public void stop() {
		System.out.println("Looking for help");
	}
	@Test(groups="Insane")
	public void dog() {
		System.out.println("Insane State");
	}
}
