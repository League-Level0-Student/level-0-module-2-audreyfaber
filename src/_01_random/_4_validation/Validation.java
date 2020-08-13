//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int i = 0; i <10; i++) {
			
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "You are really good at coding!");
}

if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "You are very kind!");
}

if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You are very fun to be around!");
}

if(randomNumber==4) {
	JOptionPane.showMessageDialog(null, "You are so smart!");
}

if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "You have the best smile");
}

		}





		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
