package pt2.ex5;

import java.io.*;

public class Main {
//    5. Modifica el programa anterior per a que, un cop comptades les ocurrències de la cadena,
//    el programa escrigui en un altre fitxer el número de vegades que apareix. El nou fitxer es dirà
//    igual que l'original més el sufix .count
    public static int counter;

    public static void main(String[] args) {
        String ArxiuPath = "files/file1.txt";
        String path = "files";
        String name = getName(ArxiuPath);
        System.out.println(llegirFitxer(ArxiuPath,"Hola"));
        System.out.println("Vegades que surt la cadena: " + counter);
        crearFitxer(ArxiuPath,path,name);
    }
    public static String getName(String ArxiuPath){
        File fitxer = new File(ArxiuPath);
        return fitxer.getName();
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

    public static void crearFitxer(String ArxiuPath, String path, String name){
        File fitxer = new File(path, name + ".count");
        try{
            if(fitxer.createNewFile()){
                System.out.println("Creat");
            }else {
                System.out.println("Error");
            }
            FileWriter fw = new FileWriter(fitxer, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Les vegades que es repeteix la cadena al fitxer son: " + counter);
            bw.close();
            fw.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void escriureFitxer(String path){
        try {

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
