package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        openApp(true);

        TextView mySubtitle = (TextView) findViewById(R.id.textView4);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mySubtitle.startAnimation(myanim);

        openApp(true);

        ImageView  mSurf = findViewById(R.id.surf);

        Glide.with(this)
                .load(R.drawable.surf)
                .centerCrop()
                //.transition(DrawableTransitionOptions.withCrossFade(500))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorAccent)))
               // .circleCrop()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(mSurf);

      // Para cargar imagen de internet en .load  "https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80"
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);
    }
}