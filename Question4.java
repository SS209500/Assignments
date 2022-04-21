package assignment;
class Rating{
	int imdbRating;
	int nominee;
	public Rating(int imdbRating, int nominee) {
		this.imdbRating=imdbRating;
		this.nominee=nominee;
	}
}

class Validator1{
	public String canBeConsideredForTheAward(Rating rating) throws Exception{
		if(rating.imdbRating<7) {
			throw new MovieRatingException("Movie not eligible for Filmfare award");
		}
		else if(rating.nominee<4) {
			throw new MovieRatingException("Minimum 4 nominee required");
		}
		else {
			return "Considered for the award";
		}
	}
	public String sendInvite(Rating rating) throws Exception{
		try {
			canBeConsideredForTheAward(rating);
		} 
		catch (MovieRatingException e) {
			return "Not invited";
		}
		catch(Exception e) {
			return "other exception";
		}
		return "Actors and Directors Invited";
	}
}


class MovieRatingException extends Exception{
	public MovieRatingException(String msg) {
		super(msg);
	}
}

public class Question4 {

	public static void main(String[] args) throws Exception{
		Rating rating =new Rating(9,7);
		Validator1 v=new Validator1();
		String s=v.canBeConsideredForTheAward(rating);
		String t=v.sendInvite(rating);
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());
	}

}
