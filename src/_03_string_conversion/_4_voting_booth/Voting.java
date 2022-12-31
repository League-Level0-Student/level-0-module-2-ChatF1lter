package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
String voting = JOptionPane.showInputDialog(null, "How old are you?");
int votingAge = Integer.parseInt(voting);
if(votingAge>=18) {
	JOptionPane.showInputDialog(null, "Who do you think will be president?");
} else if(votingAge<18) {
	JOptionPane.showMessageDialog(null, "Literally who asked just please shut up back to the little kids table with you aren't you a little young to be talking about politics");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}