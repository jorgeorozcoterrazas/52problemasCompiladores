package problema12;

/*12.-Hacer un pseudocodigo que imprima los numeros del 1 al 100. Que calcule la
suma de todos los numeros pares por un lado, y por otro, la de todos los
impares.*/
/**
 *
 * @author Jorge
 */
public class problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0,z=0;
        for (int i = 0; i<= 100; i++) {
            System.out.println(i);
            if(i%2==0){
                x=x+i;
                
                
            }
            else if(i%2!=0){
                z=z+i;
            }
        }
        System.out.println("la suma de todos lo numeros pares del 1 al 100 es: "+x);
        System.out.println("la suma de todos lo numeros impares del 1 al 100 es: "+z);
    }
    
}
