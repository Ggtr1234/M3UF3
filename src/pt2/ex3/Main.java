package pt2.ex3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path = "files/file1.txt";
        System.out.println(llegirFitxer(path));
        System.out.println("Conte la cadena introduida: " + comprobarCadena("que tal",path));
    }

    public static boolean comprobarCadena(String cadena, String path){
        if (llegirFitxer(path).contains(cadena)){
            return true;
        }
        return false;
    }

    public static String llegirFitxer(String path){
        try{
            String res = "";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linia = br.readLine();
            while(linia != null){
                res = res + linia + "\n";
                linia = br.readLine();
            }
            br.close();
            return res;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
