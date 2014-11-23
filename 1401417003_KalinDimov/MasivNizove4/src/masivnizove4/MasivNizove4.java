/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masivnizove4;

/**
 *
 * @author fmi
 */
public class MasivNizove4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] masiv = {"змия", "крокодил", "костенурка"};
        for(int i = 0; i < masiv.length; i++) {
            String result = masiv[i].toUpperCase();
            System.out.println(result);
        }
    }
    
}
