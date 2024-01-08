import java.util.ArrayList;

public class mediaAngajati {

    private static mediaAngajati instance;

    private mediaAngajati() {
    }

    public static mediaAngajati getInstance() {
        if (instance == null) {
            instance = new mediaAngajati();
        }
        return instance;
    }

    public Double calculeazaMedieAngajati(ArrayList<Angajati> listaAngajati) {
        if (listaAngajati.isEmpty()) {
            return null;
        }

        int sumaNote = 0;
        int numarAngajati = listaAngajati.size();

        for (Angajati angajat : listaAngajati) {
            sumaNote += angajat.nota;
        }

        return (double) sumaNote / numarAngajati;
    }
}
