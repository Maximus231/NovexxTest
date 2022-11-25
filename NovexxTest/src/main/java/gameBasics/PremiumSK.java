package gameBasics;

public class PremiumSK extends ProSK {
	public static void startFly(double speed) {
		System.out.println("You are flying! That's amazing! Yor speed is "+speed+"kmph");
	}
	public void stopFly() {
		System.out.println("You have landed. Hope, it was a nice flight!");
	}
	@Override
	public void makeMusic(String songName) {
		System.out.println ("Playing a music with Spotify... Track is: "+songName);
	}
	@Override
	public String canDo() {
		return "This SK can fly, play music through Spotify, make a light, heat food and show TV";
	}
	public PremiumSK(User user) {
		if (user.getLevel() != User.Levels.MASTER) {
			System.out.println("User <"+user.getName()+"> does not have permissions to have Premium SK! Operation terminated.");
			System.exit(0);			
		}
	}
}
