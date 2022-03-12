package com.example.tablas_multiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Pantalla2 extends AppCompatActivity {
    public ImageView bac2;
    public TextView titulo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        bac2 = (ImageView) findViewById(R.id.btnBack);
        titulo2 = (TextView) findViewById(R.id.title);
        titulo2.setText("About");

        bac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}