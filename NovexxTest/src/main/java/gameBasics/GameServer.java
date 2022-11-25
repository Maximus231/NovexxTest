package gameBasics;
import java.util.*;
public class GameServer {
	//for subscriber's list I use collection -> set
	//to avoid duplicate values while sending info
	// ... and it's a bit more interesting than using array
	private HashSet<User> subscribersList = new HashSet<User>();
	public void subscribe(User user) {
		subscribersList.add(user);
	}
	public void unsubscribe (User user) {
		subscribersList.remove(user);
	}
	public void sendInfo (String info) {
		System.out.println("Sending info...");
		Iterator<User> i = subscribersList.iterator();
        while (i.hasNext())
            System.out.println("Message <"+info+"> has been sent to user <"+i.next().getName()+">");
	}

}
