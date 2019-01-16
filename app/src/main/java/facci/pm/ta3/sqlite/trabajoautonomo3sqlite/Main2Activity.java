package facci.pm.ta3.sqlite.trabajoautonomo3sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
Button enviar ;
EditText cedula,nombre,apellido,departamento, fecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    cedula =(EditText)findViewById(R.id.txtCedula);
        cedula =(EditText)findViewById(R.id.txtCedula);


    }

    private void insertedDates(){

////////////////////////


        Intent intent = new Intent(Main2Activity.this,MainActivity.class);

        intent.putExtra("cedula",cedula.getText().toString());
        intent.putExtra("nombre",nombre.getText().toString());
        intent.putExtra("apellido",apellido.getText().toString());
        intent.putExtra("departamento",departamento.getText().toString());
        intent.putExtra("fecha",fecha.getText().toString());

        startActivity(intent);

    }

}


