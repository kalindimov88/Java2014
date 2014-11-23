/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masiv5;

/**
 *
 * @author fmi
 */
public class Masiv5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] masiv = new int[5];
        masiv[0] = sc.nextInt();
        masiv[1] = sc.nextInt();
        masiv[2] = sc.nextInt();
        masiv[3] = sc.nextInt();
        masiv[4] = sc.nextInt();
        for(int number : masiv) {
            if(number > 0) {
                System.out.println(number);
            }
        }
        int suma = 0;
        for(int number2 : masiv) {
            if(number2 < 0) {
                suma += number2;
            }
        }
        System.out.println(suma);
    }
    
}
