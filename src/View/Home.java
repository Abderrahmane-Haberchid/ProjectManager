package View;

import Controller.TacheController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame{
    public JPanel homePanel;
    public JButton showProjectBtn;
    private JButton addTacheBtn;

   TacheController tacheController;

    public Home() {

        addTacheBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CreerTache creerProjet = new CreerTache();

                creerProjet.setContentPane(creerProjet.addProjectPanel);
                creerProjet.setSize(500, 600);
                creerProjet.setTitle("Creer un Projet");
                creerProjet.setVisible(true);
                setVisible(false);
            }
        });
        showProjectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreerListeTache creer = new CreerListeTache();

                creer.setContentPane(creer.addProjectPanel);
                creer.setSize(500, 600);
                creer.setTitle("Creer un Projet");
                creer.setVisible(true);
                setVisible(false);
            }
        });
    }
}
