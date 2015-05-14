
package problema7;

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
        int i;
        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca frases y se las contaremos:");
        for(i=1;i>0;i++){
            palabra=sc.nextLine();
            System.out.println("usted lleva "+i+" lineas introducidas");
        }
    }
    
}
