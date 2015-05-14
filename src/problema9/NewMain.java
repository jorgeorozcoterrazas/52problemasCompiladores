package problema9;

import java.util.Scanner;
//9.-Introducir un numero por teclado. Que nos diga si es positivo o negativo.

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
        System.out.println("Ingresa un numero");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("El numero " + n + " es positivo");
        } else {
            System.out.println("El numero " + n + " es negativo");

        }
    }

}
