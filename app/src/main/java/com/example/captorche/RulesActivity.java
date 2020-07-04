package com.example.captorche;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.net.*;
import java.io.*;
import static java.util.Random.*;


public class RulesActivity extends AppCompatActivity {
    private View next;
    private TextView textView;
    private String[] consigne = {"C'est l'heure de l'apéro quelque part dans le monde, donc tout le monde prend 2","yec'hed mat","Si tu as codé l'appli prend un shot"};
    private int rnd;
    private String web="";
    //http://ydauvin.free.fr/CapTorche/regle/regle.json
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            URL url = new URL("http://ydauvin.free.fr/CapTorche/regle/regle.txt");
            InputStreamReader isr  = new InputStreamReader(url.openStream());
            BufferedReader in = new BufferedReader(isr);
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                web+=inputLine;
            }
            in.close();
            System.out.println(web);

        } catch (Exception e) {
            System.out.println("Error");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        next = findViewById(R.id.next);
        final TextView rules = findViewById (R.id.rules);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                    rnd = new Random().nextInt(consigne.length);
                    rules.setText(consigne[rnd]);

            }

        });


    }
}