package Homeworks.HW7;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(5);
        list.add(12);
        list.add(11,0);
        list.remove(2);
        list.add(15);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(11));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
