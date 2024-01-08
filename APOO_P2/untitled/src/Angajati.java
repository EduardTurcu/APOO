public class Angajati extends Persoana {
    int nota;
    public Angajati(String nume, int cod, String telefon, int nota) {
        super(nume, cod, telefon);
        this.nota = nota;
    }
}
