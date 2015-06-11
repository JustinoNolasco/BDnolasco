package com.example.nolasco.bdnolasco;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class Base extends ActionBarActivity {
    //declaracion de los campos
    EditText ed_idabarrote,ed_nombre,ed_apellidos,ed_direccion,ed_telefono,ed_mercancia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
//declaracion del id para la conexion
        ed_idabarrote = (EditText) findViewById(R.id.id_abarrote);
        ed_nombre =(EditText)findViewById(R.id.nombre);
        ed_apellidos =(EditText)findViewById(R.id.apellidos);
        ed_direccion =(EditText)findViewById(R.id.direccion);
        ed_telefono = (EditText)findViewById(R.id.telefono);
        ed_mercancia = (EditText)findViewById(R.id.mercancia);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
