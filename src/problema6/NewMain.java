package problema6;

import java.util.Scanner;
//6.-Hacer un pseudocodigo que imprima todos los numeros naturales que hay
//desde la unidad hasta un numero que introducimos por teclado.
/**
 *
 * @author Jorge
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int z=0,x=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("intoduzca numero final");
        int num_fin=sc.nextInt();
        for(x=1;x<=num_fin;x++){
            z=z+1;
        }
        System.out.println("hay "+z+" numeros desde el uno hasta el "+z);
    }
    
}
