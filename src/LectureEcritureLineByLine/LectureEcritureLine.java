package LectureEcritureLineByLine;

import java.io.*;

public class LectureEcritureLine  {
    public static void main(String[] ar) throws Exception {

        File fi= new File("D:\\APPLICATION_JAVA\\GestionFiles\\src\\LectureEcritureCharByChar\\monFichier");
        File fi2 = new File(fi.getName()+"_copieLineByLine");

        //Lecture ligne par ligne d'un fichier
        FileReader fr= new FileReader(fi);
        BufferedReader br= new BufferedReader(fr);

        //Ecriture ligne par ligne dans un fichier
        FileWriter fw= new FileWriter(fi2);
        BufferedWriter bw= new BufferedWriter(fw);
        String s=br.readLine();
        while(s!=null)
        {bw.append(s);
            s=br.readLine();
        //FileOutputStream fos= new FileOutputStream(bw);
    }

        bw.close();
        fw.close();
}
}
