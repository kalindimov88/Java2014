/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masibsuma;

/**
 *
 * @author fmi
 */
public class Masibsuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] masiv = new double[5];
        for(int i = 0; i < masiv.length; i++) {
            masiv[i] = sc.nextDouble();
        }
        double suma = 0;
        for(int i1 = 0; i1 < masiv.length; i1++) {
            if(masiv[i1] > 0) {
                suma += masiv[i1];
            }
        }
        System.out.println(suma);
    }
    
}
