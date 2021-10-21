package Java8Avtday1;

public class lambdaAvt2 {

	public static void main(String[] args) {
		Runnable r1 = () -> {   
	         System.out.println("Runnable with Lambda Expression");
	      };
	      new Thread(r1).start();	 
	}

}
