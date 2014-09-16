import java.util.Scanner;

//Write a program to generate and print all symmetric numbers in given
//range [start…end] (0 ≤ start ≤ end ≤ 999). A number is symmetric if
//its digits are symmetric toward its middle.
//For example, the numbers 101, 33, 989 and 5 are symmetric,
//but 102, 34 and 997 are not symmetric. 

public class Problem1_SymmetricNumbersInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//Enter two integers from single line separated by a space
		String[] twoNumbers = sc.nextLine().split(" ");
		int start = Integer.parseInt(twoNumbers[0]);
		int end = Integer.parseInt(twoNumbers[1]);
		
		for(int i = start;i <= end;i++){
			if(i < 10){
				System.out.print(i + " ");
			}else if((i > 9 && i < 100)&&(i % 10 == i / 10 )){
				System.out.print(i + " ");
			}else if((i > 99 && i < 1000)&&(i % 10 == i /100)){
				System.out.print(i + " ");
			}
		}
		
	}

}
//Input 	  Output
//5 11	      5 6 7 8 9 11
//101 110	  101
//555 777	  555 565 575 585 595 606 616 626 636
//            646 656 666 676 686 696 707 717 727 
//            737 747 757 767 777

