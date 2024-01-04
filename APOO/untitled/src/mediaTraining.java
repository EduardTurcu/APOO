import java.awt.*;
import java.awt.List;
import java.util.ArrayList;


public class mediaTraining {
    public static double calculeazaMedieTrainig(ArrayList<Formare> cursuriFormare) {
        int sumaNote = 0;
        int numarCursuri = cursuriFormare.size();

        for (Formare curs : cursuriFormare) {
            sumaNote += curs.angajat.nota;
        }

        if (numarCursuri > 0) {
            return (double) sumaNote / numarCursuri;
        } else {
            return 0.0;
        }
    }
}
