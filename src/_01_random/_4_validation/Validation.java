//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
for(int n=0;n<10;n++){		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "You're really smart!");
} else if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "You're really strong!");
} else if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You're a really nice person!");
} else if (randomNumber==4) {
	JOptionPane.showMessageDialog(null, "You aren't gullible!");
} else if (randomNumber==5) {
	JOptionPane.showMessageDialog(null, "You're a great coder!");
} else if (randomNumber==0) { 
	JOptionPane.showMessageDialog(null, "You get through the modules fast!");
}
		// 2. Repeat all the code above 10 times
	
		// 3. Find someone to test out your program. They will like it :)
	}
}
}

