/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piramida;

/**
 *
 * @author fmi
 */
public class Piramida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i <= 5; i++) {
            for(int i2 = 1; i2 <= i; i2++) {
                System.out.print('A');
            }
            System.out.println();
        }
    }
    
}
