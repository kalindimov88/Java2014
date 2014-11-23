/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datatypes;
import System
/**
 *
 * @author fmi
 */
public class DAtaTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte myByte = 22;
        short myShort = 257;
        int myInt = -123;
        long myLong = 123L;
        
        float myFloat = 2.34F;
        double myDouble = 2.34;
        
        char myChar = 'D';
        boolean myBoolean = false;
        
        String myString = "Stoyan";
        Object myOobject = 3;
        
        System.out.print(myString);
        System.out.println(myString);
        
        int ch;
        ch = System.in.read();
        System.out.print((char) ch);
        
        Scanner input = new Scanner(System.in);
    }
    
}
