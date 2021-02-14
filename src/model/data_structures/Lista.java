package model.data_structures;

public class Lista <T extends Comparable<T>> implements ILista<T>
{

	private Nodo<T> first;
	private int size = 0;
	
	public Lista()
	{
		
	}
	
	public Lista(T elem)
	{
		first = new Nodo<T>(elem);
	}
	@Override
	public void addFirst(T elem) {
		Nodo<T> nuevo = new Nodo<T>(elem);
		if(first != null)
		{
			first = nuevo;
		}
		nuevo.cambiarSiguiente(first);
		
	}

	@Override
	public void addLast(T elem) {
		
		
	}

	@Override
	public void insertElement(T elem, int pos) {
		
		
	}

	@Override
	public T removeFirst() {
		
		return null;
	}

	@Override
	public T removeLast() {
		
		return null;
	}

	@Override
	public T deleteElement(int pos) {
		
		return null;
	}

	@Override
	public T firstElement() {
		
		return null;
	}

	@Override
	public T lastElement() {
		
		return null;
	}

	@Override
	public T getElement(int pos) {
		
		return null;
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public boolean isPresent() {
		
		return false;
	}

	@Override
	public int isPresent(T element) {
		
		return 0;
	}

	@Override
	public void exchange(int pos1, int pos2) {
		
		
	}

	@Override
	public void changeInfo(int pos, T elem) {
		// TODO Auto-generated method stub
		
	}
	
}
