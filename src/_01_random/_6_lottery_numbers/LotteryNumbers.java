package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
	
Random ran= new Random() ;
String lottery = "" ;
for (int i = 0; i <6; i++) {
	int randomNumbers = ran.nextInt(100) ;
	lottery+=randomNumbers + (" ") ;	
	
}		
		
JOptionPane.showMessageDialog(null, lottery) ;	
		
	}		
}
