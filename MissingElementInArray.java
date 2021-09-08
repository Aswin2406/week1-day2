package week1day2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		
		int [] missing  = {2,1,4,3,6,5,8};
	     int n = missing.length+1;
	     int sum =(n*(n+1))/2; 
	     
	     Arrays.sort(missing);
	     for (int i = 0; i < missing.length; i++) {
	    	
	    	 sum = sum-missing[i];
	    		 
	    		 
	    	 
			
		}
			 System.out.println("missing number is :"+ sum);
			 
			 
			
		}
	}


