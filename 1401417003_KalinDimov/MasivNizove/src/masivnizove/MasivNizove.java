/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masivnizove;

/**
 *
 * @author fmi
 */
public class MasivNizove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] masiv = {"Ивайло", "Ивана", "Димитър"};
        
        for(int i = 0; i < masiv.length; i++) {
            Boolean result = masiv[i].startsWith("Ив");
            if(result == true) {
                System.out.println(masiv[i]);
            }
        
        
        } 
    }
}
    

