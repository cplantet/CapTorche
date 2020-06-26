package com.example.captorche;
import com.example.captorche.model.*;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SoloActivity extends AppCompatActivity {

    ArrayList<EditText> joueurText = new ArrayList<EditText>();
    Users players;

    public SoloActivity(){
        /*
        joueurText.add((EditText) findViewById(R.id.J1));
        joueurText.add((EditText) findViewById(R.id.J2));
        joueurText.add((EditText) findViewById(R.id.J3));
        joueurText.add((EditText) findViewById(R.id.J4));
        joueurText.add((EditText) findViewById(R.id.J5));
        joueurText.add((EditText) findViewById(R.id.J6));
        joueurText.add((EditText) findViewById(R.id.J7));
        joueurText.add((EditText) findViewById(R.id.J8));
        players = new Users();

        for(int i = 0;i<8;i++){

            String joueurNom = joueurText.get(i).getText().toString();
            if(joueurNom != "") {
                players.addUser(joueurNom);
            }
        }
        */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);
    }


}
