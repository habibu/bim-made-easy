package com.github.habibu.mywifi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import static com.github.habibu.mywifi.R.layout.activity_flash_screen;

public class FlashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(activity_flash_screen);
        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo splash com um timer.
             */
            @Override
            public void run() {
                // Esse método será executado sempre que o timer acabar
                // E inicia a activity principal
                Intent intent = new Intent(FlashScreen.this, MainActivity.class);
                startActivity(intent);

                // Fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
