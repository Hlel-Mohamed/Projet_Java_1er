public class Adherent extends Utilisateur {
    private final int cin;

    public int getCin() {
        return this.cin;
    }

    public void rechercher() {

    }

    public void consulter_liste() {

    }

    public Adherent(String IDutlstr, String nom, String prenom, int cin) {
        super(IDutlstr, nom, prenom);
        this.cin = cin;
    }

    public Adherent(String IDutlstr, String login, String mdp, String nom, String prenom, String adresse, String type,
            int num_tel, int cin) {
        super(IDutlstr, login, mdp, nom, prenom, adresse, type, num_tel);
        this.cin = cin;
    }

}
