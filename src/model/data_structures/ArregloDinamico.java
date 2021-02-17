package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable<T>> implements ILista<T> {
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


		@Override
		public void addFirst(T elem)
		{
			T[] copia = elementos;
			
			if(isEmpty())
				elementos[0] = elem;
			for(int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i+1];
				elementos[0] = elem;
			}
			tamanoAct++;
			
		}


		@Override
		public void addLast(T elem) {
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
            elementos[tamanoAct] = elem;
            tamanoAct++;
		}


		@Override
		public void insertElement(T elem, int pos) {
			// TODO Auto-generated method stub
			T[] copia = elementos;
			if(isEmpty())
				elementos[0] = elem;
			for(int i = 0; i < tamanoAct; i++)
			{
				if(pos == i)
				{
					elementos[i] = copia[i];
					elementos[i] = elem;
				}
			}
			tamanoAct++;
		}


		@Override
		public T removeFirst() {
			T[] copia = elementos;
			
			if(!isEmpty())
			{
				for(int i = 0; i < tamanoAct; i++ )
				{
					elementos[i] = copia[i+1];
				}
				elementos[0] = null;
			}
			return copia[0];
		}


		@Override
		public T removeLast() {
			T[] copia = elementos;
			T elem = null;
			if(!isEmpty())
			{
				for ( int i = 0; i < elementos.length; i++)
				{
					if(elementos[i+1] == null)
					{
						elem = copia[i];
						elementos[i] = null;
					}
				}
			}
			
			return elem;
		}


		@Override
		public T deleteElement(int pos) {
			T[] copia = elementos;
			T elem = null;
			for ( int i = 0; i < elementos.length; i++)
			{
				if(i == pos)
				{
					elem = copia[i];
					elementos[i] = null;
				}
			}
			return elem;
		}


		@Override
		public T firstElement() {
			if(tamanoAct != 0)
				return elementos[0];
			else
				return null;
		}


		@Override
		public T lastElement() {
			T last = null;
			
			if(tamanoAct != 0)
			{
				for(int i = 0; i < tamanoAct; i ++)
				{
					if(elementos[i+1] == null)
					{
						last = elementos[i];
					}
				}
			}
			return last;
		}


		@Override
		public T getElement(int pos) {
			return elementos[pos];
		}


		@Override
		public int size() {
			return tamanoAct;
		}



		@Override
		public int isPresent(T element) {
			T actual;
			int posicion = 0;
			for(int i = 0; i < elementos.length; i ++ )
			{
				actual = elementos[i];
				if(actual.compareTo(element) == 0)
				{
					posicion = i;
				}
			}
			return posicion;
		}


		@Override
		public void exchange(int pos1, int pos2) {
			T elem1 = null;
			T elem2 = null;
			T elemCopia = null;
			
			if(tamanoAct != 0)
			{
				elem1 = getElement(pos1);
				elem2 = getElement(pos2);
				
				elemCopia = elem1;
				elem1 = elem2;
				elem2 = elemCopia;
			}
			
		}


		@Override
		public void changeElement(int pos, T elem)
		{
			if(!isEmpty())
			{
				deleteElement(pos);
				insertElement(elem, pos);
			}
				
			
		}


		@Override
		public boolean isEmpty() 
		{
			return tamanoAct == 0;
		}



}
