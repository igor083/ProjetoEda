package Application;

public class App {

	public static void main(String args[]) {

		int c = 200000;
		int[] listaOrdFim = Listas.listaOrdFinal(c);

		/* Como rodar as funções baseadas no valor definido em c -> Você escolhe qual valor, adiciona a função respectiva,
		 * int[] desordenado = Listas.listaDesordenada(c);
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
			// E depois, substitui aqui o algoritimo e sua função de ordenação.
			Ordena.heapSort(listaOrdFim);
			fim = System.nanoTime();
			media += fim - inicio;
			
		}
		System.out.println(media / 10);
	}
}
