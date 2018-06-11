package com.example.ola.uczestnik;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Szukaj extends AppCompatActivity {

    private GoogleMap mMap;
    private Marker currentLocationMarker, guide;
    private String lon, lan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szukaj);

        lon ="14.5400964";
        lan = "53.4282337";
        showUser(lon, lan);
    }



    public void showUser(String lon, String lan){
        Intent intencja = new Intent(this, ZnajdzPrzewodnika.class);
        // TextView textViewLo = (TextView) findViewById(R.id.lon);
        //intencja.putExtra("Longitude", "14.5937644");
        intencja.putExtra("Longitude",lon );
        //TextView textViewLa = (TextView) findViewById(R.id.lat);
        //intencja.putExtra("Longitude", "53.4682782");
        intencja.putExtra("Latitude", lan);
        startActivity(intencja);
    }
}
