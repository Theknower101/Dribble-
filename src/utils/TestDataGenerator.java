package utils;

import java.util.Random;

public class TestDataGenerator {
	static Random rand=new Random();
public static String getRandomEmail() {
	String []email= {"AhmadAllan@gmail.com","AliMohammad@gmail.com","MohammadAlmoqdad@gmail.com"};
	int emailIndex=rand.nextInt(email.length);
	return email[emailIndex];
}
}
