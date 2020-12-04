package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Ventana MainActivity
 * Tiene un ImageView de usuario y un Button de login
 * @author Nacho
 * @see MainActivity2
 */

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgMain = findViewById(R.id.img);

        String url = ("https://bucket3.glanacion.com/anexos/fotos/67/3256867.jpg");

        Glide.with(this)
                .load(url)
                .centerCrop()
                //.transition(DrawableTransitionOptions.withCrossFade(500))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorAccent)))
                .circleCrop()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imgMain);

        // Para cargar imagen de internet en .load  "https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80"
    }

    public void main2(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}

