package LectureEcritureCharByChar;

import java.io.*;

public class LectureCharByChar {
    public static void main(String[] ar) throws Exception {

        File fi= new File("D:\\APPLICATION_JAVA\\GestionFiles\\src\\LectureEcritureCharByChar\\monFichier");
        File fi2 = new File(fi.getName()+"_copie");

        //Lecture caractère par caractère
        FileReader frd= new FileReader(fi);
        //Ecriture caractère par caractère
        FileWriter fr= new FileWriter(fi2);

        int s=frd.read();
        while(s!=-1)
        {
            System.out.print(s);
            fr.write(s);
            s=frd.read();

        }
        fr.close();
        frd.close();
    }
}
