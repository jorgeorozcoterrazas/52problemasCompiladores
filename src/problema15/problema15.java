package problema15;
//Itroducir dos numeros por teclado.Imprimir los numeros naturales que
//hay entre ambos numeros empezando por el mas pequeño, contar cuantos hay y
//cuantos de ellos son pares. Calcular la suma de los impares
import java.util.Scanner;


/**
 *
 * @author Jorge
 */
public class problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int z=0,x=1,pares=0,suma_impar=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero inicial");
        int num_ini=sc.nextInt();
        System.out.println("Introduzca numero final");
        int num_fin=sc.nextInt();
        for(x=num_ini+1;x<num_fin;x++){
            System.out.println(x);
            z=z+1;
            if(x%2==0){
                pares=pares+1;
            }
            else if(x%2!=0){
                suma_impar=suma_impar+x;
            }
            
        }
        System.out.println("hay "+z+" numeros entre el "+num_ini+" y el "+num_fin);
        System.out.println("el numero de numeros pares que hay son "+pares);
        System.out.println("la suma de los numeros impares es "+suma_impar);
    }
    
}
