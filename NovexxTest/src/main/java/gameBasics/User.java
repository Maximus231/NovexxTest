package gameBasics;

public class User {
	private String name;
	private int age;
	public enum Levels { NOOB, PRO, MASTER};
	private Levels level;
	public SurvivalKit survivalKit;
	// primitive getters and setters
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public int getAge () {
		return this.age;
	}
	public Levels getLevel () {
		return this.level;
	}
	// constructor
	public User (String userName, int userAge, Levels userLevel) {
		name = userName;
		age = userAge;
		level = userLevel;
	}
}
