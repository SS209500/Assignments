package assignment;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

enum Specialty{
	ENGINEER,MANAGER,DEVOPS
}

class Specialist{
	private String name;
	private BigDecimal salary;
	private Specialty specialty;
	public Specialist(String name, BigDecimal salary,Specialty specialty) {
		this.name=name;
		this.salary=salary;
		this.specialty=specialty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	public Specialty getSpecialty() {
		return specialty;
	}
}

class Implementation1{
	
	public Specialist findWithMaxSalary(List<Specialist> specialists){
		BigDecimal max=new BigDecimal("00");
		Specialist Max=new Specialist(null, max, null);
		for(Specialist s:specialists) {
			if(s.getSalary().compareTo(max)>0) {
				max=s.getSalary();
				Max=s;
			}
		}
		return Max;
	}
	
	public boolean matchAllEngineers(List<Specialist> specialists){
		for(Specialist s:specialists) {
			if(!(s.getSpecialty()==Specialty.ENGINEER)) {
				return false;
			}
		}
		return true;
	}
	
}


public class Question24 {

	public static void main(String[] args) {
		List<Specialist> list = Arrays.asList(
				new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER),
				new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS),
				new Specialist("Petr Petrov", new BigDecimal(10000), Specialty.MANAGER));
		Implementation1 imp=new Implementation1();
		System.out.println(imp.findWithMaxSalary(list).getSalary()+" "+imp.findWithMaxSalary(list).getName());
		System.out.println(imp.matchAllEngineers(list));
		
	}

}
