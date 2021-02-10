package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <T extends Comparable<T>> implements IArregloDinamico<T>
{
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico<String> datos;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico<String>(7);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico<String>(capacidad);
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(T dato)
	{	
		datos.agregar((String) dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public T buscar(Comparable dato)
	{
		return (T) datos.buscar((String) dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */

	public T eliminar(Comparable dato)
	{
		return (T) datos.eliminar((String) dato);
	}

	@Override
	public int darCapacidad() {
		// TODO Auto-generated method stub
		return (int) datos.darCapacidad();
	}

	@Override
	public T darElemento(int i) {
		// TODO Auto-generated method stub
		return (T) datos.darElemento(i);
	}

	@Override
	public void invertir() {
		// TODO Auto-generated method stub
		datos.invertir();
	}


}
