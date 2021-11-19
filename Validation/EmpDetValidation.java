package springbootbeanfiles;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmpDetValidation {
	
	@NotNull(message="Enter a Number")
    @Min(value=1,message="Number must be positive")
	int eno;
	
	@NotEmpty(message="Please Enter Your Ename!")
    @Size(min=2,max=30,message="Name length between 2 to 30 characters")
	String ename;
	
	@NotNull(message="Enter Age")
    @Min(value=18,message="Age must be equal or greater than 18")
	int age;

	@NotEmpty(message="Please Enter Your Mobile no.!")
   // @Pattern(regexp="\\\\d{3}[-\\\\.\\\\s]\\\\d{3}[-\\\\.\\\\s]\\\\d{4}",message="Enter a valid number")
    @Pattern(regexp="^(\\+\\d{1,2}\\s?)?1?\\-?\\.?\\s?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$",message="Enter a valid number")
    String phone;
	
	@NotEmpty(message="Please Enter Your Department!")
    @Pattern(regexp="Admin|IT|Sales|Purchase",message="Department must be Admin|IT|Sales|Purchase")
	String dept;
	
	@NotNull(message="Enter a date.")
	 @Past(message="date of birth must be less than today")  
	@DateTimeFormat( pattern="dd-mm-yyyy")
	  Date date;
	 
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@NotEmpty(message="Please select the country!")
	 String country;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}



	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
