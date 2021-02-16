package model.data_structures;

public class Lista <T extends Comparable<T>> implements ILista<T>
{

	private Nodo<T> first;
	private Nodo<T> last;
	private int size;
	
	public Lista()
	{
		first = null;
		last = null;
		size = 0;
	}
	@Override
	public void addFirst(T elem) 
	{
		Nodo<T> nuevo = new Nodo<T>(elem);
		if (first == null)
		{
			first = nuevo;
			last = nuevo;
		}
		else
		{
			nuevo.setNext(first);
			first = nuevo;
		}
		size++;
	}

	@Override
	public void addLast(T elem) 
	{
		Nodo<T> nuevo = new Nodo<T>(elem);
		if (first == null)
		{
			first = nuevo;
			last = nuevo;
		}
		else
		{
			last.setNext(nuevo);
		}
		size++;
	}

	@Override
	public void insertElement(T elem, int pos) 
	{
		Nodo<T> nuevo = new Nodo<T>(elem);
		if(pos== size)
		{
			addLast(elem);
		}
		else
		{
			Nodo<T> anterior = first;
			
		}
	}

	@Override
	public T removeFirst() 
	{
		Nodo<T> eliminado = first;
		if(first != null)
		{
			
		}	
		return eliminado.getElement() ;
	}

	@Override
	public T removeLast() 
	{
		
		return null;
	}

	@Override
	public T deleteElement(int pos) 
	{
		
		return null;
	}

	@Override
	public T firstElement() {
		
		return first.getElement();
	}

	@Override
	public T lastElement() {
		
		return last.getElement();
	}

	@Override
	public T getElement(int pos) 
	{
		
		return null;
	}

	@Override
	public int size() 
	{
		
		return size;
	}


	@Override
	public int isPresent(T element) 
	{
		
		return 0;
	}

	@Override
	public void exchange(int pos1, int pos2) 
	{
		
		
	}

	@Override
	public void changeElement(int pos, T elem) 
	{
		
		
	}
	
}
