package problema5;
//5.-Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que
//imprima cuantos impares hay.
/**
 *
 * @author Jorge
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int z=0;
        for (int i = 1; i<= 100; i=i+2) {
            System.out.println(i);
            z=z+1;
        }
        System.out.println("hay "+z+" numeros impares");
        
    }
    
}
