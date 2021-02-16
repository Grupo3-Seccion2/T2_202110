package model.data_structures;

public class Nodo <T extends Comparable<T>>
{
	private T element;
	private Nodo<T> next;
	
	public Nodo(T e)
	{
		element = e; 
		next = null;
	}
	
	public T getElement()
	{
		return element;
	}
	
	public Nodo<T> getNext()
	{
		return next;
	}
	
	
	public void setNext(Nodo<T> n)
	{
		next = n;
	}
}
