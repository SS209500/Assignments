package assignment;

class Problem1{
	int credits;
	String type;
	public Problem1(int credits,String type) {
		this.credits=credits;
		this.type=type;
	}
}

class Checker1{
	public String checkProblem(Problem1 p) throws Exception{
		if(p.credits<10) {
			throw new ProblemException1("Insufficient credits");
		}
		else if(p.type.equals("String")) {
			throw new ProblemException1("String problem found");
		}
		else if(p.type.equals("Generic")) {
			throw new ProblemException1("Generic problem found");
		}
		else if(p.type.equals("I/O")) {
			throw new ProblemException1("I/O problem found");
		}
		else {
			return "Exception problem found";
		}
	}
	
	public String approveProblem(Problem1 p){
		try {
			checkProblem(p);
		} 
		catch (ProblemException1 e) {
			return "Not approved";
		}
		catch(Exception e) {
			return "Other exception";
		}
		return "Problem approved";
	}
}


class ProblemException1 extends Exception{
	public ProblemException1(String msg) {
		super(msg);
	}
}

public class Question44 {
	public static void main(String[] args) throws Exception{
		Problem1 p=new Problem1(41,"Exception");
		Checker1 c=new Checker1();
		String s = c.checkProblem(p);
		String t= c.approveProblem(p);
		System.out.println(s);
		System.out.println(t);
	}
}