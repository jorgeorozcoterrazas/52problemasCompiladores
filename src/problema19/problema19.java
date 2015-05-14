/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema19;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int hor,min,seg,hora,mins,segs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la hora");
        hora=sc.nextInt();
        System.out.println("Introduzca los minutos");
        mins=sc.nextInt();
        System.out.println("Introduzca los segundos");
        segs=sc.nextInt();
        for ( hor=hora; hor<=23;hor++)
        {
            for ( min = mins ; min < 60; min++) 
            {
                for ( seg = segs; seg < 60; seg++) 
                {
                    System.out.println(hor+":"+min+":"+seg);
                    Thread.sleep(1000);
                }
            }  
        }
    }
    
}
