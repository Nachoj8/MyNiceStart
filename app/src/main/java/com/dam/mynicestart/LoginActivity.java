package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Ventana de login
 * Tiene el icono de la app, dos Edit text para introducir usuario y contraseña.
 * Dos Button, uno de login y otro de quest
 * Y por ultimo un TextView donde pulsaremos para crear una cuenta
 * @author Nacho
 * @see SignupActivity
 */

public class LoginActivity extends AppCompatActivity {

    ImageView login;
    protected TextInputLayout mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        mPassword = (TextInputLayout)findViewById(R.id.password);
        login = findViewById(R.id.imgLogin);

        Glide.with(this)
                .load(R.drawable.imglogin)
                .centerCrop()
                //.transition(DrawableTransitionOptions.withCrossFade(500))
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorAccent)))
                //.circleCrop()
                //.diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(login);

    }

    public void registro (View view) {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }

    public void login (View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}