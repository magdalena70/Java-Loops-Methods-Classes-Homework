import java.util.Locale;
import java.util.Scanner;

//Write a method to convert from degrees to radians. Write a method to
//convert from radians to degrees. You are given a number n and n queries
//for conversion. Each conversion query will consist of a number +
//space + measure. Measures are "deg" and "rad". Convert all radians to
//degrees and all degrees to radians. Print the results as n lines,
//each holding a number + space + measure. Format all numbers with 6 digit
//after the decimal point. 

public class Problem5_AngleUnitConverterDegrees_Radians { 	

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		double[] value = new double[n];
		String[] measure = new String[n];
		
		for(int i = 0;i < n;i++){
			String inputValue = sc.nextLine();
			String[] inputValueArr = inputValue.split(" ");
		    value[i] = Double.parseDouble(inputValueArr[0]);
			measure[i] = inputValueArr[1];
			String currentMeasure = measure[i];
			
			if(currentMeasure.charAt(0) == 'd'){
				//use the formula degrees to radians: 
				//"x"degrees * (pi/180) = radians
				double rad = (value[i] * (Math.PI/180));
				System.out.printf("%6f rad", rad);
				System.out.println();
			}else if(currentMeasure.charAt(0) == 'r'){
				//use the formula radians to degrees: 
				//"x" radians * (180/pi) = degrees
				double deg = (value[i] * (180/Math.PI));
				System.out.printf("%6f deg", deg);
				System.out.println();
			}
		}
	}
}
//Examples:
//Input		  Output		
//3							
//180 deg	  3.141593 rad		        
//90 deg	  1.570796 rad		        
//3 rad		  171.887339 deg				
//							   						

