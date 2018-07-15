package com.androidmorefast.moden.appnavegador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText navegador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navegador =(EditText)findViewById(R.id.txtNavegador);
    }

    public void ver (View v) {
        Intent i=new Intent(this,Navegador.class);
        i.putExtra("direccion", navegador.getText().toString());
        startActivity(i);
    }
}
