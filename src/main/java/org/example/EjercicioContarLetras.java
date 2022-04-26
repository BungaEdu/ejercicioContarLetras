package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {
    public static void main(String[] args) {
        Integer[] arrayNum = new Integer[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el input: ");
        String cadena = sc.nextLine();

        char[] cadenaToCharArray=cadena.toCharArray();

        for (int i = 0; i < cadenaToCharArray.length; i++) {
            arrayNum[i]
        }
        System.out.println(contarRepeticiones(arrayNum));
    }

    public static String contarRepeticiones(Integer[] arrayNum) {

        if (arrayNum==null)
            return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arrayNum) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                value++;
                map.replace(num, value);
            } else {
                map.put(num, 1);
            }
        }
        return map.toString();

    }


}
