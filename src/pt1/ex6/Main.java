package pt1.ex6;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directori = "files";
        File directoriFile = new File(directori);
        File llista[]=directoriFile.listFiles();
        for(File file: llista){
            file.mkdirs();
        }
    }
}
