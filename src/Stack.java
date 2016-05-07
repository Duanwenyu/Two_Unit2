
public interface Stack {
	//把数据元素压入栈
	public void push(Object obj)throws Exception;
	//获取并删除栈顶元素数据
	public Object pop() throws Exception;
	//获取但不删除栈顶元素数据
	public Object getTop()throws Exception;
	//判断栈是否为空
	public boolean notEmpty();
}
