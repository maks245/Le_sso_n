package Homeworks.HW2;

public class First_part {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,8,3,1,};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();
        System.out.println("-----------------");
        String str = "Мама мила раму";
        String[] splitted = str.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            System.out.print(splitted[i] + "\n");
        }
        System.out.println("-----------------");
        String str_2 = "Я хочу перенесення рядків.";
        String new_str_2 = str_2.replace(" ", "\n");
        System.out.print(new_str_2);
    }
}
