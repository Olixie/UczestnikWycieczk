package com.example.ola.uczestnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class EkranGlowny extends AppCompatActivity {

    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_glowny);

    }


    public void showWycieczkaList(View view){
        Intent intencja = new Intent(this, Plan_Wycieczki.class);
        startActivity(intencja);
    }

    public void runMap (View view) {
        try{Intent intencja = new Intent(this, MapsActivity.class);
            startActivity(intencja);}
        catch(Exception ex){
            Toast.makeText(getApplicationContext(), "Brak pozwolenia", Toast.LENGTH_SHORT).show();

        }
    }

    public void addNote (View view) {
        Intent intencja = new Intent(this, Dodaj_notatke.class);
        startActivity(intencja);
    }

    public void showNotes (View view) {
        Intent intencja = new Intent(this, Lista_notatek.class);
        startActivity(intencja);
    }
    public void showAparat(View view){
        Intent intencja = new Intent(this, Zrob_Zdjecie.class);
        startActivity(intencja);
    }

    public void showMessage(View view){
        Intent intencja = new Intent(this, Lista_wiadomosci.class);
        startActivity(intencja);
    }

    public void findGuide(View view){
        Intent intencja = new Intent(this, Szukaj.class);
        startActivity(intencja);
    }


    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Naciśnij ponownie aby wyjść", Toast.LENGTH_LONG).show();

        this.startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
