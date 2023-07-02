package Application;

import java.util.Arrays;

public class App {

	public static void main(String args[]) {

		int c = 200000;
		int[] desordenado = Listas.listaDesordenada(c); 

		/*
		 * int[] listaOrdFim = Listas.listaOrdFinal(c);
		 * int[] constante = Listas.listaConstante(c);
		 * int[] ordernadaCrescente =Listas.listaOrdenadaCres(c);  
		 * int[] ordernadaDecrescente = Listas.listaOrdenadaDecres(c); 
		 * int[] listaOrdInicio = Listas.listaOrdInicio(c);
		 */
		
		int media = 0;
		for (int i = 0; i < 10; i++) {
			long inicio = 0;
			long fim = 0;

			inicio = System.nanoTime();
			Ordena.countingSort(desordenado);
			fim = System.nanoTime();
			media += fim - inicio;
			
		}
		System.out.println(media / 10);

		// System.out.println("Desordenado: " + Arrays.toString(desordenado));
		// System.out.println("Ordernada Crescente: " +
		// Arrays.toString(ordernadaCrescente));
		// System.out.println("Ordernada Decrescente: " +
		// Arrays.toString(ordernadaDecrescente));
		// System.out.println("Constante: " + Arrays.toString(constante));
	}
}
