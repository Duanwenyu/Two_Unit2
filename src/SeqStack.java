public class SeqStack implements Stack {
	final int defaultSize = 10;
	int top;
	Object[] stack;
	int maxStackSize;

	public SeqStack() {
		initiate(defaultSize);
	}

	public SeqStack(int sz) {
		initiate(sz);
	}
	
	private void initiate(int sz){
		maxStackSize=sz;
		top=0;
		stack=new Object[sz];
	}

	//实现把数据压入栈   进栈
	public void push(Object obj) throws Exception {
		if(top==maxStackSize){
			throw new Exception("堆栈已满！");
		}
		//进栈  栈顶标记加1
		stack[top]=obj;
		top++;
	}

	//实现获取并删除栈顶元素数据   退栈
	public Object pop() throws Exception {
		if(top==0){
			throw new Exception("堆栈已空!");
		}
		//返回退栈数据元素，栈顶标记减1实现删除（实际并没有删除_
		top--;
		return stack[top];
	}

	//实现获取但不删除栈顶数据元素
	public Object getTop() throws Exception {
		if(top==0){
			throw new Exception("堆栈已空！");
		}
		return stack[top-1];
	}

	//实现判断栈是否为空
	public boolean notEmpty() {
		return (top>0);
	}

}
