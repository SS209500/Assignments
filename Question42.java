package assignment;

class Laptop{
	int price;
	String details;
	public Laptop(String details,int price) {
		this.price=price;
		this.details=details;
	}
}

class Afford{
	public String checkConfiguration(Laptop laptop) throws Exception{
		String[] s=laptop.details.split("/");
		int ram=Integer.parseInt(s[0]);
		int hardDisk=Integer.valueOf(s[1]);
		if(laptop.price>70000) {
			throw new LaptopException("Price too high");
		}
		else if(ram<8){
			throw new LaptopException("Minimum 8 RAM required");
		}
		else if(hardDisk<256) {
			throw new LaptopException("Minimum 256 space required");
		}
		else if(s[2].equals("HDD")) {
			throw new LaptopException("SSD required");
		}
		else {
			return "Can be purchased";
		}
	}
	
	public String purchaseLaptop(Laptop laptop) throws Exception{
		try {
			checkConfiguration(laptop);
		} 
		catch (LaptopException e) {
			return "Change configuration";
		}
		catch(Exception e) {
			return "other exception";
		}
		return "Perfect configuration";
	}
}

class LaptopException extends Exception{
	public LaptopException(String msg) {
		super(msg);
	}
}

public class Question42 {

	public static void main(String[] args) throws Exception{
		Laptop laptop=new Laptop("8/512/SSD", 58000);
		Afford af=new Afford(); 
		String s=af.checkConfiguration(laptop);
		String t=af.purchaseLaptop(laptop);
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());
	}

}
