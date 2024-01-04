import java.util.ArrayList;

public interface Facade {
    Double calculeazaMedieAngajati(ArrayList<Angajati> listaAngajati);

    double calculeazaMedieTraining(ArrayList<Formare> cursuriFormare);

    void adaugaObservator(Formare formare, Trainers observator);

    void notificareTrainers(Formare formare);

   // int getNotaAngajat(Formare formare);
}
