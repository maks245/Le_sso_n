package Homeworks.HW2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_part {
    static public void main(String[] args){
        int[] numbers = new int[] {10,2,3,5,2,1,6,7,8,9};
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] -= 5;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------");
        double[] another_numbers = new double[] {3.4, 2.2, 2.7, 1.5, 8.9};
        System.out.println(Arrays.toString(another_numbers));
        System.out.println("-----------------");
        byte a = 123;
        int b = 35956;
        long c = 547540495803432032l;
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = (int) c;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element" + i +": " + array[i]);
        }
        System.out.println("-----------------");
        int[][] matrix = new int[3][3];
        matrix[0][0] = 2;
        matrix[0][1] = 5;
        matrix[0][2] = 8;
        matrix[1][0] = 4;
        matrix[1][1] = 18;
        matrix[1][2] = 3;
        matrix[2][0] = 5;
        matrix[2][1] = 12;
        matrix[2][2] = 21;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
