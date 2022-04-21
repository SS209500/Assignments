package assignment;
import java.util.ArrayList;

class Validator{
	public String checkComment(String comment) throws Exception{
		String[] s=comment.split(" ");
		ArrayList<String> arr=new ArrayList<>();
		arr.add("abcde");
		arr.add("lmno");
		arr.add("pqrst");
		arr.add("wxyz");
		int i=0;
		for(String c:s) {
			for(String d:arr)
			if(c.equals(d)) {
				i++;
			}
		}
		if(comment.contains("abdce")||comment.contains("lmno")||comment.contains("pqrst")||comment.contains("wxyz")) {
			throw new SpamCommentException("spam comment");
		}
		else if(i>1) {
			throw new SpamCommentException("account ban due to spam comment");
		}
		else {
			return "comment is not spam";
		}
	}
	public String commentTheString(String comment) throws Exception{
		try {
			checkComment(comment);
		} 
		catch (SpamCommentException e) {
			e.getMessage();
		}
		catch (Exception ex) {
			return "other exception";
		}
		return "comment posted";
	}
}

class SpamCommentException extends Exception{
	public SpamCommentException(String msg) {
		super(msg);
	}
}


public class Question5 {
	public static void main(String[] args) throws Exception{
		Validator obj=new Validator();
		System.out.println(obj.checkComment("hello my name is Steve"));
		System.out.println(obj.commentTheString("my comment is safe to post"));
	}
}
