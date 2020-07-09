package com.example.captorche;

import java.util.Random;

public class Choose {
    //http://ydauvin.free.fr/CapTorche/regle/regle.txt
    private String str;
    private String[] consigne;
    private String[] joueurs;

    public Choose(){
        this.consigne = new String[]{

                "C'est l'heure de l'apéro quelque part dans le monde, donc tout le monde prend 2",
                "yec'hed mat",
                "Si tu as codé l'appli prend un shot",
                "# bois 3"
        };
        this.joueurs = new String[]{

                "Célia",
                "Alexandre",
                "Cédric",
                "Thomas",
                "Yann",
                "Bastien",
        };
    }



    public String nextRules(){
        int rndC = new Random().nextInt(consigne.length);
        int rndJ = new Random().nextInt(joueurs.length);
        str = consigne[rndC].replaceAll("#", joueurs[rndJ]);
        return str;
    }

}
