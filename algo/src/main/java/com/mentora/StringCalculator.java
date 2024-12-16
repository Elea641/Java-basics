package com.mentora;

public class StringCalculator {

    public String sum(String input) {

        if(input.contains(",")) {
            String[] newStringWithoutComma =  input.split(",");
            //System.out.println(java.util.Arrays.toString(newStringWithoutComma));
            return  String.valueOf(Integer.parseInt(newStringWithoutComma[0]) + Integer.parseInt(newStringWithoutComma[1]));
        }

            // TODO : don't forget to test when input contains not integer characters
            // Créer un type spécifique en java pour vérifier la valeur soit toujours des deux chiffres séparés par une virgule

        if(input == "") {
            return "0";
        }

        return input;
    }
}
