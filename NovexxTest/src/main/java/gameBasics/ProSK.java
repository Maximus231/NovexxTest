package gameBasics;

public class ProSK extends ClassicSK {
	public void watchTV(String channel) {
		System.out.println("Watching TV, channel "+channel);
	}
	public boolean heatFood (double amountOfFood) {
		try {
		// call ammount of food here and check is it not more in method calling than it is
		System.out.println("Okay, "+amountOfFood+"units of food is heating...");
		return true;
		} catch (Exception e) {
			//call an exception here
			System.out.println("You can't heat this amount of food: "+amountOfFood+
					" because you don't have it. Try to heat a bit less.");
			return false;
		}
	}
	@Override
	public String canDo() {
		return "This SK can play music, make a light, heat food and show TV";
	}
}
