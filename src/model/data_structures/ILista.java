package model.data_structures;

public interface ILista <T extends Comparable<T>>
{
	public void addFirst(T elem);
	
	public void addLast(T elem);
	
	public void insertElement(T elem, int pos);
	
	public T removeFirst();
	
	public T removeLast();
	
	public T deleteElement(int pos);
	
	public T firstElement();
	
	public T lastElement();
	
	public T getElement(int pos);
	
	public int size();
	
	public boolean isEmpty();
	
	public int isPresent(T element);
	
	public void exchange(int pos1, int pos2);
	
	public void changeElement(int pos, T elem);
}
