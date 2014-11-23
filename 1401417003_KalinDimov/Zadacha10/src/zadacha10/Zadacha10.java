/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadacha10;

/**
 *
 * @author fmi
 */
public class Zadacha10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        voidM();
    }
    public static void voidM() {
        double a = 7, b = 6;
        if((a+b) > 20 ) {
           System.out.println((a+b)*(a-b));
        }
        else {
            System.out.println((a+b)/5);
        }
    }
    
}
