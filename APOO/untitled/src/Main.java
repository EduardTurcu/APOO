import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            LocalDate dataInceput = LocalDate.of(2023, 1, 1);
            LocalDate dataSfarsit = LocalDate.of(2023, 12, 31);

            Trainers trainer1 = new Trainers("Trainer1", 1000, "090929292", "Titlu1", "Amazon");
            Angajati angajat1 = new Angajati("Angajat1", 1000, "09877654", 9  );
            Angajati angajat3 = new Angajati("Angajat3", 3000, "982982922", 10);
            Formare formare1 = new Formare(1000, "Programare Low Code", angajat1, trainer1, StareCursuriFormare.DESCHIS, dataInceput, dataSfarsit);

            Trainers trainer2 = new Trainers("Trainer2", 2000, "090299292","Titlu2", "Google");
            Angajati angajat2 = new Angajati("Angajat2", 2000, "98298289", 8);
            Formare formare2 = new Formare(2000, "Power BI", angajat2, trainer2, StareCursuriFormare.DESCHIS, dataInceput, dataSfarsit);

            ArrayList<Formare> cursuriFormare = new ArrayList<>();
            cursuriFormare.add(formare1);
            cursuriFormare.add(formare2);

            double mediaFormare = mediaTraining.calculeazaMedieTrainig(cursuriFormare);
            System.out.println("Media notelor angajatilor pentru toate cursurile de formare: " + mediaFormare);


            ArrayList<Angajati> listaAngajati = new ArrayList<>();
            listaAngajati.add(angajat1);
            listaAngajati.add(angajat2);
            listaAngajati.add(angajat3);

            double MediaAngajati = mediaAngajati.calculeazaMedieAngajati(listaAngajati);
            System.out.println("Media notelor tuturor angajatilor: " + MediaAngajati);

            formare1.adaugaObservator(trainer1);
            formare1.adaugaObservator(trainer2);

            formare1.notificareTrainers();
            StareCursuriFormare currentState = formare1.getStare();

            System.out.println("Note angajați:");
            for (Angajati angajat : listaAngajati) {
                    System.out.println(angajat.nume + ": " + angajat.nota);
            }

            formare1.asignareAngajatLaCurs(angajat1, trainer1);
            formare2.asignareAngajatLaCurs(angajat2, trainer2);

            Trainers trainer3 = new Trainers("Trainer3", 3000, "090299292","Titlu3", "LowCode");
            formare1.asignareTrainerLaCurs(trainer3);

    }
}