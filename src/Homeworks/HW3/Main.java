package Homeworks.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        String[] city_names  = new String[]{"Одеса","Львів", "Варшава",
                                          "Лондон", "Київ", "Харків",
                                           "Амстердам", "Берлін",
                                          "Нікополь", "Вінниця"};
        String[] foundedCities = new String[]{""};
        String[] tempArray;
        String userAnswer;
        String PCAnswer;
        char last_char = ' ';
        int current_player = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("Давай пограємо у <<Міста>>. Ти перший називай!");
        while(true){
            if (current_player == 0) {
                System.out.print("Ти: ");
                userAnswer = in.nextLine();
                System.out.println();
                if (checkUserAnswer(userAnswer, foundedCities)){
                    tempArray = foundedCities.clone();
                    foundedCities = new String[tempArray.length + 1];
                    copyArray(foundedCities, tempArray);
                    foundedCities[foundedCities.length - 1] = userAnswer;
                    last_char = userAnswer.charAt(userAnswer.length() - 1);
                    current_player = 1;
                }
            }
            if (current_player == 1) {
                PCAnswer = searchWord(city_names, foundedCities, last_char);
                if (PCAnswer == null) {
                    System.out.println("Я програв, ти знаєш більше міст ніж я!");
                    System.exit(1);
                }else{
                    tempArray = foundedCities.clone();
                    foundedCities = new String[tempArray.length + 1];
                    copyArray(foundedCities, tempArray);
                    foundedCities[foundedCities.length - 1] = PCAnswer;
                    System.out.println("Моя відповідь \"" + PCAnswer + "\". Тепер твоя черга!");
                    current_player = 0;
                }
            }
        }
    }

    public static void copyArray(String[] foundedCities, String[] temp){
        for (int i = 0; i < temp.length; i++) {
            foundedCities[i] = temp[i];
        }
    }

    public static boolean checkUserAnswer(String userAnswer, String[] foundedCities){
        if (userAnswer.length() < 4){
            System.out.println("Ваша відповідь не може бути вірною(назва занадто коротка)");
            return false;
        }
        for (int i = 0; i < foundedCities.length; i++) {
            if (foundedCities[i].equals(userAnswer)) {
                System.out.println("Таке слове вже було використане");
                return false;
            }
        }
        return true;
    }

    public static String searchWord(String[] cityNames, String[] foundedCities, char lastChar){
        String result = null;
        for (int i = 0; i < cityNames.length; i++) {
            if (result != null) {
                return result;
            }
            if (String.valueOf(cityNames[i].charAt(0)).equals(String.valueOf(lastChar).toUpperCase())) {
                result = cityNames[i];
                for (int j = 0; j < foundedCities.length; j++) {
                    if (foundedCities[j].equals(cityNames[i])) {
                        result = null;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
