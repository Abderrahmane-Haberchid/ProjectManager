package compo;

import java.util.Date;

public class TacheElement extends Tache{
    public TacheElement(String titreTache, String dateDebut, String dateFin) {
        super(titreTache, dateDebut, dateFin);
    }

    @Override
    public void afficherTaches() {
        String tab = "";
        for (int i = 0; i <= level; i++)
            tab += "\t";

        System.out.println(tab+ "Tache: "+ titreTache);
    }


}
