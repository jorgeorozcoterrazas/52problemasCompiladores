/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

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
        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca S o N nadamas");
        for (int x = 1; x > 0; x++) {
            palabra = sc.nextLine();
            if ("S".equals(palabra) || "N".equals(palabra) || "s".equals(palabra) || "n".equals(palabra)) {
                palabra = sc.nextLine();
            } else {
                System.out.println("SOLO PUEDE SER S o N!!!");
            }
        }
    }

}
