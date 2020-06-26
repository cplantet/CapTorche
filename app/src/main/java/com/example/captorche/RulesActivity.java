package com.example.captorche;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RulesActivity extends AppCompatActivity {
    private View next;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        next = (View) findViewById(R.id.next);
        final TextView rules = (TextView) findViewById (R.id.rules);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rules.setText("ssgdsg");
            }

        });


    }
}