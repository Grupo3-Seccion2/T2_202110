package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("--------- \nCrear Lista \n Si quiere que se trabaje como un arreglo indique la capacidad inicial. Sino ingrese 0: ");
				    int capacidad = lector.nextInt();
				    if(capacidad == 0)
				    	modelo = new Modelo(); 
				    else
				    	modelo = new Modelo(capacidad); 
				    view.printMessage("Lista creada");
				    view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");	
				    view.printMessage("El primer elemento de la lista es: "+ modelo.darPrimero());
				    view.printMessage("El ultimo elemento de la lista es: "+ modelo.darUltimo());
				    
					break;

				//case 2:
				//	view.printMessage("--------- \nDar cadena (simple) a ingresar: ");
				//	dato = lector.next();
				//	modelo.agregar(dato);
				//	view.printMessage("Dato agregado");
				//	view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				//	break;

				//case 3:
				//	view.printMessage("--------- \nDar cadena (simple) a buscar: ");
				//	dato = lector.next();
				//	respuesta = (String) modelo.buscar(dato);
				//	if ( respuesta != null)
				//	{
				//		view.printMessage("Dato encontrado: "+ respuesta);
				//	}
				//	else
				//	{
				//		view.printMessage("Dato NO encontrado");
				//	}
				//	view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				//	break;

				//case 4:
				//	view.printMessage("--------- \nDar cadena (simple) a eliminar: ");
				//	dato = lector.next();
				//	respuesta = (String) modelo.eliminar(dato);
				//	if ( respuesta != null)
				//	{
				//		view.printMessage("Dato eliminado "+ respuesta);
				//	}
				//	else
				//	{
				//		view.printMessage("Dato NO eliminado");							
				//	}
				//	view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				//	break;

			//	case 5: 
			//		view.printMessage("--------- \nContenido del Arreglo: ");
			//		view.printModelo(modelo);
			//		view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
			//		break;	
					
			//	case 6:
			//		view.printMessage("--------- \nInvertir arreglo: ");
			//		break;
				case 7: 
					view.printMessage("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;	

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}
}
