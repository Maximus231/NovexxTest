package gameBasics;

public abstract class SurvivalKit {
	public int knife = 1;
	public double food = 10.0;
	public String canDo() {
		return "Nothing. Because object can't be created from abstract class";
	}
	public void makeMusic(String songName) {
		System.out.println ("Playing a music... Track: "+songName);
	}
}
