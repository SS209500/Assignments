package assignment;


enum FoodType{
	VEG,NONVEG
}

class Consumer{
	private final String name;
	private final int age;
	private final FoodType foodType;
	public Consumer(String name,int age,FoodType foodType) {
		this.name=name;
		this.age=age;
		this.foodType=foodType;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public FoodType getFoodType() {
		return foodType;
	}
}

class Implementation{
	/*
	 * List<Consumer> getNonVegeterianList(List<Consumer> consumer){
	 * 
	 * } List<Consumer> sortConsumerByAge(List<Consumer> c){
	 * 
	 * }
	 */
}

public class  Question1{

}
