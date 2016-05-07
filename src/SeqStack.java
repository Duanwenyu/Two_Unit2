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

	//ʵ�ְ�����ѹ��ջ   ��ջ
	public void push(Object obj) throws Exception {
		if(top==maxStackSize){
			throw new Exception("��ջ������");
		}
		//��ջ  ջ����Ǽ�1
		stack[top]=obj;
		top++;
	}

	//ʵ�ֻ�ȡ��ɾ��ջ��Ԫ������   ��ջ
	public Object pop() throws Exception {
		if(top==0){
			throw new Exception("��ջ�ѿ�!");
		}
		//������ջ����Ԫ�أ�ջ����Ǽ�1ʵ��ɾ����ʵ�ʲ�û��ɾ��_
		top--;
		return stack[top];
	}

	//ʵ�ֻ�ȡ����ɾ��ջ������Ԫ��
	public Object getTop() throws Exception {
		if(top==0){
			throw new Exception("��ջ�ѿգ�");
		}
		return stack[top-1];
	}

	//ʵ���ж�ջ�Ƿ�Ϊ��
	public boolean notEmpty() {
		return (top>0);
	}

}
