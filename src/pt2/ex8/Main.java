package pt2.ex8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ;
        System.out.println(llegirFitxerBinariBuffered("files/file1.txt") );
    }
    public static ArrayList<Byte> llegirFitxerBinariBuffered(String path) {
        try {
            ArrayList<Byte> res = new ArrayList<Byte>();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
            byte b;
            while ((b = (byte)bis.read()) != -1) {
                res.add(b);
            }
            bis.close();
            zzz
            return res;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
