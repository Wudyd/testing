package cn.tjuscs.stack;

public class CovType {
	private int t;
	
	public int getT(int x, int y){
		if (x+y>=140 && (x>=90 || y>=90 )){
			t=2;
		}
		else {
			t=3;
		}
		
		return t;
	}

}
