package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el input: ");
        String cadena = sc.nextLine();
        String cadenaMinus= cadena.toLowerCase();
        char[] cadenaToCharArray = cadenaMinus.toCharArray();

        System.out.println(contarRepeticiones(cadenaToCharArray));
    }

    public static String contarRepeticiones(char[] cadenaToCharArray) {

        if (cadenaToCharArray == null)
            return null;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char caracter : cadenaToCharArray) {
            if (map.containsKey(caracter)) {
                Integer value = map.get(caracter);
                value++;
                map.replace(caracter, value);
            } else {
                map.put(caracter, 1);
            }
        }
        return map.toString();
    }
}
