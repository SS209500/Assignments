package assignment;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
}

class Classroom{
	public String registerStudent(Student student) {
		int j=0;
		for(int i=0;i<student.name.length();i++) {
			if(Character.isUpperCase(student.name.charAt(i))) {
				j++;
			}
		}
		if(j!=student.name.length()) {
			return "Block letters needed";
		}
		else if(!(student.score>=0 && student.score<=100)) {
			return "Invalid score";
		}
		else {
			return "Registered";
		}
	}
	public String studentCard(String card) {
		int j=0;
		for(int i=0;i<card.length();i++) {
			if(Character.isDigit(card.charAt(i))) {
				j++;
			}
		}
		if(j!=card.length()) {
			return "Invalid card";
		}
		else {
			return "Valid card";
		}
	}
}



public class Question39 {
	public static void main(String[] args) {
		Student s1=new Student("A",6);
		Classroom cm=new Classroom();
		System.out.println(cm.registerStudent(s1));
	}
}
