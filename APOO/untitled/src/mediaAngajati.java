import java.awt.List;
import java.util.ArrayList;
public class mediaAngajati {
public static Double calculeazaMedieAngajati(ArrayList<Angajati> listaAngajati) {
    if (listaAngajati.isEmpty()) {
        return null;  // Semnalează că nu există angajați pentru a calcula media
    }

    int sumaNote = 0;
    int numarAngajati = listaAngajati.size();

    for (Angajati angajat : listaAngajati) {
        sumaNote += angajat.nota;
    }
    return (double) sumaNote / numarAngajati;
}
}
