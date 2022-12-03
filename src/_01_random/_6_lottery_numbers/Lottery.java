package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		Random randomMaker = new Random();
		
	JOptionPane.showMessageDialog(null, "Here are your lottery numbers!");
	
	
	JOptionPane.showMessageDialog(null, randomMaker.nextInt(50)+" "+randomMaker.nextInt(50)+" "+randomMaker.nextInt(50)+" "+randomMaker.nextInt(50)+" "+randomMaker.nextInt(50)+" "+randomMaker.nextInt(50));

}
}
