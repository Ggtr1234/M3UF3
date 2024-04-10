package pt1.ex4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directori = "files";
        File directoriFile = new File(directori);
        File llista[]=directoriFile.listFiles();
        for (File file : llista){
            System.out.println("Nom: " + file.getName() +
                    " Mida: " + file.length() + "bytes" +
                    " Esta situat: " + file.getPath() +
                    " Permisos: Exec: " + file.canExecute() +
                    " Write: " + file.canWrite() +
                    " Read: " + file.canRead()
            );
        }
    }

}
