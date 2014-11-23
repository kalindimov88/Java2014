/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meseci;
import java.util.Scanner;
/**
 *
 * @author fmi
 */
public class Meseci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a) {
            case 1: System.out.println("Януари"); break;
            case 2: System.out.println("Февруари"); break;
            case 3: System.out.println("Март"); break;
            case 4: System.out.println("Април"); break;
            case 5: System.out.println("Май"); break;
            case 6: System.out.println("Юни"); break;
            case 7: System.out.println("Юли"); break;
            case 8: System.out.println("Август"); break;
            case 9: System.out.println("Септември"); break;
            case 10: System.out.println("Октомври"); break;
            case 11: System.out.println("Ноември"); break;
            case 12: System.out.println("Декември"); break;
        }
    }
    
}
