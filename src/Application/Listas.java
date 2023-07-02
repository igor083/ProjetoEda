package Application;

import java.util.Random;

public class Listas {
	public static Random random = new Random();

	public static int[] listaOrdenadaCres(int tam) {

		int[] array = new int[tam];

		for (int i = 0; i < tam; i++) {
			array[i] = i;
		}

		return array;
	}

	public static int[] listaOrdenadaDecres(int tam) {

		int[] array = new int[tam];

		for (int i = 0; i < tam; i++) {
		    array[i] = tam - i;
		}

		return array;
	}

	public static int[] listaDesordenada(int tam) {
		int[] array = new int[tam];
		int limSup = tam + 1;
		int limInf = 0;
		int range = limSup - limInf;

		for (int i = 0; i < tam; i++) {
			int numeroAleatorio = random.nextInt(range);
			array[i] = numeroAleatorio;
		}

		return array;

	}

	public static int[] listaConstante(int tam) {
		int[] array = new int[tam];

		int limSup = tam + 1;
		int limInf = 0;
		int range = limSup - limInf;

		int numeroAleatorio = random.nextInt(range);

		for (int i = 0; i < tam; i++) {
			array[i] = numeroAleatorio;
		}

		return array;

	}

	public static int[] listaOrdInicio(int tam) {
		int[] array = new int[tam];
		int limSup = tam + 1;
		int limInf = 0;
		int range = limSup - limInf;

		int numeroAleatorio = random.nextInt(range);

		for (int i = 0; i < tam*9/10; i++) {
            array[i] = i + 1;
        }

		for (int i = tam*9/10; i < tam; i++) {
            array[i] =numeroAleatorio;
        }

		for (int i = tam*9/10; i < tam - 1; i++) {
            int j = random.nextInt(range);
            array[i]=j;
        }

		return array;
	}

	public static int[] listaOrdFinal(int tam) {
		int[] array = new int[tam];
		int limSup = tam + 1;
		int limInf = 0;
		int range = limSup - limInf;

		int numeroAleatorio = random.nextInt(range);

		for (int i = 0; i < tam*1/10; i++) {
            int j = random.nextInt(range);

            array[i]=j;
        }

		for (int i = tam*1/10; i < tam; i++) {
            array[i] =numeroAleatorio;
        }

		for (int i = tam*1/10; i < tam - 1; i++) {
			array[i] = i + 1;
        }

		return array;
	}
}
