package com.example.tablas_multiplicar;

public class GeneraTablas {
    String tab;
    public String tablas(int n)
    {

        tab = "";
        tab="Tabla del "+String.valueOf(n);
        tab+= "\n";
        int multi;
        for(int i =1;i<=10;i++)
        {
            multi = n*i;
            tab +=n+"x"+i+"="+String.valueOf(multi);
            tab+= "\n";

        }
        return tab;
    }
}
