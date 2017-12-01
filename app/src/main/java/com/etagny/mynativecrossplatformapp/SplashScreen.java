package com.etagny.mynativecrossplatformapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by natixis-dev on 01/12/2017.
 */

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        final Animation zoom_in = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        //Animation out = AnimationUtils.loadAnimation(getContext(), R.anim.fade_out);
        ImageView logo = (ImageView) findViewById(R.id.logo);
        logo.startAnimation(zoom_in);
        logo.postDelayed(new Runnable() {
            @Override
            public void run() {
                animationEnded();
            }
        }, 1000);
    }

    public void animationEnded() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}