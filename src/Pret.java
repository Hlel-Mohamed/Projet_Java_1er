import java.time.Period;
import java.util.Date;

public class Pret {

    private final Date date_pret;
    private Date date_retour;
    private Period preiod_pret;


    public Date getDate_pret() {
        return this.date_pret;
    }


    public Date getDate_retour() {
        return this.date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public Period getPreiod_pret() {
        return this.preiod_pret;
    }

    public void setPreiod_pret(Period preiod_pret) {
        this.preiod_pret = preiod_pret;
    }

    public Pret(Date date_pret) {
        this.date_pret = date_pret;
    }


    public Pret(Date date_pret, Date date_retour, Period preiod_pret) {
        this.date_pret = date_pret;
        this.date_retour = date_retour;
        this.preiod_pret = preiod_pret;
    }

    public void emprunter(){

    }

    public void annuler_emprunt(){
        
    }
    
}