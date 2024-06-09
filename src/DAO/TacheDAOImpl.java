package DAO;

import Controller.DatabaseConnection;
import compo.Composite;
import compo.TacheElement;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Random;

public class TacheDAOImpl implements TacheDAO{

    private final DatabaseConnection con;
    private final TacheElement tacheElement;

    public TacheDAOImpl(DatabaseConnection con, TacheElement tacheElement) {
        this.con = con;
        this.tacheElement = tacheElement;
    }

    Random random = new Random();
    int id = random.nextInt(100);
    @Override
    public void creerTache(TacheElement tacheElement) {
        try {
            con.executeQuery("" +
                    "INSERT INTO tache " +
                    "VALUES('"+id+"', '"+tacheElement.getTitreTache()+"', " +
                    "'"+tacheElement.getDateDebut()+"', '"+tacheElement.getDateFin()+"')");


            JOptionPane.showConfirmDialog(null, "Tache ajouté au projet !");
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erreur de connexion à la BD"+ new RuntimeException(e));

        }
    }

    @Override
    public void creerTacheComposite(Composite composite) {
        try {
            con.executeQuery("" +
                    "INSERT INTO tache " +
                    "VALUES('"+id+"', '"+tacheElement.getTitreTache()+"', " +
                    "'"+tacheElement.getDateDebut()+"', '"+tacheElement.getDateFin()+"')");


            JOptionPane.showConfirmDialog(null, "Liste des Taches ajouté au Projet !");
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erreur de connexion à la BD"+ new RuntimeException(e));

        }
    }
}
