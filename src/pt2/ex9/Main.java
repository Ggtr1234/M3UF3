package pt2.ex9;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String path = "files/file1.txt";
        String directori = "files";
        escriureArchiu(directori,llegirBytes(path));
    }
    public static byte[] llegirBytes(String path){
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
            int len = bis.available();
            byte[] res = new byte[len];
            bis.read(res);
            bis.close();
            return res;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void escriureArchiu(String directori,byte[] res){
        try{
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(directori,"Copia.txt")));
            bos.write(res);
            bos.close();
            System.out.println("Escrito correctamente");
        }catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
