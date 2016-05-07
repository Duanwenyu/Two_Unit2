public class SeqList implements List {
	final int defaultSize = 10;
	int maxSize; // 线性表长度
	int size; // 线性表现有的元素个数
	Object[] listArray;

	// 无参构造方法
	SeqList() {
		initiate(defaultSize);
	}

	// 带线性表长度的构造方法
	SeqList(int size) {
		initiate(size);
	}

	// 初始化方法，设置线性表长度，现有元素个数和初始化对象数组
	public void initiate(int sz) {
		maxSize = sz;
		size = 0;
		listArray = new Object[sz];
	}

	// 指定下标位置插入元素
	public void insert(int i, Object obj) throws Exception {
		if (size == maxSize) {
			throw new Exception("线性表已满，无法插入!");
		}
		// 不允许隔着一个空位置插入
		if (i > size) {
			throw new Exception("插入下标位置错误！");
		}
		// 将插入位置后的元素全部后移
		for (int j = size; j > i; j--) {
			listArray[j] = listArray[j - 1];
		}
		// 插入数据元素，并增加线性表中现有元素的个数
		listArray[i] = obj;
		size++;
	}

	// 删除指定下标位置下的元素
	public Object delete(int i) throws Exception {
		if (size == 0) {
			throw new Exception("线性表已空，无法删除！");
		}
		if (i > size - 1) {
			throw new Exception("删除下标位置错误！");
		}
		// 获得被删除的数据元素
		Object it = listArray[i];
		// 将删除后的元素全部前移
		for (int j = i; j < size - 1; j++) {
			listArray[j] = listArray[j + 1];
		}
		// 返回被删除数据元素，并减少线性表中现有的元素个数
		size--;
		return it;
	}

	// 替换指定下标位置的数据元素
	public void update(int i, Object obj) throws Exception {
		if (size == 0) {
			throw new Exception("线性表已空，无法替换！");
		}
		if (i > size - 1) {
			throw new Exception("替换下标位置错误！");
		}
		// 替换指定下标的数据元素
		listArray[i] = obj;
	}

	// 获取指定下标位置的数据元素
	public Object getData(int i) throws Exception {
		if (size == 0) {
			throw new Exception("线性表已空，无法获取！");
		}
		if (i >= size) {
			throw new Exception("获得下标位置错误！");
		}
		return listArray[i];
	}

	// 实现获取线性表数据元素的个数
	public int size() {
		return size;
	}

	// 实现判断线性表是否为空
	public boolean isEmpty() {
		return size == 0;
	}

}
