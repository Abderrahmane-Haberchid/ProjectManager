package View;

import Controller.TacheController;
import DAO.TacheDAO;
import compo.TacheElement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreerTache extends JFrame{
    public JPanel addProjectPanel;
    private JButton addTacheBtn;
    private JTextField dateDebutTxt;
    private JTextField dateFinTxt;
    private JTextField tacheTitreTxt;

    TacheController tacheController = new TacheController();

    public CreerTache(){

        addTacheBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Home home = new Home();
                home.setContentPane(home.homePanel);
                home.setSize(400, 600);
                home.setTitle("Project Manager");
                home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                home.setVisible(true);

                TacheElement tacheElement = new TacheElement(tacheTitreTxt.getText(), dateDebutTxt.getText(), dateFinTxt.getText());
                tacheController.ajouterTache(tacheElement);

            }
        });
    }
}
