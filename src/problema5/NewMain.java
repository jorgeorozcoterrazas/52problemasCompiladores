/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

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
