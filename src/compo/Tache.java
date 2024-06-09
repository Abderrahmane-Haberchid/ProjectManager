package compo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Tache {


    protected String titreTache;
    protected String dateDebut;
    protected String dateFin;
    protected int level;

    public Tache(String titreTache, String dateDebut, String dateFin){
        this.titreTache = titreTache;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.level = 0;
    }

    void afficherTaches(){}

    public String getTitreTache() {
        return titreTache;
    }

    public void setTitreTache(String titreTache) {
        this.titreTache = titreTache;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
