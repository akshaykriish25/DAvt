package Java8Avtday1;


interface oper1{
	public boolean isOdd(int a);
}
interface oper2{
	public boolean isPrime(int a);
}
interface oper3{
	public boolean isPalindrome(int a);
}


public class lambdaAvt1 {

	public static void main(String[] args) {
		oper1 obj1 = (a)-> {
			return a%2!=0 ? true : false;	
		};
			
		oper2 obj2 = (a)->{
			for (int i = 2; i < a/2; i++) {  
		           if (a % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		};
			
		oper3 obj3 = (n)->{
			int temp=n,r,sum=0;
			  while(n>0){    
				   r=n%10;  
				   sum=(sum*10)+r;    
				   n=n/10;    
				  }    
				  if(temp==sum)    
				      return true; 
				  else    return false;
				       
		};
		System.out.println("isOdd: "+obj1.isOdd(5));
		System.out.println("isPrime: "+obj2.isPrime(11));
		System.out.println("isPalindrome: "+obj3.isPalindrome(454));
	}
	

}
