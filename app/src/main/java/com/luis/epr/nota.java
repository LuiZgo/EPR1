package com.luis.epr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class nota extends AppCompatActivity {

    private ImageView imaprov;
    private EditText epr1;
    private EditText epe1;
    private EditText epr2;
    private EditText epe2;
    private EditText eva1;
    private EditText eva2;
    private EditText eva3;
    private EditText eva4;
    private TextView nota;
    private TextView ar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        imaprov = (ImageView)findViewById(R.id.imageViewApro);
        epr1 = (EditText)findViewById(R.id.editTextEpr1);
        epe1 = (EditText)findViewById(R.id.editTextEpe1);
        epr2 = (EditText)findViewById(R.id.editTextEpr2);
        epe2 = (EditText)findViewById(R.id.editTextEpe2);
        eva1 = (EditText)findViewById(R.id.editTextEva1);
        eva2 = (EditText)findViewById(R.id.editTextEva2);
        eva3 = (EditText)findViewById(R.id.editTextEva3);
        eva4 = (EditText)findViewById(R.id.editTextEva4);
        nota = (TextView)findViewById(R.id.textViewNP);
        ar = (TextView)findViewById(R.id.textViewAR);


    }

    public void exa(View view){


        Intent exa = new Intent( this , examne.class);
        startActivity(exa);

    }

    public void refr(View view){

        Intent exa = new Intent( this , nota.class);
        startActivity(exa);

    }


    public void volv(View view){

        Intent volv = new Intent( this , MainActivity.class);
        startActivity(volv);


    }


   public void calculo(View view){


       String epr1_string = epr1.getText().toString();
       String epe1_string = epe1.getText().toString();
       String epr2_string = epr2.getText().toString();
       String epe2_string = epe2.getText().toString();
       String eva1_string = eva1.getText().toString();
       String eva2_string = eva2.getText().toString();
       String eva3_string = eva3.getText().toString();
       String eva4_string = eva4.getText().toString();


       int nota_1 = Integer.parseInt(epr1_string);
       int nota_2 = Integer.parseInt(epr2_string);
       int nota_3 = Integer.parseInt(epe1_string);
       int nota_4 = Integer.parseInt(epe2_string);

       int e_1 = Integer.parseInt(eva1_string);
       int e_2 = Integer.parseInt(eva2_string);
       int e_3 = Integer.parseInt(eva3_string);
       int e_4 = Integer.parseInt(eva4_string);

       double p_1 = nota_1 * 0.10;
       double p_2 = nota_2 * 0.15;
       double p_3 = nota_3 * 0.20;
       double p_4 = nota_4 * 0.25;

       double ev_ca = e_1 + e_2 + e_3 + e_4;
       double res = ev_ca/4;

       double evas = res * 0.30;

       double nota_pres = p_1 + p_2 + p_3 + p_4 + evas ;

       nota.setText(" " + nota_pres);

       if (nota_pres >= 55 || (p_1 > 40) || (p_2 > 40) || (p_3 > 40) || (p_4 > 40)){

           imaprov.setVisibility(view.VISIBLE);
           ar.setText("APROBADO");
           Toast apro = Toast.makeText(getApplicationContext(), "Felicitaciones Aprobaste ", Toast.LENGTH_SHORT);

           apro.show();

       }
       else if ((nota_pres <= 55) ){

           imaprov.setVisibility(view.VISIBLE);

           imaprov.setImageResource(R.drawable.lampara);
           ar.setText("A EXAMEN");
           Toast exam = Toast.makeText(getApplicationContext(), "Presiona voy a examen ", Toast.LENGTH_SHORT);

           exam.show();

       }




   }


}
