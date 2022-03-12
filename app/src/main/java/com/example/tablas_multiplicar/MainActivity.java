package com.example.tablas_multiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public ImageView logo;
    public TextView by,enterprice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        logo = (ImageView) findViewById(R.id.imglogo);
        by=(TextView) findViewById(R.id.txtby);
        enterprice = (TextView) findViewById(R.id.txtempresa);

        logo.setAnimation(animacion);
        by.setAnimation(animacion2);
        enterprice.setAnimation(animacion2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),Pantalla1.class);
                startActivity(i);
                finish();
            }
        },5000);



    }
}