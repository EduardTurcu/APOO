import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Formare {
    int cod;
    String titlu;
    Angajati angajat;
    Trainers trainer;
    List<Trainers> observatori = new ArrayList<>();
    StareCursuriFormare stare;
    LocalDate dataInceput;
    LocalDate dataSfarsit;

    public Formare(int cod, String titlu, Angajati angajat, Trainers trainer,
                   StareCursuriFormare stare, LocalDate dataInceput, LocalDate dataSfarsit) {
        this.angajat = angajat;
        this.trainer = trainer;
        this.stare =  stare;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.titlu = titlu;
        this.cod = cod;
    }

    public void adaugaObservator(Trainers observator) {
        observatori.add(observator);
    }

    public void notificareTrainers() {
        for (Trainers observator : observatori) {
            observator.notificareNouCurs();
        }
    }

    public StareCursuriFormare getStare() {
        return stare;
    }

    public void asignareAngajatLaCurs(Angajati angajat, Trainers trainer) {
        this.angajat = angajat;
        this.trainer = trainer;
        System.out.println(angajat.nume + " a fost asignat la cursul condus de " + trainer.nume);
    }
    public void asignareTrainerLaCurs(Trainers trainer) {
        this.trainer = trainer;
        System.out.println(trainer.nume + " a fost asignat la cursul condus de " + this.trainer.nume);
    }
}
