package Homeworks.HW1;

public class Second_task {
    public static void main(String[] args){
        /*2 часть
int a =1;
int b =2;
Завдання поміняти дві змінні місцями,
(зробити так щоб у b виявилася 1, а виявилася 2), не
використовуючи прямого присвоєння (тобто не можна написати b = 1; a = 2;).
Вивести результати а та b у консоль, до і після..*/
        int a = 1;
        int b = 2;
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
    }

}
