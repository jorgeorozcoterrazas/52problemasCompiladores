/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema31;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class problema31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, opc;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        n1 = scan.nextInt();
        System.out.println("Ingrese segundo numero");
        n2 = scan.nextInt();

        System.out.println("Seleccione una opcion:\n1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir");
        opc = scan.nextInt();

        switch (opc) {
            case 1:
                System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                }
                break;
        }
    }

}
