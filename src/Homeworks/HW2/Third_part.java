package Homeworks.HW2;

public class Third_part {
    static public void main(String[] args){
        String str = "Hello world";
        char first_char = str.charAt(0);
        char last_char = str.charAt(str.length() - 1);
        System.out.println("First char: " + first_char );
        System.out.println("Last char: " + last_char );
        String[] splitted = str.split(" ");

        char[] char_array = splitted[splitted.length - 1].toCharArray();
        for (char c: char_array) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Before last char: " + char_array[char_array.length - 2] );
        System.out.println("-----------------");

        int a = 7;
        int f = 7;

        int result_1 = ++a;
        int result_2 = f++;
        System.out.println(result_1);
        System.out.println(result_2);
    }
}
