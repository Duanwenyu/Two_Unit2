
public interface List {
	//����
	public void insert(int i,Object obj)throws Exception;
	//ɾ��
	public Object delete(int i)throws Exception;
	//�滻
	public void update(int i,Object obj)throws Exception;
	//��ȡ�±�λ��Ԫ��
	public Object getData(int i)throws Exception;
	//��ȡԪ�ظ���
	public int size();
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty();
}
