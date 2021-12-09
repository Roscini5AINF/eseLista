package com.example.eselista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class arraylist extends AppCompatActivity {
    ListView l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);
        l2=(ListView) findViewById(R.id.l2);
        List<String> peuropei=new ArrayList<String>();
        peuropei.add("Italia");
        peuropei.add("Francia");
        peuropei.add("Germania");
        peuropei.add("Paesi Bassi");
        peuropei.add("Spagna");
        peuropei.add("Svizzera");
        peuropei.add("Portogallo");
        peuropei.add("Russia");
        peuropei.add("Inghilterra");
        peuropei.add("Belgio");
        peuropei.add("Grecia");
        peuropei.add("Austria");
        peuropei.add("Romania");
        peuropei.add("Lituania");
        peuropei.add("Estonia");
        peuropei.add("Irlanda");
        peuropei.add("Islanda");
        peuropei.add("Finlandia");
        ArrayAdapter<String> adattatore= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peuropei);
        l2.setAdapter(adattatore);

    }
}