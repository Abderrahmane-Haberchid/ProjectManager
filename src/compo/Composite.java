package compo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Composite extends Tache{

    List<Tache> tacheList = new ArrayList<>();

    public Composite(String titreTache, String dateDebut, String dateFin) {

        super(titreTache, dateDebut, dateFin);
    }

    @Override
    public void afficherTaches() {
        String tab = "";
        for (int i = 0; i <= level; i++)
            tab += "\t";

        System.out.println(tab+"Liste Tache: "+titreTache);

        for (Tache t: tacheList){
            t.afficherTaches();
        }
    }

    public Tache ajouterTache(Tache tache) {
        tache.level = this.level + 1;
        tacheList.add(tache);
        return tache;
    }
}
