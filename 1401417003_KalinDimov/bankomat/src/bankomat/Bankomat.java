/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankomat;

import java.util.Scanner;

/**
 *
 * @author fmi
 */
public class Bankomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        do {
            System.out.println("Изберете опция: \n" + 
                                "1. Теглене на сума;\n" +
                                "2. Промяна на PIN;\n" +
                                "3. Проверка на наличност;\n" +
                                "4. Настройки;\n" +
                                "5. Изход.");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            switch(a) {
                case 1: System.out.println("Нямаш пари, кво си тръгнал да теглиш? "); break;
                case 2: System.out.println("Въведете нов ПИН: "); break;
                case 3: System.out.println("Много си беден, майна! "); break;
                case 4: System.out.println("Настройки: "); break;
                case 5: break;
                default: break;
            }
        } while(a != 5);
    } 
}
