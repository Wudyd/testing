package cn.tjuscs.stack;

public class MyStack {
	private String[] elements;
	private int nextIndex;
	
	//构造方法，elements共有100个元素
	public MyStack()
	{
		elements = new String[100];
		nextIndex = 0;
	}
	
	//push方法，当超过100个时程序抛出越界异常
	public void push(String element) throws Exception{
		if (100 == nextIndex){
			throw new Exception("越界异常！");
		}
		
		elements[nextIndex++] = element;
	}
	
	//pop方法，当为0个时程序抛出越界异常
	public String pop() throws Exception
	{
		if(0== nextIndex)
		{
			throw new Exception("越界异常！");
		}
		return elements[--nextIndex];
	}
	
}
