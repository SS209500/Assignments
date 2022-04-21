package assignment;

class Racer{
	public String action;
	public int runScore;
	public int jumpScore;
	public int crawlScore;
	public Racer(String action, int runScore, int jumpScore, int crawlScore) {
		this.action=action;
		this.runScore=runScore;
		this.jumpScore=jumpScore;
		this.crawlScore=crawlScore;
	}
	
	public String goodAt() {
		int count_j=0;
		int count_c=0;
		for(int i=0;i<action.length();i++) {
			if(action.charAt(i)=='j') {
				count_j++;
			}
			else if(action.charAt(i)=='c') {
				count_c++;
			}
		}
		
		if(count_c==count_j) {
			return "Perfect";
		}
		else if(count_j>count_c) {
			return "Jumper";
		}
		else {
			return "Crawler";
		}
	}
	
	public int finalScore() {
		int count_j=0;
		int count_c=0;
		int count_r=0;
		for(int i=0;i<action.length();i++) {
			if(action.charAt(i)=='j') {
				count_j++;
			}
			else if(action.charAt(i)=='c') {
				count_c++;
			}
			else if(action.charAt(i)=='r') {
				count_r++;
			}
		}
		
		return count_c*crawlScore+count_j*jumpScore+count_r*runScore;
	}
}






public class Question23 {
	public static void main(String[] args) {
		Racer racer=new Racer("jjccrrj",10,20,30);
		System.out.println(racer.goodAt());
		//System.out.println(racer.finalScore());
	}
}
