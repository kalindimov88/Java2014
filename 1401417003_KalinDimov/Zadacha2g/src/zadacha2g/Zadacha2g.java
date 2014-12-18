// Калин Красимиров Димов, ФН - 1401417003, задача 2.г)

package zadacha2g;

import java.util.*;

public class Zadacha2g {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        System.out.println("Въведете броя на елементите в"
                + " масивите!(до 20 елементa)");
        int choice = input.nextInt();
        
        while ((choice < 0) || (choice > 20)) {
            System.out.println("Изберете число от 1 до 20!");
            choice = input.nextInt();
        }
        int[] a = new int[choice];
        setNumbers(a);
        int[] b = new int[choice];
        setNumbers(b);
        int[] c = new int[choice];
        setNumbers(c);
        
        System.out.println("Елементите от масив \"A\": ");
        showElements(a);
        System.out.println("\nЕлементите от масив \"B\": ");
        showElements(b);
        System.out.println("\nЕлементите от масив \"C\": ");
        showElements(c);
        
        double srA = srArit(a);
        double srB = srArit(b);
        double srC = srArit(c);
        
        System.out.println("\nСредно аритметично на елементите "
            + "на масив \"A\": " + srA + "\nСредно аритметично на"
            + " елементите на масив \"B\": " + srB + "\nСредно аритметично"
            + " на елементите на масив \"C\": " + srC);
        
        double min = Math.min(srA, srB);
        min = Math.min(min, srC);
        System.out.println("Минималното от трите средно ар"
                + "итметични е: " + min);
    }
    
    public static void setNumbers(int[] masiv) {
        
        for(int i = 0; i < masiv.length; i++) {
            masiv[i] = randInt(100, -100);
        }
    }
    
    public static int randInt(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public static double srArit(int[] masiv) {
        double suma = 0.0;
        double count = 0.0;
        
        for(int i = 0; i < masiv.length; i++) {
            if((masiv[i] % 5 == 0) && (masiv[i] != 0)) {
                suma += masiv[i];
                count++;
            }
        }
        
        return suma/count;
    }
    
    public static void showElements(int[] masiv) {
        
        for(int i = 0; i < masiv.length; i++) {
            System.out.print((i+1) + " => " + masiv[i] + ", ");
        }
    }
}
