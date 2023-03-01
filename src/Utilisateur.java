public abstract class Utilisateur {
    private final String IDutlstr, nom, prenom;
    private String login, mdp, adresse, type;
    private int num_tel;

    public String getIDutlstr() {
        return this.IDutlstr;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum_tel() {
        return this.num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public void inscription() {

    }

    public Utilisateur(String IDutlstr, String nom, String prenom) {
        this.IDutlstr = IDutlstr;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Utilisateur(String IDutlstr, String login, String mdp, String nom, String prenom, String adresse,
            String type, int num_tel) {
        this.IDutlstr = IDutlstr;
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.type = type;
        this.num_tel = num_tel;
    }

}
