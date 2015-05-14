package problema10;
//10.-Introducir un numero por teclado. Que nos diga si es par o impar.

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" Es numero par");
        }
        else{
            System.out.println(n+" Es numero impar");
        }
    }
    
}
