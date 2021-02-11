package model.data_structures;

public class Nodo <T extends Comparable<T>>
{
	private T element;
	private Nodo<T> next;
	
	public Nodo(T e, Nodo<T> p, Nodo<T> n)
	{
		element = e; 
		next = n;
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
