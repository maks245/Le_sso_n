package Homeworks.HW1;

public class Third_task {
    public static void main(String[] args){
        /*3 часть
int a =5;
int b =3;
Завдання поміняти дві змінні місцями, (зробити так щоб b виявилася 5, а виявилася 3),
 не використовуючи прямого присвоєння (тобто. не можна написати b = 5; a = 3;),
  А ТАКОЖ не можна використовувати третю змінну.*/
        int a = 5;
        int b = 3;
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }
}
