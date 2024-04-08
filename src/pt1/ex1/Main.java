package pt1.ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<File> files = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File fitxer1 = new File("./files/file1.txt");
        File fitxer2 = new File("./files/file2.txt");
        File fitxer3 = new File("./files/file3.txt");
        files.add(fitxer1);
        files.add(fitxer2);
        files.add(fitxer3);
        File directori = new File("./files");

//        fitxer1.createNewFile();
//        fitxer2.createNewFile();
//        fitxer3.createNewFile();
//        directori.mkdir();


        System.out.println("El arxiu mes gran es: " + Main.searchFiles().getName());

    }

    public static File searchFiles(){
        long maxim = Integer.MIN_VALUE;
        File file = null;
        for (File fitxer : files){
            if (fitxer.length() > maxim){
                maxim = fitxer.length();
                file = fitxer;
            }
        }
        return file;
    }

}
