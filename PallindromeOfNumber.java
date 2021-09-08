package week1day2;

public class PallindromeOfNumber {
	public static void main(String[] args) {
		int number = 656;
		int temp=number;
		int rem;
		int que;
		int result =0;
		
		
		
		
		while(number!=0) {
			rem=number%10;
			result= result*10+rem;
			que=number/10;
			number=que;
			
			
	}
		if(result==temp) {
			System.out.println("pallinder");
			
			
		}
		else {
		
	   System.out.println("not pallinder");
			
		}
			
		}
}
	


