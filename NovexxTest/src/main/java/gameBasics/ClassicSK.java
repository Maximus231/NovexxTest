package gameBasics;

public class ClassicSK extends SurvivalKit {

	public void switchLightOn () {
		System.out.println ("Light is ON! Let's see on your secrets.");
	}
	public void switchLightOff () {
		System.out.println ("Light is OFF! U can make some wonder now.");
	}
	@Override
	public String canDo() {
		return "This SK can play music and make a light";
	}
}
