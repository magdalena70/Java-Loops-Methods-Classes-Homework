
import java.util.Random;
import java.util.Scanner;


//Write a program to generate n random hands of 5 different cards 
//form a standard suit of 52 cards. 

public class Problem6_RandomHandsOf5Cards {

	public static void main(String[] args) {
		
		   @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
           int n = in.nextInt();
          
           String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
           String[] suit = { "♣", "♦", "♥", "♠" };
          
           Random random = new Random();
           int randomNum = 0;
          
           for (int k = 0; k < n; k++) {  
                   for (int i = 0; i < 5; i++) {
                           randomNum = random.nextInt((12 - 0) + 1) + 0;
                           System.out.print(cards[randomNum]);
                           randomNum = random.nextInt((3 - 0) + 1) + 0;
                           System.out.print(suit[randomNum]+" ");         
                   }
                   System.out.println();
           }
   }
}
//Example:
//Input        Output:
//5            Q♣ J♦ 6♠ 6♣ A♥
//			   4♦ 7♣ 8♦ 9♣ 3♦
//             10♣ 8♥ 10♥ A♣ Q♥
//             2♥ 2♠ 2♣ 8♠ J♦
//             J♣ 10♦ J♠ A♠ K♥