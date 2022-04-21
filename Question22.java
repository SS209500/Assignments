package assignment;

import java.util.HashMap;

class Dance{
	HashMap<String, Integer> steps=new HashMap<>();
	public String newStep(String name,int ways) {
		if(!(steps.containsKey(name))) {
			steps.put(name, ways);
			return "New step";
		}
		else {
			steps.replace(name, ways);
			return "Stepped in";
		}
	}

	public int findStep(String name) {
		if(!steps.containsKey(name)) {
			return 0;
		}
		else {
			return steps.get(name);
		}
	}
}





public class Question22 {

	public static void main(String[] args) {
		Dance obj=new Dance();
		System.out.println(obj.newStep("Step1",9 ));
		//System.out.println(obj.findStep("Step1"));
	}

}
