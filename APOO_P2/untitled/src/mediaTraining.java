import java.util.ArrayList;

public class mediaTraining {

    private static mediaTraining instance;

    private mediaTraining() {
    }

    public static mediaTraining getInstance() {
        if (instance == null) {
            instance = new mediaTraining();
        }
        return instance;
    }

    public double calculeazaMedieTraining(ArrayList<Formare> cursuriFormare) {
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
