package gameBasics;

import org.testng.annotations.Test;

import org.testng.Assert;

import gameBasics.User.Levels;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class UserTest {
	//private final Map<String, byte[]> toHexStringData = new HashMap<String, byte[]>();
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	private User user = new User("Val",23,Levels.MASTER);

	@Test
	public void getAgeTest() {
		Assert.assertEquals(23, user.getAge());
	}

	@Test
	public void getNameTest() {
		Assert.assertEquals("Val", user.getName());
	}

}
