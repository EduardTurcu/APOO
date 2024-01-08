import java.util.ArrayList;
import java.util.List;

public abstract class TrainingFacade implements Facade {
    private mediaTraining MediaTraining;
    private mediaAngajati MediaAngajati;

    public TrainingFacade() {
        MediaTraining = mediaTraining.getInstance();
        MediaAngajati = mediaAngajati.getInstance();
    }

    @Override
    public void assignEmployeeToTraining(Angajati angajat, Trainers trainer, Formare formare) {
        formare.asignareAngajatLaCurs(angajat, trainer);
    }

    @Override
    public void assignTrainerToTraining(Trainers trainer, Formare formare) {
        formare.asignareTrainerLaCurs(trainer);
    }

    @Override
    public void notifyTrainers(Formare formare) {
        formare.notificareTrainers();
    }

    @Override
    public void displayEmployeeGrades(List<Angajati> listaAngajati) {
        // Implement the logic to display employee grades
    }

    @Override
    public double calculateEmployeeAverageGrade(List<Angajati> listaAngajati) {
        return MediaAngajati.calculeazaMedieAngajati(new ArrayList<>(listaAngajati));
    }
}
