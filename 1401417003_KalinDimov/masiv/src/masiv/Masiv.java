/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masiv;
import java.util.Scanner;
/**
 *
 * @author fmi
 */
public class Masiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] masiv = new int[5];
        masiv[0] = sc.nextInt();
        masiv[1] = sc.nextInt();
        masiv[2] = sc.nextInt();
        masiv[3] = sc.nextInt();
        masiv[4] = sc.nextInt();
        for(int i : masiv) {
            System.out.println(i);
        }
    }
    
}
