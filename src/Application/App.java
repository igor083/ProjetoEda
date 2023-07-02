package Application;
import java.util.Arrays;
public class App {


    public static void main(String args []) {
		int[] desordenado = Listas.listaDesordenada(10);
		int[] ordernadaCrescente = Listas.listaOrdenadaCres(10);
    	int[] ordernadaDecrescente = Listas.listaOrdenadaDecres(10);
		int[] constante = Listas.listaConstante(10);


		int[] teste = {2, 7, 1, 9, 6, 3, 99, 22, 0};

		System.out.println(Arrays.toString(teste));
		int[] orden = Ordena.countingSort(teste);
		System.out.println(Arrays.toString(orden));


    	//System.out.println("Desordenado: " + Arrays.toString(desordenado));
    	//System.out.println("Ordernada Crescente: " + Arrays.toString(ordernadaCrescente));
    	//System.out.println("Ordernada Decrescente: " + Arrays.toString(ordernadaDecrescente));
    	//System.out.println("Constante: " + Arrays.toString(constante));
   	}
}
