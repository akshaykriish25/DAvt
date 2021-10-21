package Java8Avtday2;

class City implements Cloneable{
	String city;
	public City(String city) {
		this.city=city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
class Country{
	String country;
	public Country(String country) {
		this.country=country;
	}
}
class Person implements Cloneable
{
String name;
int income;
City cityobj;
Country countryobj;

public Person(String name, int income, City cityobj, Country countryobj) {
	super();
	this.name = name;
	this.income = income;
	this.cityobj = cityobj;
	this.countryobj = countryobj;
}

@Override
public String toString() {
	return name+" "+income+" "+cityobj.city+" "+countryobj.country;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	Person ob = (Person)super.clone();
	ob.cityobj = (City)cityobj.clone();
	return ob;
}

}
public class cloneAvt2 {

	public static void main(String[] args) throws Exception {
		City c1 = new City("Coimbatore");
		Country c11 = new Country("India");
		Person p1 = new Person("Sam",20000,c1,c11);
		
		Person p2;
		p2 = (Person)p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		
		p2.countryobj.country = "America";
		p2.cityobj.city="Mexico";
		System.out.println(p1);
		System.out.println(p2);
	}

}
