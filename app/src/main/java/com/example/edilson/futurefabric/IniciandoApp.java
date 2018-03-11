package com.example.edilson.futurefabric;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.widget.ImageView;

public class IniciandoApp extends AppCompatActivity {

    private ImageView mLogoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciando_app);

        mLogoImageView = findViewById(R.id.main_logo_imageview);


        new CountDownTimer(3000, 3000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                mLogoImageView.setImageResource(R.drawable.logoproduto);


                new CountDownTimer(2000, 2000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        Intent i = new Intent(IniciandoApp.this, TelaInicial.class);
                        startActivity(i);
                    }

                }.start();


            }
        }.start();
    }
}