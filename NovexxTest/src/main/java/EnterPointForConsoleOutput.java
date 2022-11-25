//import gameBasics.User;
import gameBasics.*;

public class EnterPointForConsoleOutput {

	public static void main(String[] args) {
		System.out.println("Starting...");
		User tom = new User("Tom",19,User.Levels.NOOB);
		tom.survivalKit = new ClassicSK();		
		User jil = new User("Jill",21,User.Levels.PRO);
		jil.survivalKit = new ProSK();		
		User ann = new User("Anna",29,User.Levels.MASTER);
		ann.survivalKit = new PremiumSK(ann);
		
		System.out.println("User <"+tom.getName()+"> has level <"+tom.getLevel()+">. About his survival kit: "+
					tom.survivalKit.canDo());
		System.out.println("User <"+jil.getName()+"> has level <"+jil.getLevel()+">. About his survival kit: "+
					jil.survivalKit.canDo());
		System.out.println("User <"+ann.getName()+"> has level <"+ann.getLevel()+">. About his survival kit: "+
					ann.survivalKit.canDo());


		tom.survivalKit.makeMusic("Nirvana. Smoke On The Water");
		ann.survivalKit.makeMusic("ZAZ. Je veux");
		
		// exersise 2
		GameServer gs = new GameServer();
		gs.subscribe(tom);
		gs.subscribe(jil);
		gs.subscribe(ann);
		gs.sendInfo("We have a new game!");
		gs.unsubscribe(jil);
		gs.sendInfo("We have a new game!");
		

		
	}

}
