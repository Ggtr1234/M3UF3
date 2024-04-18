package pt2.ex6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "files/file2.txt";
        escriureArxiu(path,llegirFitxer(path));
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

    public static void escriureArxiu(String path, String cadena){
        try{
            FileWriter fw = new FileWriter(path,true);
            fw.write("\n" + cadena.toUpperCase());
            fw.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
