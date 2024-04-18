package pt2.ex7;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "files/file2.txt";
        String directori = "files";
        String cadena = llegirFitxer(path);
        crearYEscriureArxiu(directori,returnFile(path),cadena);
    }
    public static void crearYEscriureArxiu(String directori,File fileOriginal, String cadena){
        File file = new File(directori,fileOriginal.getName() + "2");
        try{
            if(file.createNewFile()){
                System.out.println("Creat");
            }else {
                System.out.println("Error");
            }
            FileWriter fr = new FileWriter(file);
            fr.write(cadena);
            fr.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static String llegirFitxer(String path){
        String res = "";
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linia = br.readLine();
            while (linia != null){
                res = res + linia + "\n";
                linia = br.readLine();
            }
            return res;
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    public static File returnFile(String path){
        File file = new File(path);
        return file;
    }
}
