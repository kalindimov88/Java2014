/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masiv3;

/**
 *
 * @author fmi
 */
public class Masiv3 {

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
            if(number > 30) {
                break;
            }
            System.out.print(number + " ");
        }
    }
    
}
