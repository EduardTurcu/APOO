public class Trainers extends Persoana {
    String titlu;
    String companieExterna;

    public Trainers(String nume, int cod, String telefon, String titlu, String companieExterna) {
        super(nume, cod, telefon);
        this.titlu = titlu;
        this.companieExterna = companieExterna;
    }
    public void notificareNouCurs() {
        System.out.println("Trainer " + nume + " a fost notificat despre un nou curs.");
    }
}