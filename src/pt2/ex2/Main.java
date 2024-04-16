package pt2.ex2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println(llegirFitxer("files/file2.txt"));

    }

    public static String llegirFitxer(String path){
        try{
            String res = "";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linia = br.readLine();
            while(linia != null){
                res = res + linia.toUpperCase() + "\n";
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
