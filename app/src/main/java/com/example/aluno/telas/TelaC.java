package com.example.aluno.telas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by aluno on 29/09/2016.
 */
public class TelaC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_c);
        String [] lista = {"Pedro, Tiago, João, Jesus"};
        ArrayAdapter<String>adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        ListView listaNome = (ListView) findViewById(R.id.Lista);
        listaNome.setAdapter(adaptador);

    }
}
