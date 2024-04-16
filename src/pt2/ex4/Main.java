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
        System.out.println(llegirFitxer(path,"h"));
        System.out.println(counter);
    }

    public static String llegirFitxer(String path, String cadena){
        try{
            String res = "";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linia = br.readLine();
            for (int i = 0; i < linia.length(); i++) {
                int pos = linia.indexOf(cadena);
                if (pos != -1){
                    counter++;
                }
            }
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
