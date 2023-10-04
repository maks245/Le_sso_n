package Homeworks.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = in.nextInt();
        int[] array = inputArray(length);
        System.out.print("Minimal element of array: ");
        System.out.print(minimalElementOfArray(array));
        System.out.println();
        System.out.print("Maximal element of array: ");
        System.out.print(maximalElementOfArray(array));
    }
    private static int[] inputArray(int length){
        Scanner in = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("a["+ i+ "]: ");
            array[i] = in.nextInt();
        }
        return array;
    }
    private static int minimalElementOfArray(int[] array){
        int minimalElement = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minimalElement){
                minimalElement = array[i];
            }
        }
        return minimalElement;
    }
    private static int maximalElementOfArray(int[] array){
        int maximalElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximalElement){
                maximalElement = array[i];
            }
        }
        return maximalElement;
    }
}
