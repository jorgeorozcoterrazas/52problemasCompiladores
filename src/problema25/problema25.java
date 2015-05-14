package problema25;

import java.util.Scanner;
//25.-Introducir un numero menor de 5000 y pasarlo a numero romano.
/**
 *
 * @author Jorge
 */
public class problema25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=5000, i;
        
        while (num >= 5000){
            System.out.println("Ingrese un numero menor a 5000");
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
        }
        int m = num/1000;
        int c = (num - m*1000)/100;
        int d = ((num-m*1000)-c*100)/10;
        int u = (((num-m*1000)-c*100)-d*10);
        
        String mR = null, cR = null, dR = null, uR = null;
        
        switch(m){
            case 1: mR="M"; break;
            case 2: mR="MM"; break;
            case 3: mR="MMM"; break;
            case 4: mR="IV-"; break;
        }
        
        switch(c){
            case 1: cR="C"; break;
            case 2: cR="CC"; break;
            case 3: cR="CCC"; break;
            case 4: cR="CD"; break;
            case 5: cR="D"; break;
            case 6: cR="DC"; break;
            case 7: cR="DCC"; break;
            case 8: cR="DCCC"; break;
            case 9: cR="CM"; break;
        }
        
        switch(d){
            case 1: dR="X"; break;
            case 2: dR="XX"; break;
            case 3: dR="XXX"; break;
            case 4: dR="XL"; break;
            case 5: dR="L"; break;
            case 6: dR="LX"; break;
            case 7: dR="LXX"; break;
            case 8: dR="LXXX"; break;
            case 9: dR="XC"; break;
        }
        
        switch(u){
            case 1: uR="I"; break;
            case 2: uR="II"; break;
            case 3: uR="III"; break;
            case 4: uR="IV"; break;
            case 5: uR="V"; break;
            case 6: uR="VI"; break;
            case 7: uR="VII"; break;
            case 8: uR="VIII"; break;
            case 9: uR="IX"; break;
        }
        
        System.out.println(mR+""+cR+""+dR+""+uR);
    }
    
}
