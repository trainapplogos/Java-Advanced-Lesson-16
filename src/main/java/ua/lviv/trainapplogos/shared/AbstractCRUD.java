package ua.lviv.trainapplogos.shared;

public interface AbstractCRUD <T> {
	T create(T t);
	T read (int id);
	T update(T t);
	void delete(int id);
}
