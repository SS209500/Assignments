package assignment;

import java.util.ArrayList;

class WalkingBoy{
	public int stepSize;
	public int blockSize;
	public WalkingBoy(int stepSize,int blockSize) {
		this.stepSize=stepSize;
		this.blockSize=blockSize;
	}
	
	public String targetHit(String platform) throws Exception{
		ArrayList<String> a=new ArrayList<>();
		int n=platform.length();
		for(int i=0;i<n;i=i+blockSize) {
			a.add(platform.substring(i, i+stepSize));
		}
		for(String s:a) {
			if(s.contains("x")) {
				throw new BombBlast("You hit the target");
			}
		}
		return "Win";
	}
}

class BombBlast extends Exception{
	public BombBlast(String msg){
		super(msg);
	}
}

public class Question43 {

	public static void main(String[] args) throws Exception{
		WalkingBoy boy = new WalkingBoy(2,3);
		String s=boy.targetHit("1212121x212");
		System.out.println(s);
	}

}
