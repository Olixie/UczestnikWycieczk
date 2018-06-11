package com.example.ola.uczestnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dodaj_notatke extends AppCompatActivity {

    EditText title, content;
    Button buttonDOdaj;

    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_notatke);databaseReference = FirebaseDatabase.getInstance().getReference();

        title = (EditText) findViewById(R.id.title);
        content = (EditText) findViewById(R.id.content);
        buttonDOdaj = (Button) findViewById(R.id.buttonDodaj);

        buttonDOdaj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                addNote();
            }
        });
    }

    private void addNote(){
        String tytul = title.getText().toString().trim();
        String tresc = content.getText().toString().trim();

        if(tytul.isEmpty() == true || tresc.isEmpty() == true){
            Toast.makeText(this, "Uzupełnij dane", Toast.LENGTH_LONG).show();
        }
        else{

            String id = databaseReference.push().getKey();
            Notka notka = new Notka(tytul,tresc);

            databaseReference.child("notatki").child(id).setValue(notka);

            Toast.makeText(this, "Dodano notatke", Toast.LENGTH_LONG).show();



        }
    }
    @Override
    public void onBackPressed(){
        this.startActivity(new Intent(getApplicationContext(), EkranGlowny.class));
    }
}