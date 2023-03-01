public class Document {
    private final String IDdoc;
    public final String titre,autheur;
    public int nb_copies;
    public static int nb_disponible;


    public String getIDdoc() {
        return this.IDdoc;
    }


    public void ajouter() {
        
    }

    public void retirer() {
        
    }


    public Document(String IDdoc, String titre, String autheur) {
        this.IDdoc = IDdoc;
        this.titre = titre;
        this.autheur = autheur;
    }


    public Document(String IDdoc, String titre, String autheur, int nb_copies) {
        this.IDdoc = IDdoc;
        this.titre = titre;
        this.autheur = autheur;
        this.nb_copies = nb_copies;
    }


}
