package pt1.ex3;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directori = "files";
        File directoriFile = new File(directori);
        File llista[]=directoriFile.listFiles();
        System.out.println("Quin nom vols buscar: ");
        String name = sc.next();
        for(File file: llista){
            if(file.getName().contains(name)){
                System.out.println(file.getName());
            };
        }
    }

//    public static File searchFiles(String name2Search){
//
//    }
}
