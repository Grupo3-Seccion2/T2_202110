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
	
	public Lista(T elem)
	{
		first = new Nodo<T>(elem);
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
			nuevo.cambiarSiguiente(first);
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
	
		}
		else
		{
			last.cambiarSiguiente(nuevo);
		}
		last = nuevo;
		size++;
	}

	@Override
	public void insertElement(T elem, int pos) 
	{
		
		if(pos== size)
		{
			addLast(elem);
		}
		else if(pos == 1)
		{
			addFirst(elem);
			
		}
		else
		{
			Nodo<T> nuevo = new Nodo<T>(elem);
			Nodo<T> anterior = first;
			int i = 1;
			
			while(anterior!= null && i!= pos)
			{
				anterior = anterior.darSiguiente();
				i++;
			}
			
			nuevo.cambiarSiguiente(anterior.darSiguiente());
			anterior.cambiarSiguiente(nuevo);
			size++;
		}
		
	}

	@Override
	public T removeFirst() 
	{
		Nodo<T> eliminado = first;
		if(first != null)
		{
			Nodo<T> nuevoPrimero = first.darSiguiente();
			first = nuevoPrimero;
		}	
		size--;
		return eliminado.darElemento() ;
	}

	@Override
	public T removeLast() 
	{
		Nodo<T> eliminado = last;
		if(last != null)
		{ 
			last = null;
		}	
		size--;
		return eliminado.darElemento() ;
	}

	@Override
	public T deleteElement(int pos) 
	{
		
		Nodo<T> eliminado = null;
		if(pos== size)
		{
			eliminado = last;
			removeLast();
		}
		else if(pos == 1)
		{
			eliminado = first;
			removeFirst();
			
		}
		else
		{
			Nodo<T> anterior = first;
			int i = 1;
			
			while(anterior!= null && i!= pos)
			{
				anterior = anterior.darSiguiente();
				i++;
			}
			eliminado = anterior.darSiguiente();
			anterior.cambiarSiguiente(anterior.darSiguiente().darSiguiente());
			size--;
		}
		
		return eliminado.darElemento();
	}

	@Override
	public T firstElement() 
	{
		
		return first.darElemento();
	}

	@Override
	public T lastElement() 
	{
		
		return last.darElemento();
	}

	@Override
	public T getElement(int pos) 
	{
		T buscado = null;
		if(pos ==1)
			buscado = first.darElemento();
		else if (pos == size)
			buscado = last.darElemento();
		else
		{
			Nodo<T> anterior = first;
			int i = 1;
		
			while(anterior!= null && i!= pos)
			{
				anterior = anterior.darSiguiente();
				i++;
			}
		}
		return buscado;
	}

	@Override
	public int size() 
	{
		
		return size;
	}


	@Override
	public boolean isEmpty() 
	{
		
		return size == 0;
	}

	@Override
	public int isPresent(T element) 
	{
		Nodo<T> actual = first;
		int pos = -1;
		int i = 1;
		while(actual!= null && pos == -1)
		{
			if (actual.darElemento().compareTo(element)==0)
				pos = i;
			actual = actual.darSiguiente();
			i++;
			
		}
		return pos;
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
