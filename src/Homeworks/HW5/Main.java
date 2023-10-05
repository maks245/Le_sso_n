package Homeworks.HW5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int number = in.nextInt();
        System.out.println(sumOfDigits(number));
        System.out.print("Enter  n-th number of the fibonacci series: ");
        int n = in.nextInt();
        System.out.println(getNumberOfFibonacciSeries(n));
    }
    private static int sumOfDigits(int number){
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
    private static int getNumberOfFibonacciSeries(int n){
        int firstElement = 0;
        int nextElement = 1;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = firstElement + nextElement;
            firstElement = nextElement;
            nextElement = result;
        }
        return result;
    }
}
