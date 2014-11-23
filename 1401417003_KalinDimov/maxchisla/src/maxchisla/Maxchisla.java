/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxchisla;

/**
 *
 * @author fmi
 */
public class Maxchisla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 4, b = 7;
        max(a, b);
    }
    public static void max(int a, int b) {
        if(a > b) {
            System.out.println(a + " е по-голямото число");
        }
        if(b > a) {
            System.out.println(b + " е по-голямото число");
        }
        else {
            System.out.println("числата са равни");
        }
    }
    
}
