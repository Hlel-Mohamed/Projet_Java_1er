import java.util.Date;

public class Bibliothecaire extends Utilisateur {
    private int salaire;
    private final Date date_debut_travail;
    private String poste_travail;

    public int getSalaire() {
        return this.salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public Date getDate_debut_travail() {
        return this.date_debut_travail;
    }

    public String getPoste_travail() {
        return this.poste_travail;
    }

    public void setPoste_travail(String poste_travail) {
        this.poste_travail = poste_travail;
    }

    public void ajouter_adh() {

    }

    public void modifier_adh() {

    }

    public void supprimer_adh() {

    }

    public Bibliothecaire(String IDutlstr, String nom, String prenom, Date date_debut_travail) {
        super(IDutlstr, nom, prenom);
        this.date_debut_travail = date_debut_travail;
    }

    public Bibliothecaire(String IDutlstr, String login, String mdp, String nom, String prenom, String adresse,
            String type, int num_tel, int salaire, Date date_debut_travail, String poste_travail) {
        super(IDutlstr, login, mdp, nom, prenom, adresse, type, num_tel);
        this.salaire = salaire;
        this.date_debut_travail = date_debut_travail;
        this.poste_travail = poste_travail;
    }

}
