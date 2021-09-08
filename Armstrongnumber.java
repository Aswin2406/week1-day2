package week1day2;

public class Armstrongnumber {
	public static void main(String[] args) {
		
		int input = 153;
    	int calculater=0,remainder,original;
    	original=input;
    	
    	while (input > 0) {
    		remainder= input % 10;
    		calculater= calculater+(remainder * remainder * remainder);
    		input=input/10;
    		
    	}
    	if(original == calculater)	{
    		System.out.println("armstrongnumber");
    	}
    	else
    		System.out.println("not armstrongnumber");
    		
    	 
    	
		 
	}

}
