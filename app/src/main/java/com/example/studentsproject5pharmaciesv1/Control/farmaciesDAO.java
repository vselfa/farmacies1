package com.example.dracnegre;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.dracnegre.Model.Punts;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class res extends AppCompatActivity {

}
    FirebaseDatabase database;
    DatabaseReference myRef;
    TextView resEquip, respEqpr, respJupr;
    // Referencia al node de RTDB
    String classificacio;
    Punts punts;
    // 1.- La classe per ordenar
    static MainActivity.MySort sort = new MainActivity.MySort();
    // 2.- El hashmap ordenat
    // Canviem l'ordre del camp en el hashmap per ordenar
    HashMap<Punts, String> hashMapEquips;
    private TreeMap<Punts, String> treeMap = new TreeMap<>(sort);
    private Set<Punts> keys;
    TextView equipsClassificats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clas_drac_a);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        
    }
}
