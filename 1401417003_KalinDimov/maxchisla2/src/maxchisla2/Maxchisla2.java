/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxchisla2;

import java.util.Scanner;
/**
 *
 * @author fmi
 */
public class Maxchisla2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = getMax(a, b);
        System.out.println(getMax(max, c));
    }
/*    
    public static void max(int a, int b, int c) {
        if((a > b) && (a > c)) {
            System.out.println(a + " е най-голямото число");
        }
        if((b > a) && (b > c)) {
            System.out.println(b + " е най-голямото число");
        }
        if((c > a) && (c > a)) {
            System.out.println(c + " е най-голямото число");
        }
    }
*/    
    public static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }
    
}
