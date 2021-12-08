package com.example.eselista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lista extends AppCompatActivity {
    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        l1=(ListView)findViewById(R.id.l1);
        String[] peuropei=new String[] { "Germania", "Francia", "Spagna", "Svizzera", "Italia", "Portogallo", "Russia", "Inghilterra", "Belgio", "Paesi Bassi", "Austria", "Grecia", "Irlanda", "Lituania", "Islanda", "Lituania", "Finlandia" };
        ArrayAdapter<String> adattatore= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peuropei);
        l1.setAdapter(adattatore);
    }
}