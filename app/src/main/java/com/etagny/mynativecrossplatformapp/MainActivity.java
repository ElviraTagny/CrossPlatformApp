package com.etagny.mynativecrossplatformapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcome = (Button) findViewById(R.id.welcomeButton);
        Animation bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        welcome.setAnimation(bounce);
        welcome.animate();
        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url)));
                startActivity(browserIntent);
            }
        });
    }
}
