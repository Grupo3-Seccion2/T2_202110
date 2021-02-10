package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable<T>> implements IArregloDinamico<T> {
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = (T[]) new Object[max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		public T darElemento(int i) {
			// TODO implementar
			return elementos[i];
		}

		public T buscar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			T respuesta = null;
			T actual;
			for(int i = 0; i < elementos.length; i ++ ) {
				actual = elementos[i];
				if(actual.equals (dato))
				if(actual.compareTo(dato) == 0)
				{
					respuesta = actual;
				}
			}
			return respuesta;
		}

		public T eliminar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			T elim = buscar(dato);
			for ( int i = 0; i < elementos.length; i++)
			{
				if(elementos[i].equals(elim))
				{
					elementos[i] = null;
				}
			}
			return elim;
		}

		@Override
		public void invertir() 
		{
			T[] copia = elementos;
			T[] nuevo = (T[]) new Object[tamanoMax];
			for (int i = 0; i < tamanoAct; i++)
			{
				int j = tamanoAct -1 -i;
				nuevo [i]= copia[j];
			}
			elementos = nuevo;
		}
		public void agregar(T dato) {
			// TODO Auto-generated method stub
			if ( tamanoAct == tamanoMax )
              {  // caso de arreglo lleno (aumentar tamaNo)
                   tamanoMax = 2 * tamanoMax;
                   T [ ] copia = elementos;
                   elementos = (T[])new Object[tamanoMax];
                   for ( int i = 0; i < tamanoAct; i++)
                   {
                    	 elementos[i] = copia[i];
                   } 
           	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
              }	
              elementos[tamanoAct] = (T) dato;
              tamanoAct++;
		
		}



}
