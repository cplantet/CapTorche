package com.example.captorche;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class RulesActivity extends AppCompatActivity {
    private View next;
    private Document document;
    private TextView textView;
    private Choose choose=new Choose();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

      /*      File file=new File(String.valueOf(R.xml.rules));
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            System.out.println(document);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        }*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        next = findViewById(R.id.next);
        final TextView rules = findViewById (R.id.rules);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rules.setText(choose.nextRules());
            }

        });


    }
}