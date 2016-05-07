public class SeqList implements List {
	final int defaultSize = 10;
	int maxSize; // ���Ա���
	int size; // ���Ա����е�Ԫ�ظ���
	Object[] listArray;

	// �޲ι��췽��
	SeqList() {
		initiate(defaultSize);
	}

	// �����Ա��ȵĹ��췽��
	SeqList(int size) {
		initiate(size);
	}

	// ��ʼ���������������Ա��ȣ�����Ԫ�ظ����ͳ�ʼ����������
	public void initiate(int sz) {
		maxSize = sz;
		size = 0;
		listArray = new Object[sz];
	}

	// ָ���±�λ�ò���Ԫ��
	public void insert(int i, Object obj) throws Exception {
		if (size == maxSize) {
			throw new Exception("���Ա��������޷�����!");
		}
		// ���������һ����λ�ò���
		if (i > size) {
			throw new Exception("�����±�λ�ô���");
		}
		// ������λ�ú��Ԫ��ȫ������
		for (int j = size; j > i; j--) {
			listArray[j] = listArray[j - 1];
		}
		// ��������Ԫ�أ����������Ա�������Ԫ�صĸ���
		listArray[i] = obj;
		size++;
	}

	// ɾ��ָ���±�λ���µ�Ԫ��
	public Object delete(int i) throws Exception {
		if (size == 0) {
			throw new Exception("���Ա��ѿգ��޷�ɾ����");
		}
		if (i > size - 1) {
			throw new Exception("ɾ���±�λ�ô���");
		}
		// ��ñ�ɾ��������Ԫ��
		Object it = listArray[i];
		// ��ɾ�����Ԫ��ȫ��ǰ��
		for (int j = i; j < size - 1; j++) {
			listArray[j] = listArray[j + 1];
		}
		// ���ر�ɾ������Ԫ�أ����������Ա������е�Ԫ�ظ���
		size--;
		return it;
	}

	// �滻ָ���±�λ�õ�����Ԫ��
	public void update(int i, Object obj) throws Exception {
		if (size == 0) {
			throw new Exception("���Ա��ѿգ��޷��滻��");
		}
		if (i > size - 1) {
			throw new Exception("�滻�±�λ�ô���");
		}
		// �滻ָ���±������Ԫ��
		listArray[i] = obj;
	}

	// ��ȡָ���±�λ�õ�����Ԫ��
	public Object getData(int i) throws Exception {
		if (size == 0) {
			throw new Exception("���Ա��ѿգ��޷���ȡ��");
		}
		if (i >= size) {
			throw new Exception("����±�λ�ô���");
		}
		return listArray[i];
	}

	// ʵ�ֻ�ȡ���Ա�����Ԫ�صĸ���
	public int size() {
		return size;
	}

	// ʵ���ж����Ա��Ƿ�Ϊ��
	public boolean isEmpty() {
		return size == 0;
	}

}
