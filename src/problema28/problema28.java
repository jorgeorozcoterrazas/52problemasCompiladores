package problema28;
import java.util.Random;
/*28.-Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara
o cruz.*/
/**
 *
 * @author Jorge
 */
public class problema28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd=new Random();
        rnd.nextInt();
        int r = rnd.nextInt( 2 );
        System.out.println(r);
        if(r==1){
            System.out.println("cayo sello");
        }
        else{
            System.out.println("cayo cara");
        }
    }
    
}
