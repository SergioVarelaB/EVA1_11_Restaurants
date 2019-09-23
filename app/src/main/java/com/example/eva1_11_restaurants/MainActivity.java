package com.example.eva1_11_restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Restaurants[] restaurantes = {
            new Restaurants(),
            new Restaurants(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
            new Restaurants(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
            new Restaurants(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
            new Restaurants(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),

    };

    ListView listaRestaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaRestaurantes = findViewById(R.id.ListaRestaurants);
        listaRestaurantes.setAdapter(new RestaurantAdapter(this, R.layout.layout_restaurant, restaurantes));
        listaRestaurantes.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, restaurantes[i].getNombre(), Toast.LENGTH_SHORT).show();

    }
}
