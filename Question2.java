package assignment;

class Material {
	public int mass;
	public int temperature;

	public Material(int mass, int temperature) {
		this.mass = mass;
		this.temperature = temperature;
	}

	public String flowOfHeat() throws Exception {
		try {
			checkMaterial();
		} catch (MaterialException e) {
			return "Invalid Material";
		} catch (Exception e) {
			return "Other exception";
		}
		return "Both in equilibrium";
	}

	public String checkMaterial() throws Exception {
		if (mass < 0) {
			throw new MaterialException("Mass cannot be negative");
		} else if (mass == 0) {
			throw new MaterialException("Mass cannot be zero");
		}
		else {
			return "Valid material";
		}
	}
}

class MaterialException extends Exception {
	public MaterialException(String msg) {
		super(msg);
	}
}

public class Question2 {

	public static void main(String[] args) throws Exception {
		Material m = new Material(-1, 32);
		String s = m.flowOfHeat();
		System.out.println(s);
	}

}
