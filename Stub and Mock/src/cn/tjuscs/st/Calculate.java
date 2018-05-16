package cn.tjuscs.st;

public class Calculate {
	public int add(int a, int b){
		return a + b;
	}
	
	public int minus(int a, int b){
		return a - b;
	}
	
	public int divide(int a, int b){
		return a/b;
	}
	
	public int multipy(int a, int b){
		return a*b;
	}
	
	public void testException(int a){
		if (a > 1) {
			try {
				throw new MyException("测试异常！");
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
	}

}
