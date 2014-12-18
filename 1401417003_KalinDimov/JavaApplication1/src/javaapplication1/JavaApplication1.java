/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;

public class JavaApplication1 {

        public static void main(String[] args) {

                int[] arr1 = generateArray(21);
                double average1 = getAverage(arr1);
                System.out.println("average ->" + average1);
                
                int[] arr2 = generateArray(21);
                double average2 = getAverage(arr2);
                System.out.println("average ->" + average2);
                
                int[] arr3 = generateArray(21);
                double average3 = getAverage(arr3);
                System.out.println("average ->" + average3);
                
                double min;
                min = Math.min(average1, average2);
                min = Math.min(min, average3);
                System.out.println("Минималното от трите средно аритметични = " + min);
                
        }

        // Generates int array with *elementsCount* elements between -100 and 100
        private static int[] generateArray(int elementsCount) {

                RandomGenerator rg = new RandomGenerator();
                int[] toReturn = new int[elementsCount];
                int counter = 0;
                int element;

                while (counter < elementsCount) {
                        element = rg.nextInt(-100, 100);
                        toReturn[counter] = element;
                        System.out.println(counter + " => " + element);
                        counter++;
                }
                return toReturn;
        }

        private static double getAverage(int[] arr) {
                int elementsSum = 0;
                int elementsCount = 0;
                for (int i = 0; i < arr.length; i++) {
                        if ((arr[i] != 0) && (arr[i] % 5 == 0)) {
                                System.out.println(arr[i]);
                                elementsSum += arr[i];
                                elementsCount++;
                        }
                }
                if (elementsCount != 0) {
                        return elementsSum / elementsCount;
                } else {
                        return 0;
                }
        }

}

class RandomGenerator extends Random {

        public int nextInt(int lower, int upper) {
                return nextInt((upper - lower + 1)) + lower;
        }
}