package pt2.ex4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static int counter;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Main.counter = counter;
    }

    public static void main(String[] args) {
        String path = "files/file1.txt";
        System.out.println(llegirFitxer(path,"Hola"));
        System.out.println("Vegades que surt la cadena: " + counter);
    }

    public static String llegirFitxer(String path, String cadena){
        try{
            String res = "";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linia = br.readLine();
//            System.out.println("linia: "+linia);

            while(linia != null){
                res = res + linia + "\n";
                linia = br.readLine();
            }
            br.close();
            System.out.println(res);
            int pos = res.indexOf(cadena);
            while (pos != -1){
                counter++;
                pos = res.indexOf(cadena,pos + 1);
            }
            return res;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
