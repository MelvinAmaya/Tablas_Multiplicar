package com.example.tablas_multiplicar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Pantalla1 extends AppCompatActivity {

    public TextView txttabla,titulo;
    public Spinner OpcionesTabla;
    String tab;
    int nu;
    public EditText otro;
    public Button cal;
    int cont;
    public String  operacion;
public ImageView bac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        txttabla = (TextView) findViewById(R.id.txtResultado);
        OpcionesTabla = (Spinner) findViewById(R.id.spTabla);
        otro = (EditText) findViewById(R.id.txtOtro);
        cal = (Button) findViewById(R.id.btnCalcular);
        bac = (ImageView) findViewById(R.id.btnBack);
        titulo = (TextView) findViewById(R.id.title);

        bac.setVisibility(View.INVISIBLE);
        titulo.setText("Tablas de Multiplicar");


        Toolbar toolbar = findViewById(R.id.lbtoolbar);
        setSupportActionBar(toolbar);



        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.ComboTabla, android.R.layout.simple_spinner_item);
        OpcionesTabla.setAdapter(adapter);

        OpcionesTabla.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            operacion = parent.getItemAtPosition(position).toString();
            calcular(operacion);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular(operacion);

            }
        });
    }

    public void calcular(String op)
    {
        GeneraTablas tb = new GeneraTablas();
        switch (op)
        {
            case "Tabla 1":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=1;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 2":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=2;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 3":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=3;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 4":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=4;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 5":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=5;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 6":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=6;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 7":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=7;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 8":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=8;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 9":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=9;
                tab= tb.tablas(nu);
                txttabla.setText(tab);
                break;
            case "Tabla 10":
                otro.getText().clear();
                cal.setVisibility(View.INVISIBLE);
                otro.setVisibility(View.INVISIBLE);
                cont =0;
                nu=10;
                tab= tb.tablas(nu);
                txttabla.setText(tab);

                break;
            case "Otros":

                cont ++;
                if (cont ==1)
                {
                    otro.setVisibility(View.VISIBLE);
                    cal.setVisibility(View.VISIBLE);

                }
                else
                {
                    if (otro.getText().toString().trim().equals(""))
                    {
                        Toast.makeText(getApplicationContext(),"Ingrese el numero...",Toast.LENGTH_LONG);
                    }
                    else
                    {
                        nu=Integer.parseInt(otro.getText().toString().trim());
                        tab= tb.tablas(nu);
                        txttabla.setText(tab);
                        otro.getText().clear();

                    }
                }

                break;
            default:
                Toast.makeText(getApplicationContext(),"Elija una opción",Toast.LENGTH_LONG);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.mnAbout:
                Intent i = new Intent(getApplicationContext(),Pantalla2.class);
                startActivity(i);
                return true;

            default:
                return onOptionsItemSelected(item);
        }

    }

}