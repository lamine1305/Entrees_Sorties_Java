import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestionFiles {

    public static void main(String[]ar) {

        //Lister les repertoire et les fichiers jusqu'à deux niveaux
        File files = new File("D:/APPLI_MOBILE");
        List<String> listSousRep = new ArrayList<>();
        for (String fileName : files.list()) {
            File souFiles = new File(fileName);
            //si souFiles est un fichier
            if (souFiles.isFile())
                System.out.println(fileName + "      est un fichier ");
            else {
                System.out.println(fileName + "      est un répertoire ");
                listSousRep.add("D:/APPLI_MOBILE/" + fileName);
            }
        }
        for (String s : listSousRep) {
            File file2 = new File(s);
            for (String fileName2 : file2.list()) {
                File files2 = new File(s + "/" + fileName2);

                if (files2.isDirectory())
                    System.out.println(s + "/" + fileName2 + "      est un REPERTOIRE ");
                else
                    System.out.println(s + "/" + fileName2 + "      est un FICHIER ");

            }
        }
    }
    //Lire un fichier



    }




