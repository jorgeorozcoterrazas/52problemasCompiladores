package problema13;
//13.-Imprimir y contar los numeros que son multiplos de 2 o de 3 que hay entre
//1 y 100.

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0,z=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("multiplo de 3 "+i);
                
                x = x + 1;
            }
            else if(i%2==0){
              System.out.println("multiplo de 2 "+i);
                
                z = z + 1;  
            }
            
        }
        System.out.println("son "+z+" numeros multiplos de 2 entre el uno y el "
                    + n);
        System.out.println("son "+x+" numeros multiplos de 3 entre el uno y el "
                    + n);
        
    }
    
}
