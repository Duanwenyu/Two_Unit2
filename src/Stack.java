
public interface Stack {
	//������Ԫ��ѹ��ջ
	public void push(Object obj)throws Exception;
	//��ȡ��ɾ��ջ��Ԫ������
	public Object pop() throws Exception;
	//��ȡ����ɾ��ջ��Ԫ������
	public Object getTop()throws Exception;
	//�ж�ջ�Ƿ�Ϊ��
	public boolean notEmpty();
}
