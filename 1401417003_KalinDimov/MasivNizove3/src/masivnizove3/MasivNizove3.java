/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masivnizove3;

/**
 *
 * @author fmi
 */
public class MasivNizove3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] masiv = {"Син", "Червен", "Зелен", "Черен"};
        for(int i = 0; i < masiv.length; i++) {
            Boolean result = masiv[i].endsWith("ин");
            if(result == true) {
                System.out.println(masiv[i]);
            }
        }
    }
    
}
