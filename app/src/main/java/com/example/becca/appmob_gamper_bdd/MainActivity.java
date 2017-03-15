package com.example.becca.appmob_gamper_bdd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ChapitreBDD chapitreBDD = new ChapitreBDD(this);

        Chapitre chapitre = new Chapitre("General Nogi au nez ebreche", "Chapitre de Le demon de l'ile solitaire d'Edogawa Ranpo");
        chapitreBDD.open();
        chapitreBDD.insertChapitre(chapitre);
        Toast.makeText(this, chapitre.toString(), Toast.LENGTH_LONG).show();

        chapitreBDD.close();
    }
}
