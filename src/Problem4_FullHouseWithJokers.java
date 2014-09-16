import java.util.ArrayList;

//In most Poker games, the "full house" hand is defined as three cards of
//the same face + two cards of the same face, other than the first, 
//regardless of the card's suits. The cards faces are "2", "3", "4", "5",
//"6", "7", "8", "9", "10", "J", "Q", "K" and "A". The card suits are 
//"♣", "♦", "♥" and "♠". A special card "Joker" (denoted as "*") is used
//as wildcard and can replace any other card. Jokers do not have a suite.
//Jokes can be used several times in a hand. Write a program to generate
//and print all full houses and print their number.

public class Problem4_FullHouseWithJokers {

public static void getAllCards(ArrayList<String> cards){
		
		//The card suits are "♣","♦", "♥" and "♠".
		for(int index = 0;index < 4;index++){
			String suits = "";
			if(index == 0){
				suits = "♣";
			}else if(index == 1){
				suits = "♦";
			}else if(index == 2){
				suits = "♥";
			}else if (index == 3){
				suits = "♠";
			}
			//The cards faces are "2", "3", "4", "5",
			//"6", "7", "8", "9", "10", "J", "Q", "K".
			for(int i = 2;i <= 14;i++){
				String faceIndexCards = String.valueOf(i);
				switch(faceIndexCards){
				case "11":faceIndexCards = "J";break;
				case "12":faceIndexCards = "Q";break;
				case "13":faceIndexCards = "K";break;
				case "14":faceIndexCards = "A";break;
				default:break;
				}
				cards.add(faceIndexCards + suits);
			}
			cards.add("*");
		}
	}
	public static void main(String[] args) {
	
		ArrayList<String> allCards = new ArrayList<>();
		getAllCards(allCards);
		
		int countFullHouse = 0;
		for(int card1 = 0;card1 < allCards.size();card1++){
			for(int card2 = card1 + 1;card2 < allCards.size();card2++){
				for(int card3 = card2 + 1;card3 < allCards.size();card3++){
					for(int card4 = 0;card4 < allCards.size();card4++){
						for(int card5 = card4 + 1;card5 < allCards.size();card5++){
							
							if(  ( ((allCards.get(card1).charAt(0)) ==
									(allCards.get(card2).charAt(0)) )||
									(allCards.get(card1).charAt(0)) == '*')
									&&
									(( (allCards.get(card2).charAt(0)) ==
									(allCards.get(card3).charAt(0)) )||
									(allCards.get(card2).charAt(0)) == '*')
									&&
									(( (allCards.get(card3).charAt(0)) ==
									(allCards.get(card1).charAt(0)) )||
									(allCards.get(card3).charAt(0)) == '*')
									&&
									(( (allCards.get(card4).charAt(0)) != 
									(allCards.get(card1).charAt(0)) )||
									(allCards.get(card4).charAt(0)) == '*')
									&&
									(( (allCards.get(card4).charAt(0)) ==
									(allCards.get(card5).charAt(0)) )||
									(allCards.get(card5).charAt(0)) == '*')){
										System.out.printf("(%s%s%s%s%s)\n",
												allCards.get(card1),
												allCards.get(card2),
												allCards.get(card3),
												allCards.get(card4),
												allCards.get(card5)
												);
										countFullHouse++;
							}
									
						}
					}
				}
			}
		}	
		
		System.out.print(countFullHouse + " full houses");
	}	
}

//Example:
//Output
//(2♣ 2♦ 2♥ 3♣ 3♦) … (2♣ 2♦ 2♥ 3♣ 3♦) … (2♣ 2♦ 2♥ 3♣ 3♥) … (2♣ 2♦ 2♥ 3♣ *) …
//(2♣ * * 3♣ *) … (A♠ A♥ A♦ K♠ K♣) … (A♦ A♥ A♠ * *) … (* * * * *)
//119808 full houses

