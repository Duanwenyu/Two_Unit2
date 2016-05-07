
public interface List {
	//插入
	public void insert(int i,Object obj)throws Exception;
	//删除
	public Object delete(int i)throws Exception;
	//替换
	public void update(int i,Object obj)throws Exception;
	//获取下标位置元素
	public Object getData(int i)throws Exception;
	//获取元素个数
	public int size();
	//判断是否为空
	public boolean isEmpty();
}
