package assignment;

class Food{
	String plate;
	int numberOfSoldiers;
	public Food(String plate, int numberOfSoldiers) {
		this.plate=plate;
		this.numberOfSoldiers=numberOfSoldiers;
	}
}

class KhumbhKaran{
	public String getReadyToFight(Food food) throws Exception{
		String specialCharacters="`~!@#$%^&*()-_=+[]{};':\"><,.?/\\";
		for(int i=0;i<food.plate.length();i++) {
			if(specialCharacters.contains(Character.toString(food.plate.charAt(i)))) {
				throw new FoodException("Insect found in the food");
			}
			else if(Character.isAlphabetic(food.plate.charAt(i))) {
				throw new FoodException("Not edible");
			}
		}
		if(food.numberOfSoldiers<1000) {
			throw new FoodException("Food was not sufficient");
		}
		else {
			return "Ready for the war";
		}
	}
	
	public String winTheWar(Food food) {
		try {
			getReadyToFight(food);
		} 
		catch (FoodException e) {
			return "No war";
		}
		catch (Exception e) {
			return "Other exception";
		}
		return "Here the battle starts";
	}
}

class FoodException extends Exception{
	public FoodException(String msg) {
		super(msg);
	}
}

public class Question41 {

	public static void main(String[] args) throws Exception{
		Food f = new Food("1234", 70000);
		KhumbhKaran v = new KhumbhKaran();
		String s = v.getReadyToFight(f);
		String t = v.winTheWar(f);
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());
	}

}
