package com.example.eselista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class lista extends AppCompatActivity {
    ListView l1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        b2=(Button)findViewById(R.id.b2);
        l1=(ListView)findViewById(R.id.l1);
        String[] peuropei=new String[] { "Germania", "Francia", "Spagna", "Svizzera", "Italia", "Portogallo", "Russia", "Inghilterra", "Belgio", "Paesi Bassi", "Austria", "Grecia", "Irlanda", "Lituania", "Islanda", "Lituania", "Finlandia" };
        ArrayAdapter<String> adattatore= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peuropei);
        l1.setAdapter(adattatore);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);
            }
        });
    }
    public void play(View r){
        Intent i=new Intent(getApplicationContext(), arraylist.class);
        startActivity(i);
    }
}