package model.logic;

import java.io.FileReader;
import java.io.Reader;
import java.util.Date;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;    
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.ILista;
import model.data_structures.Lista;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <T extends Comparable<T>> implements IArregloDinamico<T>
{
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico<Video> videosArreglo;
	
	private ILista<Video> videosLista;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		videosArreglo = new ArregloDinamico<>(capacidad);
		videosLista = new Lista<>();
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return videosArreglo.darTamano();
	}

	
//	/**
//	 * Requerimiento de agregar dato
//	 * @param dato
//	 */
//	public void agregar(T dato)
//	{	
//		datos.agregar((String) dato);
//	}
//	
//	/**
//	 * Requerimiento buscar dato
//	 * @param dato Dato a buscar
//	 * @return dato encontrado
//	 */
//	public T buscar(Comparable dato)
//	{
//		return (T) datos.buscar((String) dato);
//	}
//	
//	/**
//	 * Requerimiento eliminar dato
//	 * @param dato Dato a eliminar
//	 * @return dato eliminado
//	 */
//
//	public T eliminar(Comparable dato)
//	{
//		return (T) datos.eliminar((String) dato);
//	}
//
//	@Override
//	public int darCapacidad() {
//		// TODO Auto-generated method stub
//		return (int) datos.darCapacidad();
//	}
//
//	@Override
//	public T darElemento(int i) {
//		// TODO Auto-generated method stub
//		return (T) datos.darElemento(i);
//	}
//
//	@Override
//	public void invertir() {
//		// TODO Auto-generated method stub
//		datos.invertir();
//	}

	public void cargarDatosArreglo() throws NumberFormatException, ParseException
	{
		Video video = null;
		SimpleDateFormat format =new SimpleDateFormat("MM dd, yyyy");
		try
		{
			Reader in = new FileReader("");
			Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
			for(CSVRecord record : records)
			{
				video = new Video(Integer.parseInt(record.get(0)), format.parse(record.get(1)), record.get(2), record.get(3), Integer.parseInt(record.get(4)), format.parse(record.get(5)), record.get(6), Integer.parseInt(record.get(7)), Integer.parseInt(record.get(8)), Integer.parseInt(record.get(9)), record.get(10));
				videosArreglo.agregar(video);
			}
			System.out.println("Datos cargados "+ videosArreglo.darTamano());
		}
		catch (IOException e) 
		{
			System.out.println("No se encontro el archivo para cargar los datos");
		}
	}
	
	public void cargarDatosLista() throws NumberFormatException, ParseException
	{
		Video video = null;
		SimpleDateFormat format =new SimpleDateFormat("MM dd, yyyy");
		try
		{
			Reader in = new FileReader("");
			Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
			for(CSVRecord record : records)
			{
				video = new Video(Integer.parseInt(record.get(0)), format.parse(record.get(1)), record.get(2), record.get(3), Integer.parseInt(record.get(4)), format.parse(record.get(5)), record.get(6), Integer.parseInt(record.get(7)), Integer.parseInt(record.get(8)), Integer.parseInt(record.get(9)), record.get(10));
				videosLista.addFirst(video);
			}
			System.out.println("Datos cargados "+ videosLista.size());
		}
		catch (IOException e) 
		{
			System.out.println("No se encontro el archivo para cargar los datos");
		}
	}
}
