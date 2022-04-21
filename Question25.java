package assignment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum Specialty1{
	ENGINEER,MANAGER,DEVOPS
}

class Specialist1{
	private String name;
	private BigDecimal salary;
	private Specialty1 specialty;
	public Specialist1(String name, BigDecimal salary,Specialty1 specialty) {
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
	public void setSpecialty(Specialty1 specialty) {
		this.specialty = specialty;
	}
	public Specialty1 getSpecialty() {
		return specialty;
	}
}

class Implementation2{

	class SortByName implements Comparator<Specialist1>{

		public int compare(Specialist1 o1, Specialist1 o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
		public List<Specialist1> filterBySpecialty(List<Specialist1> specialists, Specialty1 specialty){
		List<Specialist1> l1=new ArrayList<>();
		for(Specialist1 s:specialists) {
			if(s.getSpecialty()==specialty) {
				l1.add(s);
			}
		}
		return l1;
	}
	
	public List<Specialist1> sortSpecialistsByNameAsc(List<Specialist1> specialists){
		List<Specialist1> l2=new ArrayList<>(specialists);
		Collections.sort(l2,new SortByName());
		return l2;
	}
}



public class Question25 {
	public static void main(String[] args) {
		List<Specialist1> list = Arrays.asList(
				new Specialist1("Ivan Ivanov", new BigDecimal(5000), Specialty1.ENGINEER),
				new Specialist1("Sergey Sergeev", new BigDecimal(3000), Specialty1.DEVOPS),
				new Specialist1("Petr Petrov", new BigDecimal(10000), Specialty1.MANAGER));
		Implementation2 imp=new Implementation2();
		List<Specialist1> a1=imp.filterBySpecialty(list,Specialty1.ENGINEER);
		List<Specialist1> a2=imp.sortSpecialistsByNameAsc(list);
		for(Specialist1 s:a1) {
			System.out.println(s.getName()+" "+s.getSalary()+" "+s.getSpecialty());
		}
		for(Specialist1 s:a2) {
			System.out.println(s.getName()+" "+s.getSalary()+" "+s.getSpecialty());
		}
		
	}
}
