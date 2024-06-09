
import View.Home;

import javax.swing.*;

public class Main {


    public static void main(String[] args)  {

        Home home = new Home();
        home.setContentPane(home.homePanel);
        home.setSize(400, 600);
        home.setTitle("Project Manager");
        home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        home.setVisible(true);


    }

}
