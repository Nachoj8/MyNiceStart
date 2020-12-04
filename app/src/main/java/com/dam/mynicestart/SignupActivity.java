package com.dam.mynicestart;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Ventana de Signup
 * Tiene el icono de la app, tres Edit text para introducir usuario, contraseña y email
 * Dos Button, uno de Sign up y otro de cancel para volver al login
 * @author Nacho
 * @see SignupActivity
 */

public class SignupActivity extends AppCompatActivity {

    ImageView logo;
    ImageView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.imgSignup);

     /*   logo = (ImageView) findViewById(R.id.imageView2);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        logo.startAnimation(myanim); */

        Glide.with(this)
                .load(R.drawable.imgregistro)
                .centerCrop()
                //.transition(DrawableTransitionOptions.withCrossFade(500))
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorAccent)))
                //.circleCrop()
                //.diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(signup);

    }

    public void cancelar (View view) {
        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
