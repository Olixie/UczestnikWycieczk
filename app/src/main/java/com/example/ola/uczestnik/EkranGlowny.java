package com.example.ola.uczestnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class EkranGlowny extends AppCompatActivity {

    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_glowny);

    }

    public void runMap (View view) {
        Intent intencja = new Intent(this, MapsActivity.class);
        startActivity(intencja);
    }
    public void showAparat(View view){
        Intent intencja = new Intent(this, Zrob_Zdjecie.class);
        startActivity(intencja);
    }
    public void showWycieczkaList(View view){
        Intent intencja = new Intent(this, Plan_Wycieczki.class);
        startActivity(intencja);
    }
}
