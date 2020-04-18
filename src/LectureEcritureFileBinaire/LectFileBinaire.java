package LectureEcritureFileBinaire;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LectFileBinaire {
    public static void main(String[] ar) throws Exception {

        File fi = new File("D:\\APPLICATION_JAVA\\GestionFiles\\src\\LectureEcritureFileBinaire\\FichierBinaire");
        File fi2 = new File("copie_"+fi.getName()  );

        //Lecture d'un fichier binaire qui peut etre
        FileInputStream fis = new FileInputStream(fi);
        FileOutputStream fos = new FileOutputStream(fi2);
        int b = fis.read();
        while (b > -1) {
            fos.write(b+1);
            b = fis.read();
        }
        fis.close();
        fos.close();

    }

}
