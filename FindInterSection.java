package week1day2;

import java.util.Arrays;

public class FindInterSection {
	public static void main(String[] args) {
		int []input = {3,2,11,4,6,7} ;
		int []output= {1,2,8,4,9,7};
		
		Arrays.sort(input);
		Arrays.sort(output);
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < output.length; j++) {
				if(input[i]==output[j]) {
					System.out.println(input[i]);
				}
				
			}
			
		}
		
		
	
	
	
	}}
