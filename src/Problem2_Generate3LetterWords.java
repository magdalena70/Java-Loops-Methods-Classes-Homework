import java.util.Scanner;

//Write a program to generate and print all 3-letter words consisting
//of given set of characters. For example if we have the characters 'a'
//and 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa",
//"bab", "bba" and "bbb". The input characters are given as string at
//the first line of the input. Input characters are unique
//(there are no repeating characters). 

public class Problem2_Generate3LetterWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] inputStr = sc.nextLine().split("");
		
		for(int a = 0;a < inputStr.length;a++){
			for(int b = 0;b < inputStr.length;b++){
				for(int c = 0;c < inputStr.length;c++){
					System.out.print(inputStr[a]+inputStr[b]+inputStr[c]+" ");
				}
			}
		}
	}

}
//Input	  Output
//x	      xxx
//ab	  aaa aab aba abb baa bab bba bbb
//abx	  aaa aab aax aba abb abx axa axb axx
//        baa bab bax bba bbb bbx bxa bxb bxx
//        xaa xab xax xba xbb xbx xxa xxb xxx

