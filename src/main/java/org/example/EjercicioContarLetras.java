package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el input: ");
        String cadena = sc.nextLine();

        System.out.println(contarRepeticiones(cadena));
    }

    public static String contarRepeticiones(String cadena) {

        if (cadena == null)
            return null;

        char[] cadenaToCharArray = cadena.toLowerCase().toCharArray();


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
