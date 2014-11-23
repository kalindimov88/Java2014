/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxchisla3;

import java.util.Arrays;

/**
 *
 * @author fmi
 */
public class Maxchisla3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length != 0) {
            System.out.println(Arrays.toString(args));
            
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
            
        
        System.out.println(maxChisla(a, b));
    }
    public static int maxChisla(int a, int b) {
        return (a > b) ? a : b;
    }
    
}
