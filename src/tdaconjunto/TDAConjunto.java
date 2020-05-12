package tdaconjunto;

import java.util.Scanner;

/**************************************************
 * Elaborar un BNF con conjunto y sus respectivos *
 * comportamientos. Luego plasmarlo en la progra- *
 * mación utilizando un lenguaje cualquiera       *
 * Fecha: 06/05/2020                              *
 * @author Franklin G. Mendoza                    *
 **************************************************/

/***************************************************************
 *BNF Conjunto                                                 *
 *<conjunto>:=<digito> | {<digito>} | <caracter> | {<caracter>}*
 *<digito>:= 0 | 1 | 2 | 3 |4 | 5 | 6 | 7 | 8 | 9              *
 *<caracter>:= 'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L' *
 *            |'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X' *
 *            |'Y'|'Z'|'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j' *
 *            |'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v' *
 *            |'w'|'x'|'y'|'z'                                 *
 * <fin_caracter>:='\0'                                        *
 * Comportamientos                                             *
 * 1.- Union                                                   *
 * 2.- Intersección                                            *
 * 3.- Diferencia                                              *
 ***************************************************************/
public class TDAConjunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,i,j;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del primer conjunto");
        n1 = lector.nextInt();//Leemos la cantidad de elementos que va a tener el conjunto
        int Data1[] = new int[n1];//Declaramos el vector donde se va a almacenar los elementos del conjunto
        //almacenamos los elementos del conjunto
        for(i=0;i<n1;i++){
            System.out.println("Ingrese el valor del conjunto");
            Data1[i] = lector.nextInt();
        }
        System.out.println("Ingrese la cantidad de elementos del segundo conjunto");
        n2 = lector.nextInt();
        int Data2[] = new int[n2];
        for(i=0;i<n2;i++){
            System.out.println("Ingrese el valor del conjunto");
            Data2[i] = lector.nextInt();
        }
        //Hacemos la union
        n3 = n1 + n2;
        int Data3[] = new int[n3];
        for(i=0;i<n1;i++){
            Data3[i] = Data1[i];
        }
        for(i=0;i<n2;i++){
            Data3[i+n1] = Data2[i];
        }
        System.out.println(" ");
        System.out.println("La unión de conjuntos es: ");
        for(i=0;i<n3;i++){
            System.out.print(Data3[i]+" ");
        }
        //Hacemos la intersección
        System.out.println("La interseccion de conjuntos es: ");
        for(i=0;i<n1;i++){
            for(j=0;j<n2;j++){
                if(Data1[i]==Data2[j]){
                    System.out.print(Data1[i]+" ");
                }
            }
        }
        System.out.println(" ");
    }
}
