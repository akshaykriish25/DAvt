package Java8Avtday2;

enum paper_currency{
	TEN,TWENTY,FIFTY,HUNDRED,TWOHUNDRED,THOUSAND;
}
public class enumAvt1 {
	paper_currency n;
	enumAvt1(paper_currency n){
		this.n=n;
	}
void disp() {
	switch(n) {
	case TEN:
		System.out.println("Ten");break;
	case TWENTY:
		System.out.println("Twenty");break;
	case FIFTY:
		System.out.println("Fifty");break;
	case HUNDRED:
		System.out.println("Hundred");break;
	case TWOHUNDRED:
		System.out.println("TwoHundred");break;
	case THOUSAND:
		System.out.println("Thousand");break;
	}
}
	public static void main(String[] args) {
		paper_currency[] obj = paper_currency.values();
		for(paper_currency i:obj)
			System.out.println(i);
		enumAvt1 obj1 = new enumAvt1(paper_currency.HUNDRED);
		obj1.disp();
	}

}
