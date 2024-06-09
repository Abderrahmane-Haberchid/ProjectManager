package DAO;

import compo.Composite;
import compo.TacheElement;

public interface TacheDAO {

     void creerTache(TacheElement tacheElement);
     void creerTacheComposite(Composite composite);
}
