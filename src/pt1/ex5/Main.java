package pt1.ex5;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directori = "files";
        File directoriFile = new File(directori);
        File llista[]=directoriFile.listFiles();
        for (File file : llista){
            if(Character.isDigit(file.getName().charAt(0))){
                System.out.println("Se esta eliminando el archivo: " + file.getName());
                file.delete();

            }
        }
    }
}
