/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package srednoaritmetichno;

/**
 *
 * @author fmi
 */
public class Srednoaritmetichno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] masiv = new double[5];
        masiv[0] = sc.nextDouble();
        masiv[1] = sc.nextDouble();
        masiv[2] = sc.nextDouble();
        masiv[3] = sc.nextDouble();
        masiv[4] = sc.nextDouble();
        double suma = 0;
        for(int i = 0; i < masiv.length; i++) {
            suma += masiv[i];
        }
        System.out.println(suma/masiv.length);
    }
}
