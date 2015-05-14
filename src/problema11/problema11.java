package problema11;

import java.util.Scanner;

/*11.-Imprimir y contar los multiplos de 3 desde la unidad hasta un numero que
 introducimos por teclado.*/
/**
 *
 * @author Jorge
 */
public class problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                x = x + 1;
            }
            
        }
        System.out.println("son "+x+" numeros multiplos de 3 entre el uno y el "
                    + n);
    }

}
