package cn.tjuscs.st.dao;

public interface IDao<T> {
	public void add(T t);
	public void delete(String username);
	public T load(String username);

}
