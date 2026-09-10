import clavier.In;

import java.util.HexFormat;

public class Ihm {
    static void main(String[] args) {
        int chiffreModulo, temperature, converter;
        char char1, char2, charMaj;


        System.out.print("Donne un chiffre : ");
        chiffreModulo = In.readInteger();
        if (chiffreModulo % 2 == 0) {
            System.out.println("Ton chiffre est pair");
        } else  {
            System.out.println("Ton chiffre est impair");
        }
        System.out.println();


        System.out.print("Première lettre : ");
        char1 = In.readChar();
        System.out.print("Deuxieme lettre : ");
        char2 = In.readChar();
        if (char1 > char2) {
            System.out.println(char1+""+char2);
        } else {
            System.out.println(char2+""+char1);
        }
        System.out.println();


        System.out.print("Température eau : ");
        temperature = In.readInteger();
        if (temperature < 0) {
            System.out.println("Cest un glacon");
        } else if (temperature < 100) {
            System.out.println("Cest de l'eau");
        } else {
            System.out.println("Cest de la vapeur");
        }
        System.out.println();


        System.out.print("Donne une lette min ou majuscule : ");
        charMaj = In.readChar();
        if (charMaj >= 'A' && charMaj <= 'Z') {
            System.out.println("Majuscule");
        } else if (charMaj >= 'a' && charMaj <= 'z') {
            System.out.println("Minuscule");
        } else { // tout les autre char non géré
            System.out.println("Autre truc bizzard");
        }
        System.out.println();

        System.out.print("Donne un nombre entier : ");
        converter = In.readInteger();
        if (converter > 127) {
            System.out.println("Votre nombre est trop grands il sort de la table ascii");
            return;
        }
        System.out.println("Le caractère est : " + (char) converter);
        System.out.println("La valeur en base10 : " + converter);
        System.out.println("La valeur hexadécimal : 0x" + Integer.toHexString(converter));
    }
}
