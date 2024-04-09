package pt1.ex2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String directori;
        if (args.length > 0) {
            directori = args[0];
        } else {
            System.out.println("Introdueix el nom del directori:");
            directori = sc.next();
        }

        File directoriFile = new File(directori);
        if (!directorValid(directoriFile)) {
            System.out.println("El directori no és vàlid.");
            return;
        }

        System.out.println("El arxiu més gran és: " + searchFiles(directoriFile).getName());
    }

    public static boolean directorValid(File directori) {
        return directori.exists() && directori.isDirectory();
    }


    public static File searchFiles(File directori) {
        File[] fitxers = directori.listFiles();
        File fitxerMesGran = null;
        long maxim = Integer.MIN_VALUE;

        for (File fitxer : fitxers){
            if (fitxer.length() > maxim){
                maxim = fitxer.length();
                fitxerMesGran = fitxer;
            }
        }


        return fitxerMesGran;
    }


}
