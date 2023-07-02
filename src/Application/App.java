package Application;
import java.util.Arrays;
public class App {


    public static void main(String args []) {
    	//int []arrayOrd=Listas.listaOrdenadaCres(10);
    	//System.out.println(Arrays.toString(arrayOrd));
    	
    	//int []arrayDes=Listas.listaDesordenada(10);
    	//System.out.println(Arrays.toString(arrayDes));

    	//int []arrayConst=Listas.listaConstante(10);
    	//System.out.println(Arrays.toString(arrayConst));
   	int []listaOrdInicio=Listas.listaOrdInicio(100);
//    	System.out.println(Arrays.toString(arrayConst));
    	int []arrayConst=Listas.listaOrdenadaDecres(100);
    	System.out.println(Arrays.toString(listaOrdInicio));

    	Ordena.quickSort(listaOrdInicio);
    	System.out.println(Arrays.toString(listaOrdInicio));
   }
}
