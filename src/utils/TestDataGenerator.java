package utils;

import java.util.Random;

public class TestDataGenerator {
	static Random rand=new Random();
public static String getRandomEmail(String emails[]) {
	String []email=emails;
	int emailIndex=rand.nextInt(emails.length);
	return emails[emailIndex];
}
}
