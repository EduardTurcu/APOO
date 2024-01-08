import java.util.List;

public interface Facade {
    void assignEmployeeToTraining(Angajati angajat, Trainers trainer, Formare formare);
    void assignTrainerToTraining(Trainers trainer, Formare formare);
    void notifyTrainers(Formare formare);
    void displayEmployeeGrades(List<Angajati> listaAngajati);
    double calculateEmployeeAverageGrade(List<Angajati> listaAngajati);
}
