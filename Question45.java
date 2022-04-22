package assignment;

import java.util.ArrayList;

class Customer{
	public String name;
	public long mobile;
	public char key;
	public Customer(String name,long mobile,char key) {
		this.name=name;
		this.mobile=mobile;
		this.key=key;
	}
	
	public String encrypt() {
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==key) {
				count++;
			}
		}
		if(count>0) {
			return "Already Encrypted";
		}
		else {
			long num=mobile;
			while(num>=10) {
				num/=10;
			}
			String rep=new String(new char[(int)num]).replace('\0', key);
			return name+rep;
		}
	}
	
	public long minCount() {
		ArrayList<Long> ar=new ArrayList<>();
		long dup=mobile;
		while(dup>0) {
			ar.add(dup%10);
			dup/=10;
		}
		long min=Integer.MAX_VALUE;
		for(Long a:ar) {
			if(min>a) {
				min=a;
			}
		}
		return min;
	}
}

public class Question45 {

	public static void main(String[] args) {
		Customer customer = new Customer("Doselect", 299999992, '#');
		System.out.println(customer.encrypt());
		System.out.println(customer.minCount());
	}

}
