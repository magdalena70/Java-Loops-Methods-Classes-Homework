import java.util.HashSet;
import java.util.Scanner;

//You are a given string in a single line. Assume “words” are all
//sequences of Latin letters. For example in the input string
//"java..?|basics/*-+=javabasics" we have 3 words:
//"java", "basics"and "javabasics".
//Write a program to find in the input string all unique sets of 3 “words”
//{a, b, c}, such that a|b = c. Assume that "a|b" means to concatenate
//the “word” b after a. We call these “words” {a, b, c} cognate words.
//For example in the input string "java..?|basics/*-+=javabasics"
//we have one cognate: java|basics=javabasics.
//Notes: All “words” must be case sensitive!
//Don't repeat the cognate words in the output.
//The input comes from the console. It hold a single text line –
//the input string.
//The input data will always be valid and in the format described.
//There is no need to check it explicitly.
//Print at the console all cognate words {a, b, c} found in the input
//sequence in format "a|b=c" (without any spaces), each at a separate line.
//The order of the output lines is not important.Print "No" in case
//no cognate words exist among the input sequence of characters.

public class Problem12_CognateWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		String[] strArr = inputStr.split("[^A-Za-z]+");
		// verification of the resulting array
		// for (String str : strArr) {
		// System.out.print(str + " ");
		// }

		HashSet<String> resultStr = new HashSet<>();
		for (int first = 0; first < strArr.length; first++) {
			for (int second = 0; second < strArr.length; second++) {
				for (int third = 0; third < strArr.length; third++) {

					if (first != second) {

						if ((strArr[first] + strArr[second])
								.equals(strArr[third])) {

							resultStr.add(strArr[first] + "|" + strArr[second]
									+ "=" + strArr[third]);
						}
					}
				}
			}
		}
		if (resultStr.isEmpty()) {
			System.out.print("No");
		} else {
			for (String result : resultStr) {
				System.out.println(result);
			}
		}
	}
}
