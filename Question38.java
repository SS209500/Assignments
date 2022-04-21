package assignment;
import java.util.Scanner;
public class Question38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		System.out.println(words.length);
		sc.close();
	}
}
