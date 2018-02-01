package com.example.ejerciciocontroles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbsopa, cbensalada, cbnachos, cbcarne, cbpescado;
    RadioGroup rgbebida;
    Spinner spbebidas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbsopa = (CheckBox)findViewById(R.id.cbsopa);
        cbensalada = (CheckBox)findViewById(R.id.cbensalada);
        cbnachos = (CheckBox)findViewById(R.id.cbnachos);
        cbcarne = (CheckBox)findViewById(R.id.cbcarne);
        cbpescado = (CheckBox)findViewById(R.id.cbpescado);
        rgbebida =(RadioGroup)findViewById(R.id.radiogroup_sino);
        spbebidas =(Spinner)findViewById(R.id.spbebidas);


        String [] bebidas = {"Cerveza","Vino","Fanta","Coca cola","Seven up"};

        ArrayAdapter<String>adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,bebidas);

        spbebidas.setAdapter(adaptador);







    }//FIN ON CREATE


    public void pulsarboton (View view){


        String comida="";
        if (cbsopa.isChecked()){

            comida+="sopa";
        }

        if (cbensalada.isChecked()){

            comida+="Ensalada";
        }

        if (cbnachos.isChecked()){

            comida+="Nachos";
        }

        if (cbcarne.isChecked()){

            comida+="Carne";
        }

        if (cbpescado.isChecked()){

            comida+="Pescado";
        }

        Toast.makeText(getApplicationContext(), "has elegido "+comida, Toast.LENGTH_SHORT).show();


        //EVENTO RADIOBUTTOM


        int id=rgbebida.getCheckedRadioButtonId();

        RadioButton rbseleccionado=(RadioButton)findViewById(id);
        String textoalpulsar = rbseleccionado.getText().toString();
        Toast.makeText(getApplicationContext(), "Bebida: "+textoalpulsar, Toast.LENGTH_SHORT).show();

        //EVENTO SPINNER
        String bebidaseleccionada= spbebidas.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), "Usted desea "+bebidaseleccionada, Toast.LENGTH_SHORT).show();


    }





}//NO BORRAR
