package com.example.eva1_11_restaurants;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

public class RestaurantAdapter extends ArrayAdapter<Restaurants> {
    Context context;
    int resource;
    Restaurants[] restaurantes;

    public RestaurantAdapter(Context context, int resource, Restaurants[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.restaurantes = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView txtNombre, txtDesc, textView;

        if(convertView == null){
            //Crear nuestro layout que representa una fila en la lista
            //INFLATER
            LayoutInflater lInflator = ((Activity) context).getLayoutInflater();
            convertView = lInflator.inflate(resource, parent, false);
        }

        imageView = convertView.findViewById(R.id.imageView);
        txtNombre = convertView.findViewById(R.id.txt_nombre);
        txtDesc = convertView.findViewById(R.id.txt_descripcion);

        imageView.setImageResource(restaurantes[position].getImagen());
        txtNombre.setText(restaurantes[position].getNombre());
        txtDesc.setText(restaurantes[position].getDescripcion());

        return convertView;
    }
}
