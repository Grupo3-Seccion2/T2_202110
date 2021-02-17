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
import model.data_structures.ILista;
import model.data_structures.Lista;
 
/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <T extends Comparable<T>>
{
	/**
	 * Atributos del modelo del mundo
	 */
	private ArregloDinamico<Video> videosArreglo;
	
	private Lista<Video> videosLista;
	
	private int tipoLista;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		videosLista = new Lista<>();
		try 
		{
			cargarDatosLista();
		}
		catch (Exception e)
		{	
		}
		tipoLista = 1;
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		videosArreglo = new ArregloDinamico<>(capacidad);
		try 
		{
			cargarDatosArreglo();
		}
		catch (Exception e)
		{	
		}
		tipoLista = 2;
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return tipoLista==1? videosLista.size():videosArreglo.size();
	}

	
	/**
	 * Requerimiento de agregar dato
	 * @param dato
	*/
	public void agregar(Video dato, int pos)
	{	if (tipoLista ==1)
		 videosLista.insertElement(dato, pos);
	    else
		 videosArreglo.insertElement(dato, pos);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Video buscar(int pos)
	{
		return tipoLista ==1 ? videosLista.getElement(pos):  videosArreglo.getElement(pos) ;
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */

	public Video eliminar(int pos)
	{
		return tipoLista ==1 ? videosLista.deleteElement(pos):  videosArreglo.deleteElement(pos) ;
	}

	public Video darPrimero()
	{
		return tipoLista ==1 ? videosLista.firstElement():  videosArreglo.firstElement() ;
	}
	public Video darUltimo()
	{
		return tipoLista ==1 ? videosLista.lastElement():  videosArreglo.lastElement() ;
	}
	

	public void cargarDatosArreglo() throws NumberFormatException, ParseException
	{
		Video video = null;
		SimpleDateFormat format =new SimpleDateFormat("MM dd, yyyy");
		try
		{
			Reader in = new FileReader("/T2_202110/data/videos-all.csv");
			Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
			for(CSVRecord record : records)
			{
				video = new Video(Integer.parseInt(record.get(0)), format.parse(record.get(1)), record.get(2), record.get(3), Integer.parseInt(record.get(4)), format.parse(record.get(5)), record.get(6), Integer.parseInt(record.get(7)), Integer.parseInt(record.get(8)), Integer.parseInt(record.get(9)), record.get(10));
				videosArreglo.addFirst(video);
			}
			System.out.println("Datos cargados "+ videosArreglo.size());
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
			Reader in = new FileReader("/T2_202110/data/videos-all.csv");
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
