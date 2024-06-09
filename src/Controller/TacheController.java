package Controller;

import DAO.TacheDAO;
import DAO.TacheDAOImpl;
import compo.TacheElement;

import java.sql.SQLException;

public class TacheController {

     TacheDAOImpl tacheDAO;

    public void ajouterTache(TacheElement tacheElement) {
        tacheDAO.creerTache(tacheElement);

    }

    public void showAllTache() throws SQLException {

    }
}
