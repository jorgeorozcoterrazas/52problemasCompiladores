package problema6;

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
